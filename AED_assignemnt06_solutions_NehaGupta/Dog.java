package assignemnt6;

import java.util.Calendar;

public class Dog extends Pet implements Boardable{
	
	
	private String size;
	private Calendar boardingStartDate;
	private Calendar boardingEndDate;
	
	// Constructor must set the size. Do not forget to call super.
	public Dog (String name, String ownerName, String color, String size){
		super(name, ownerName, color);
		this.size = size;
	}
	 
	// returns the string size String
	public String getSize(){
		return size;
	}
	
	
	/* method that returns a String that identifies the pet as Dog and returns a complete description of the dog, including the values stored in the Pet parent class. */ 
	@Override
	public String toString(){
		String s = "DOG: \n" + super.toString() + "\nSize: " + size + "\n----------------";
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
