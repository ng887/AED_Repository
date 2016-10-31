package assignemnt6;

import java.util.*;

public class Cat extends Pet implements Boardable{

	private String hairLength;
	private Calendar boardingStartDate;
	private Calendar boardingEndDate;


	//Constructor
	public Cat (String name, String ownerName, String color, String hairLength){
		super(name, ownerName, color);
		this.hairLength=hairLength;
	}

	// returns the string hairLength
	public String getHairLength(){
		return hairLength;
	}

	/* method that returns a String that identifies the pet as Cat and returns a 
	 * complete description of the cat, including the values stored in the Pet parent class.*/ 
	
	@Override
	public String toString(){
		String s = "CAT: \n" + super.toString() + "\nHair: " + hairLength + "\n----------------";
		return  s;
	}
	
	@Override
	public void setBoardStart(int month, int day, int year){
		//boardingStartDate = new Date(year, month, day);
		boardingStartDate  = Calendar.getInstance();
		boardingStartDate.set(year, month, day);
	}
	
	@Override
	public void setBoardEnd(int month, int day, int year){
		//boardingEndDate = new Date(year, month, day);
		boardingEndDate = Calendar.getInstance();
		boardingEndDate.set(year, month, day);
	}
	
	@Override
	public boolean boarding(int month, int day, int year){
		//Date boardingDate = new Date(year,month,day);
		Calendar boardingDate = Calendar.getInstance();
		boardingDate.set(year, month, day);

		if (!boardingStartDate.after(boardingDate) && !boardingEndDate.before(boardingDate))
			/* boardingStartDate <= boardingDate <= boardingEndDate */
		{
			return true;
		}
		else
			return false;
	}
}


