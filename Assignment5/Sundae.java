package assignment5;

public class Sundae extends IceCream {
	private int toppingPrice;
	private String toppingName;
	
	public Sundae(String name, int IceCreamPrice, String toppingName, int toppingPrice) {
		super(name, IceCreamPrice);
		this.toppingName = toppingName;
		this.toppingPrice = toppingPrice;
	}
	
	public int getCost() {
		return toppingPrice + getPrice();
	}
	
	@Override
	 public String toString(){
		String s = this.toppingName + " Sundae with\n";
		s += String.format("%-" + DessertShoppe.maxNameSize + "s" + "%" + DessertShoppe.width + "s", getName(), DessertShoppe.cents2dollarsAndCents(getCost()));
		return s;
	}
}
