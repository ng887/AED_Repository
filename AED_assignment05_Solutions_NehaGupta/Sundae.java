package assignment5;

public class Sundae extends IceCream {
	
	String toppingName;
	double toppingCost;
	
	public Sundae(String name, double cost, String toppingName, double toppingCost) {
		super(toppingName+ " Sundae With" + name ,cost);
		this.toppingCost = toppingCost;
	}
		
	@Override
	public int getCost() {
		int totalCost = (int) (cost + toppingCost);
		return totalCost;		
	}

}
