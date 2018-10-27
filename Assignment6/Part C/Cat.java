package assignment6;

import java.util.Calendar;

public class Cat extends Pet implements Boardable {
	private String hairLength;
	private Calendar start = Calendar.getInstance();
	private Calendar end = Calendar.getInstance();
	
	public Cat(String name, String ownername, String color, String hairLength) {
		super(name, ownername, color);
		this.hairLength = hairLength;
	}
	
	public String getHairLength() {
		return hairLength;
	}
	
	@Override
	public String toString() {
		String s = "CAT: \n" + super.toString() + "\n" + "Hair: " + this.getHairLength();
		return s;
	}
	
	public void setBoardStart(int month, int day, int year) {
		start.set(year, month, day);
	}
	
	public void setBoardEnd(int month, int day, int year) {
		end.set(year, month, day);
	}
	
	//return true if the given data is between the start and end dates, otherwise return false
	public boolean boarding(int month, int day, int year) {
		Calendar date = Calendar.getInstance();
		date.set(year, month, day);
		if(date.after(start)&&date.before(end)||date.equals(start)||date.equals(end)) {
			return true;
		}else 
			return false;
	}
}
