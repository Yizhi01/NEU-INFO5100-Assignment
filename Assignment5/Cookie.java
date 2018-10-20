package assignment5;

public class Cookie extends DessertItem {
	private int number;
	private int pricePerDozen;
	
	public int getNumber() {
		return number;
	}
	
	public int getPricePerDozen() {
		return pricePerDozen;
	}
	
	public Cookie(String name, int num, int cents) {
		super(name);
		this.number = num;
		this.pricePerDozen = cents;
	}
	
	@Override
	public int getCost() {
		return (int)Math.round(number*pricePerDozen/12.0);
	}
	
	@Override
	 public String toString(){
		String s = (getNumber() + " @ "+ DessertShoppe.cents2dollarsAndCents(getPricePerDozen()) +" /dz." +"\n");
		s += String.format("%-" + DessertShoppe.maxNameSize + "s" + "%" + DessertShoppe.width + "s", getName(), DessertShoppe.cents2dollarsAndCents(getCost()));
		return s;
	}
}
