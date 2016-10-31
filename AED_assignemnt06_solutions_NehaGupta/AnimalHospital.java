package assignemnt6;

import java.util.ArrayList;

public class AnimalHospital {

	private ArrayList<Pet> Animals = new ArrayList<Pet>();
	
	public void animalAdd(Pet p){
		Animals.add(p);
	}
	
	public void printPetInfoByName(String name){
		for(int i = 0 ; i < Animals.size() ; i++){
			if(Animals.get(i).getPetName() == name) {
				System.out.println(Animals.get(i));
			}
		}
	}
	
	public void printPetInfoByOwner(String name){
		for(int i = 0 ; i < Animals.size() ; i++){
			if(Animals.get(i).getOwnerName() == name) {
				System.out.println(Animals.get(i));
			}
		}
		
	}
	
	public void printPetsBoarding(int month, int day, int year){
		for(int i = 0 ; i < Animals.size(); i++){
			Pet a = Animals.get(i);
			if (a instanceof Dog){
				if (((Dog) a).boarding(month, day, year)){
					System.out.println(a);
				}
			}
			else if (Animals.get(i) instanceof Cat) {
				if (((Cat) a).boarding(month, day, year)) {
					System.out.println(a);
				}
			}
		}
	}

}
