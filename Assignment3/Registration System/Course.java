package registration;
//score 5/5
public class Course {
	private String name;
	private int numberOfStudent;
	private Student[] students = new Student[10];
	
	public Course(String name, int num) {
		this.name = name;
		numberOfStudent = num;
	}
	
	public String getName() {
		return name;
	}
	public void setCourseName(String name) {
		this.name = name;
	}
	public int getNumOfStudent() {
		return numberOfStudent;
	}
	public void setNumOfStudent(int num) {
		numberOfStudent = num;
	}
	//return the array of registered students
	public Student[] getStudents() {
		return students;
	}
	
	//check if the course is full
	public boolean isFull() {
		if(numberOfStudent >=10) {
			System.out.println("This course is full.");
			return true;
		}else {
			System.out.println("This course is available.");
			return false;
		}
	}
	
	//For the title and numberOfStudent field
	public void accessor() {
		Course a = new Course(name, numberOfStudent);
		String title = a.getName() ;
		int n = a.getNumOfStudent();
		System.out.println("Course Name: " + title +'\n'+"Number of registrated student: " + n );
	}
	
	//Register a student if the course is not full
	public void registerStudent(Student s) {
		if(numberOfStudent <10) {
			students[numberOfStudent] = s;
			numberOfStudent++;
			System.out.println("Successfully registered.");
		}else {
			System.out.println("This course is full, registration failed.");
		}
	}
	
}
