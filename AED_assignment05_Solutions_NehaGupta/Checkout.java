package assignment5;

import java.util.Vector;

public class Checkout {

	//DessertItem items;
	Vector<DessertItem> items = new Vector<DessertItem>();
	int totalItems;
	int total;
	int totalTax;

	//Creates a Checkout instance with an empty list of DessertItem's
	public Checkout(){
		totalItems = 0;
	}

	//Returns the number of DessertItem's in the list
	public int numberOfItems(){
		return totalItems;
	}

	//A DessertItem is added to the end of the list of items
	public void enterItem(DessertItem item){
		items.add(item);
		totalItems++; 	
	}

	//Clears the Checkout to begin checking out a new set of items
	public void clear(){
		items.clear();
		totalItems = 0;
	}

	//Returns total cost of items in cents (without tax)
	public int totalCost(){
		total = 0;
		for (DessertItem item : items){
			total = total + item.getCost();
		}
		return total;
	}

	//Returns total tax on items in cents
	public int totalTax(){

		totalTax = 0;
		totalTax = totalTax + (int)Math.round(this.totalCost() * (DessertShoppe.taxRate)/100)   ;
		return totalTax;
	}

	//Returns a String representing a receipt for the current list of items
	@Override
	public String toString(){
		String receipt = DessertShoppe.storeName +  "\n--------------------\n" ;

		int width = DessertShoppe.width;
		int limit = DessertShoppe.maxSizeItemName;

		for (DessertItem item : items){

			String prefix  = "\n";
			String modifiedName = item.getName();
			if (item instanceof Candy){
				int candyPrice = (int)(((Candy) item).pricePerPound);
				prefix += (String.format("%.2f",((Candy) item).weight)) + " lbs. @ " + DessertShoppe.cents2dollarsAndCents(candyPrice) + " /lb.";
			}
			if (item instanceof Cookie){
				int cookiePrice = (int)(((Cookie) item).pricePerDozen);
				prefix += (((Cookie) item).quantity) + " @ " + DessertShoppe.cents2dollarsAndCents(cookiePrice) + " /dz.";
			}
			if(item instanceof Sundae){
				String substr = "With";
				prefix += item.getName().substring(0,item.getName().indexOf(substr) + substr.length());
				modifiedName = item.getName().substring(item.getName().indexOf(substr)+ substr.length());
			}
			if (prefix.length() < limit) {
				prefix = String.format("%1$-"+limit+ "s", prefix);
			}
			if (prefix.length()> 0)
				receipt += prefix + "\n";


			if (modifiedName.length() < limit) {
				modifiedName = String.format("%1$-"+limit+ "s", modifiedName);
			}

			receipt += modifiedName;
			String costString = DessertShoppe.cents2dollarsAndCents(item.getCost());
			costString = String.format("%1$"+ (width) + "s", costString );
			receipt += costString; 
		}
		String totalBill = DessertShoppe.cents2dollarsAndCents(totalCost()+totalTax() );

		String finalTax = DessertShoppe.cents2dollarsAndCents(totalTax());
		finalTax = finalTax.replaceFirst("^0+(?!$)", "");
		receipt += "\n\n";
		receipt += String.format("%1$-"+limit+ "s", "Tax");
		receipt += String.format("%1$"+ width + "s", finalTax)+ "\n";
		receipt += String.format("%1$-"+limit+ "s", "Total Cost") ;
		receipt += String.format("%1$"+ width + "s",totalBill);
		return receipt; 


	}
}
