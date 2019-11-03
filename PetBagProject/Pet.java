import java.util.Scanner;

public class Pet {
	// Inherited Dog class...
	Dog dog = new Dog();

//Create variables
	static String petType;
	static String petName;
	static int petAge;
	int dogSpace;
	int catSpace;
	int daysStay;
	double amountDue;

	// declare scanner
	Scanner scnr = new Scanner(System.in);
	// method for check-In

	public void checkIn() {
		System.out.println("please enter pet type");
		petType = scnr.nextLine();

		System.out.println("Please Enter pet name");
		petName = scnr.nextLine();

		System.out.println("Please Enter pet age");
		petAge = scnr.nextInt();

		System.out.println("Please Enter Dog weight");
		dog.dogWeight = scnr.nextDouble();

		System.out.println("Please Enter how many days dog will stay");
		daysStay = scnr.nextInt();

		System.out.println("You have succesfully created the pet:" + "\n" + "Your pet Type is: " + petType + "\n"
				+ "Your pet age is: " + petAge + "\n" + "Your pet name is: " + petName + "\n" + "You pet Weight is: "
				+ dog.dogWeight + "lb");

	}

	// getPet method
	public void getPet() {
		System.out.println("please enter pettype");
		petType = scnr.nextLine();

		System.out.println("Please Enter pet name");
		petName = scnr.nextLine();

		System.out.println("Please Enter pet age");
		petAge = scnr.nextInt();

		System.out.println("Please Enter Dog weight");
		dog.dogWeight = scnr.nextDouble();

		System.out.println("You have succesfully created the pet:" + "\n" + "Your pet Type is: " + petType + "\n"
				+ "Your pet age is: " + petAge + "\n" + "Your pet name is: " + petName + "\n" + "You pet Weight is: "
				+ dog.dogWeight + "lb");

	}
	

	// CheckOut Method
	public void checkOut() {
		System.out.println("please enter pet type");

		petType = scnr.nextLine();

		System.out.println("Please Enter pet name");

		petName = scnr.nextLine();

		System.out.println("Please Enter pet age");
		petAge = scnr.nextInt();

		System.out.println("Please Enter Dog weight");
		dog.dogWeight = scnr.nextDouble();

		System.out.println("Please Enter how many days your dogs stayed");
		daysStay = scnr.nextInt();

		if (daysStay >= 2) {
			amountDue = (daysStay * 34) + 29;
			System.out.println("You have succesfully checked out PetBag 'See You Soon': " + "\n" + "Your Pet type Is: "
					+ petType + "\n" + "Your pet age is: " + petAge + "\n" + "Your pet name is: " + petName + "\n"
					+ "You pet Weight is: " + dog.dogWeight + "lb" + "\n" + "Your Dog Stayed in PetBag: " + daysStay
					+ " Day/s");

			System.out.println("Your Amount Due is: " + amountDue);

		} else {
			amountDue = (daysStay * 34);
			System.out.println("Your Amount Due is: " + amountDue);
		}

	}

	// UpdatePet Method
	public void updatePet() {
		System.out.println("please enter pet type");
		petType = scnr.nextLine();

		System.out.println("Please Enter pet name");
		petName = scnr.nextLine();

		System.out.println("Please Enter pet age");
		petAge = scnr.nextInt();

		System.out.println("Please Enter Dog weight");
		dog.dogWeight = scnr.nextDouble();

		System.out.println("PetBag have succesfully updated the pet:" + "\n" + "Your pet Type is: " + petType + "\n"
				+ "Your pet age is: " + petAge + "\n" + "Your pet name is: " + petName + "\n" + "You pet Weight is: "
				+ dog.dogWeight + "lb");

	}

	// Create pet method
	public void createPet() {
		System.out.println("please enter pet type");
		petType = scnr.nextLine();

		System.out.println("Please Enter pet name");
		petName = scnr.nextLine();

		System.out.println("Please Enter pet age");
		petAge = scnr.nextInt();

		System.out.println("Please Enter Dog weight");
		dog.dogWeight = scnr.nextDouble();
		System.out.println("You have succesfully created the pet:" + "\n" + "Your pet Type is: " + petType + "\n"
				+ "Your pet age is: " + petAge + "\n" + "Your pet name is: " + petName + "\n" + "You pet Weight is: "
				+ dog.dogWeight + "lb");

	}

	// Constructer
	public Pet() {

	}

	public static void main(String[] args) {

		Pet pet = new Pet();

//   	pet.checkIn();
//   	
//   	System.out.println("************************************");
//		
		pet.checkOut();
		System.out.println("************************************");
//		
//		pet.createPet();
//		
//		System.out.println("************************************");
//		
//		
//		pet.getPet();
//		
//		System.out.println("************************************");
//		
//		pet.updatePet();
//	System.out.println("************************************");

	}

}
