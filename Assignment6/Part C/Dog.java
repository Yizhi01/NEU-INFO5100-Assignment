package assignment6;

import java.util.Calendar;

public class Dog extends Pet {
	private String size;
	private Calendar start = Calendar.getInstance();
	private Calendar end = Calendar.getInstance();
	
	public Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.size = size;
	}
	
	public String getSize() {
		return this.size;
	}
	
	@Override
	public String toString() {
		String s = "DOG: \n" + super.toString() + "\n" + "Size: " + this.getSize();
		return s;
	}
	
	public void setBoardStart(int month, int day, int year) {
		start.set(year, month, day);
	}
	
	public void setBoardEnd(int month, int day, int year) {
		end.set(year, month, day);
	}
	
	public boolean boarding(int month, int day, int year) {
		Calendar date = Calendar.getInstance();
		date.set(year, month, day);
		if(date.after(start)&&date.before(end)||date.equals(start)||date.equals(end)) {
			return true;
		}else 
			return false;
	}
}
