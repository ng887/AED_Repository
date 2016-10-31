package assignemnt6;

public class Pet {
	private String name,ownerName,color;
	public static final int MALE = 1;
	public static final int FEMALE = 2;
	public static final int SPAYED = 3;
	public static final int NEUTERED = 4;
	
	protected int sex;
	
	//Constructor 
	public Pet (String name, String ownerName, String color){
		this.name = name;
		this.ownerName=ownerName;
		this.color=color;
	}
	
	public String getPetName(){
		return name;
	}
	
	public String getOwnerName(){
		return ownerName;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setSex(int sexid){
		this.sex=sexid;
	}
	
	// Should return the string equivalent of the gender, e.g the string “MALE” etc. 
	public String getSex(){
		if(sex == MALE){
			return "Male";
		}
		else if(sex == FEMALE){
			return "Female";
		}
		else if (sex == SPAYED){
			return "Spayed";
		}
		else if (sex == NEUTERED){
			return "Neutered";
		}
		else 
			return "Invalid";
	}
	
	// Should return the name, owner’s name, age, color, and gender (use getSex()); 
	public String toString(){
		String s = "";
		s = name + " owned by " + ownerName  + "\nColor: " + color + "\nSex: " + getSex();
		return s;
	}

	

}
