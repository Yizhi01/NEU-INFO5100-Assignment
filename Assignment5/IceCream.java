package assignment5;

public class IceCream extends DessertItem {
	private int price;

	public IceCream(String name, int cents) {
		super(name);
		this.price = cents;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public int getCost() {
		return this.getPrice();
	}

}
