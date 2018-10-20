package assignment5;
import java.util.Vector;

public class Checkout {
	Vector <DessertItem> v;
	public Checkout() {
		v = new Vector<DessertItem>();
	}
	public int numberOfItems() {
		return v.size();
	}
	public void enterItem(DessertItem item) {
		v.add(item);
	}
	public void clear() {
		v.clear();
	}
	public int totalCost() {
		int sum = 0;
		for(DessertItem item:v) {
			sum += item.getCost();
		} 
		return sum;
	}
	public int totalTax() {
		return (int)Math.round((totalCost()*DessertShoppe.taxRate));
	}
	
	
	public String toString() {
		String s = "\t" +DessertShoppe.storeName + "\n";
		s +="\t--------------------\n\n";
		for(DessertItem item:v) {
			s +=item.toString() + "\n";
		}
		s += String.format("\n" + "%-" + DessertShoppe.maxNameSize + "s" + "%" + DessertShoppe.width + "s", "Tax", DessertShoppe.cents2dollarsAndCents(totalTax())+"\n");
		s += String.format("%-" + DessertShoppe.maxNameSize + "s" + "%" + DessertShoppe.width + "s", "Total Cost", DessertShoppe.cents2dollarsAndCents(totalCost()+totalTax()) + "\n");
		
		return s;
	}
}
