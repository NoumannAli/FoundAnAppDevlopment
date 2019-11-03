package PetJava;

import java.util.Date;

// driver class
public class DriverClass {


// main method
	public static void main(String[] args) {

		// Calling rescue animal class to use its setter and getter
		RescueAnimal rescue = new RescueAnimal();
		rescue.toString();
		

		// Calling Monkey class to use its setter and getter
		Monkey monkey = new Monkey();
		Date date =  new Date();
		monkey.toString();
		monkey.setName("Bonnie");
		monkey.setType("Capuchin");
		monkey.setAge(3);
		monkey.setGender("M");
		monkey.setAcquisitionSource("abc");
		monkey.setAcquisstionDate(date);
		monkey.setInServiceAgency("xyz");
		monkey.setInServiceCity("New York");
		monkey.setInServiceEmail("abc@yahoo.com");
		monkey.setInServiceCountry("usa");
		monkey.setInServicePhone("0102020202");
		monkey.setStatusDate(date);
		monkey.setInServicePOC("xyz");
		monkey.setInServicePostalAddress("111 ny bk");
		monkey.setTrainingEnd(date);
		monkey.setWeight(5);
		monkey.setTrainingStatus("active");
		
		
		
		
		
		

	}

}
