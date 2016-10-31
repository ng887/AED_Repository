package assignemnt6; 	

public class Driver {

	public static void main(String[] args) {
		Dog d1 = new Dog("Spot", "Mary", "Black and White","big");
		d1.setSex(1);
		d1.setBoardStart(05,02,2016);
		d1.setBoardEnd(05,17,2016);
		
		Dog d2 = new Dog("Tommy", "Jake", "Brown","Very Big");
		d2.setSex(2);
		d2.setBoardStart(06,02,2016);
		d2.setBoardEnd(06,12,2016);
		
		Dog d3 = new Dog("Don", "Ron", "Grey","Small");
		d3.setSex(4);
		d3.setBoardStart(01,12,2016);
		d3.setBoardEnd(01,17,2016);
		 	
		Cat c1 = new Cat("Tom", "Bob", "Black", "short");
		c1.setSex(2);
		c1.setBoardStart(03,02,2016);
		c1.setBoardEnd(05,17,2016);
		
		Cat c2 = new Cat("Mylo", "Annie", "White", "long");
		c2.setSex(2);
		c2.setBoardStart(07,02,2016);
		c2.setBoardEnd(07,15,2016);
		
		Cat c3 = new Cat("Xylo", "Karen", "Black", "medium");
		c3.setSex(2);
		c3.setBoardStart(06,05,2016);
		c3.setBoardEnd(06,17,2016);
		
		AnimalHospital ah = new AnimalHospital();
		ah.animalAdd(d1);
		ah.animalAdd(d2);
		ah.animalAdd(d3);
		ah.animalAdd(c1);
		ah.animalAdd(c2);
		ah.animalAdd(c3);
		ah.printPetInfoByName("Spot");
		ah.printPetInfoByName("Mylo");
		ah.printPetInfoByOwner("Karen");
		ah.printPetInfoByOwner("Bob");
		ah.printPetsBoarding(07, 10, 2016);
		
				
	}

}
