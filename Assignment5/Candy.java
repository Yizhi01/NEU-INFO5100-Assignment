package assignment5;

public class Candy extends DessertItem {
	private double weight;
	private int pricePerPound;
	
	public Candy(String name, double weight,int cents) {
		super(name);
		this.weight = weight;
		this.pricePerPound = cents;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public int getPricePerPound() {
		return pricePerPound;
	}
	
	@Override
	public int getCost() {
		return (int)Math.round(weight*pricePerPound);
	}
	
	@Override
	 public String toString(){
		String s = (getWeight() + " lbs. @ " + DessertShoppe.cents2dollarsAndCents(getPricePerPound()) +" /lb." +"\n");
		s += String.format("%-" + DessertShoppe.maxNameSize + "s" + "%" + DessertShoppe.width + "s", getName(), DessertShoppe.cents2dollarsAndCents(getCost()));
		return s;
	}
}
