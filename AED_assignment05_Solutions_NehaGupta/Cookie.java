package assignment5;

public class Cookie extends DessertItem {
	
	int quantity;
	double pricePerDozen;
	
	public Cookie(String name, int quantity, double pricePerDozen){
		super(name);
		this.quantity = quantity;
		this.pricePerDozen = pricePerDozen;
	}

	@Override
	public int getCost() {
		int totalCost = (int)Math.round((quantity * pricePerDozen)/ 12);
		return totalCost;
	}

}
