package assignment5;

public class DessertShoppe {
	static double taxRate = 6.5;
	static String storeName = "M & M Dessert Shoppe";
	static int maxSizeItemName = 22;
	static int width = 10;
	
	
	public static String cents2dollarsAndCents(int cents){
		
		String result="";
		
		int dollar = cents/100;
		cents = cents % 100;
		
		result = dollar+".";
		if(cents < 10)
			result = result + "0" + cents;
		else
			result = result+cents;
		return result;
	}
	 
}
