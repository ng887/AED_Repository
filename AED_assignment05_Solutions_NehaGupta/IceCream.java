package assignment5;

public class IceCream extends DessertItem {
	double cost;
	
	public IceCream(String name, double cost){
		super(name);
		this.cost=cost;
	}
	
	
	@Override
	public int getCost() {
		int totalCost = (int) cost;
		return totalCost;
	}

}
