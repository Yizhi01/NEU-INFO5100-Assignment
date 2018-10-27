package assignment6;

public class Pet {
	private String PetName, OwnerName, Color;
	protected int Sex;
	public static final int male = 0, female = 1, spayed = 2, neutered = 3;  
	
	public Pet(String name, String oname, String color) {
		PetName = name;
		OwnerName = oname;
		Color = color;
	}
	
	public String getPetName() {
		return this.PetName;
	}
	
	public String getOwnerName() {
		return this.OwnerName;
	}
	
	public String getColor() {
		return this.Color;
	}
	
	public void setSex(int sexid) {
		this.Sex = sexid;
	}
	
	public String getSex() {
		if(Sex == 0)
			return "Male";
		if(Sex == 1)
			return "Female";
		if(Sex == 2)
			return "Spayed";
		if(Sex == 3)
			return "Neutered";
		else
			return "Unknown";
	}
	
	public String toString() {
		return this.getPetName() + " owned by " + this.getOwnerName() +"\n" + "Color: " + this.getColor() + "\n" + "Sex: " + this.getSex();
	}
	
}
