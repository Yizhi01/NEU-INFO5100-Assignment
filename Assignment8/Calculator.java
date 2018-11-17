package assignment8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator extends JFrame implements ActionListener{
	private final String[] s = {
			"7", "8", "9", "/",
			"4", "5", "6", "¡Á",
			"1", "2", "3", "-",
			".", "0", "=", "+"};
	
	private JButton [] buttons = new JButton[s.length];//buttons for operators and numbers
	private JButton reset = new JButton("C");//button for reset
	private JTextField result = new JTextField("0");//result text field
	
	private Font font;
	
	public Calculator() {
		super("Calculator");
		font = new Font("TimesRoam",Font.PLAIN, 40);
		
		//add components
		JPanel pnlHead = new JPanel(new BorderLayout());
		pnlHead.add(result, BorderLayout.CENTER);
		pnlHead.add(reset, BorderLayout.EAST);
		result.setFont(font);
		reset.setFont(font);
		
		JPanel pnlBody = new JPanel(new GridLayout(4,4));
		for(int i = 0; i<s.length; i++) {
			buttons [i] = new JButton(s [i]);
			buttons [i].setFont(font);
			pnlBody.add(buttons[i]);
		}
		
		//set layout
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add("North", pnlHead);
		getContentPane().add("South", pnlBody);
		
		//register listeners
		for(int i = 0; i<s.length; i++) {
			buttons[i].addActionListener(this);
		}
		reset.addActionListener(this);
		result.addActionListener(this);
		
		//display
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		if (e.getSource() == reset) {
			handleReset();
		}else if("0123456789.".indexOf(cmd)>0) {
			handleNumber(cmd);
		}else {
			handleOperator(cmd);
		}
	}
	
	boolean isFirstNum = true;
	double number = 0.0;
	String operator = "=";
	
	public void handleNumber(String key) {
		if(isFirstNum)
			result.setText(key);
		else if(!key.equals("."))
			result.setText(result.getText()+key);
		else if(result.getText().indexOf(".") < 0)
			result.setText(result.getText()+".");
		isFirstNum = false;
	}
	
	public void handleReset() {
		result.setText("0");
		isFirstNum = true;
		operator = "=";
	}
	
	public void handleOperator(String cmd) {
		double input = Double.valueOf(result.getText());
		if(operator == "+") {
			number += input;
		}
		if(operator == "-") {
			number -= input;
		}
		if(operator == "¡Á") {
			number *= input;
		}
		if(operator == "/") {
			number /= input;
		}
		if(operator == "=") {
			number = input;
		}
		result.setText(String.valueOf(number));
		operator = cmd;
		isFirstNum = true;
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
	}
}
