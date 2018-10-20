package assignment5;

public abstract class DessertItem {
	protected String name;
	
	//Null constructor for DessertItem class
	public DessertItem() {
		this( "" );
	}
	
	//Initializes DessertItem data
	public DessertItem(String name) {
		this.name = name;
	}
	public final String getName() {
		return name;
	}
	public abstract int getCost();
	
	@Override
	 public String toString(){
		return String.format("%-" + DessertShoppe.maxNameSize+"s" + "%" + DessertShoppe.width + "s", getName(), DessertShoppe.cents2dollarsAndCents(getCost()));
	 }
}
