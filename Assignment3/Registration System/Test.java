package registration;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student("A","0001");
		Student s2 = new Student("B","0002");
		Student s3 = new Student("C","0003");
		Student s4 = new Student("D","0004");
		Course java = new Course("Java",8);
		s1.accessor();
		java.registerStudent(s1);
		s2.accessor();
		java.registerStudent(s2);
		s3.accessor();
		java.registerStudent(s3);
		s4.accessor();
		java.registerStudent(s4);	
		java.accessor();
	}

}
