package assignment8;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class StudentsApplication extends JFrame {

	private JTable studentsTable;
	private StudentsTableModel model;
	private JScrollPane jsp;
	
	private JLabel idLabel, fnameLabel, lnameLabel, genderLabel;
	private JTextField idText, fnameText, lnameText, genderText;
	private JButton add;
	private Font font;
	private Students students;
	

	public static void main(String[] args) {
		new StudentsApplication();

	}


	public StudentsApplication() {
		students = new Students();
		
		createComponents();
		addComponents();
		addBehaviors();
		display();
		
	}
	
	private void createComponents() {
		
		font = new Font("TimesRoman",Font.PLAIN, 15);
		
		idLabel = new JLabel("Student ID");
		fnameLabel = new JLabel("First Name");
		lnameLabel = new JLabel("Last Name");
		genderLabel = new JLabel("Gender");
		
		idText = new JTextField(10);
		idText.setFont(font);
		fnameText = new JTextField(10);
		fnameText.setFont(font);
		lnameText = new JTextField(10);
		lnameText.setFont(font);
		genderText = new JTextField(10);
		genderText.setFont(font);
		
		add = new JButton("Add");
	}
	
	private void addComponents() {
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,2));
		panel.add(idLabel);
		panel.add(idText);
		panel.add(fnameLabel);
		panel.add(fnameText);
		panel.add(lnameLabel);
		panel.add(lnameText);
		panel.add(genderLabel);
		panel.add(genderText);
		
	    model = new StudentsTableModel(students);
		studentsTable = new JTable(model);
		jsp = new JScrollPane(studentsTable);
		Container c = getContentPane();
		
		c.add(BorderLayout.NORTH,panel);
		c.add(BorderLayout.CENTER, add);
		c.add(BorderLayout.SOUTH,jsp);
		
	}
	
	private void display() {
		setSize(600,600);
		setVisible(true);
	}
	
	class buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String id = idText.getText();
			String fName = fnameText.getText();
			String lName = lnameText.getText();
			String gender = genderText.getText();
			Student student = new Student(id, fName, lName, gender);
			students.addStudent(student);
			studentsTable.updateUI();
			idText.setText("");
			fnameText.setText("");
			lnameText.setText("");
			genderText.setText("");
			
		}
	}
	
	private void addBehaviors() {
		buttonListener button = new buttonListener();
		add.addActionListener(button);
	}
	
}	

class Students {
	private Collection<Student> students = new ArrayList<Student>();

	public Collection<Student> getStudents() {
		return students;
	}

	public void addStudent(Student s) {
		students.add(s);
	}

	public int getNumberOfStudents() {
		return getStudents().size();
	}

}

class Student {
	String id;
	String fName;
	String lName;
	String gender;

	public Student(String id, String fName, String lName, String gender) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
	}
}

class StudentsTableModel implements TableModel {

	private Students students;

	public StudentsTableModel(Students students) {
		this.students = students;
	}

	@Override
	public int getRowCount() {
		return students.getNumberOfStudents();
	}

	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public String getColumnName(int columnIndex) {
		if (columnIndex == 0) {
			return "Student ID";
		}
		if (columnIndex == 1) {
			return "First Name";
		}
		if (columnIndex == 2)
			return "Last Name";
		if (columnIndex == 3)
			return "Gender";
		return null;
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {

		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Collection<Student> s = students.getStudents();
		int row = -1;
		for (Student student : s) {
			row++;
			if (row == rowIndex) {
				if (columnIndex == 0) {
					return student.id + "";
				}
				if (columnIndex == 1) {
					return student.fName;
				}
				if (columnIndex == 2) {
					return student.lName;
				}
				if (columnIndex == 3) {
					return student.gender;
				}
			}
		}
		return null;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}
}

