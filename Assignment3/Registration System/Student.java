package registration;

public class Student {
	private String name;
	private String id;
	public Student(String name, String id) {
		this.name = name;
		this.id =id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void accessor() {
		Student s = new Student(name, id);
		System.out.println("Student Name: " + s.getName() +'\n'+"Student ID: " + s.getId() );
	}
	
}
