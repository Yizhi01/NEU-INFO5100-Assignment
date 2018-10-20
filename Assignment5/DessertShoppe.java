package assignment5;

public class DessertShoppe {
	public final static double taxRate = 0.065; 
	public final static String storeName = "M & M Dessert Shoppe";
	public final static int maxNameSize = 25;//the maximum size of an item name
	public final static int width = 8;//the width used to display the costs of the items on the receipt
	
	public static String cents2dollarsAndCents(int cents) {
		String s = "";
		if (cents<0) {
			s += "-";
			cents *= -1;
		}
		int dollars = cents/100;
		cents = cents%100;
		if (dollars > 0) {
			s += dollars;
		}
		s +=".";
		if (cents<10) {
			s += "0";
		}
		s += cents;
		return s;
	}
	
}
