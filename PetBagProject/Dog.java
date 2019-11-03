import java.util.Scanner;

public class Dog {
	public int dogSpaceNbr;
	public static double dogWeight;
	public double grooming;
	public String petType;
	public static String petName;
	public int petAge;
	public int dogSpace;
	public int daysStay;
	public double amountDue;

	public Dog(String PetName, String petType) {
		this.petName = petName;
		this.petType = petType;

	}

	// This Method will set dog name
	public String setDogName(String petName) {
		petName = petName;
		System.out.println("The pet name is now set too: " + petName);
		return petName;
	}

	// This Method will get dog name
	public String getDogName(String petName) {
		petName = petName;
		System.out.println("The pet name is: " + petName);
		return petName;
	}

	// This method will get dog age
	public int getDogAge(int petAge) {
		this.petAge = petAge;
		System.out.println("The pet age is: " + petAge);
		return petAge;

	}

	// This method will set dog age
	public int setDogAge(int petAge) {
		this.petAge = petAge;
		System.out.println("The pet age is set too: " + petAge);

		return petAge;

	}

	// This method will get dog space number
	public int getDogSpaceNbr(int dogSpaceNbr) {
		this.dogSpaceNbr = dogSpaceNbr;
		System.out.println("The Dog spacenumber is: " + dogSpaceNbr);
		return dogSpaceNbr;
	}

	// This method will get dog weight
	public double getDogWeight(double dogWeight) {
		this.dogWeight = dogWeight;
		System.out.println("The Dog weight is: " + dogWeight);
		return dogWeight;
	}

	// This method will set Dog weight
	public double setDogWeight(double dogWeight) {
		this.dogWeight = dogWeight;
		System.out.println("The Dog weight is now set too: " + dogWeight);
		return dogWeight;

	}

	// This methode will set dog space number

	public int setDogSpaceNbr(int dogSpaceNbr) {
		this.dogSpaceNbr = dogSpaceNbr;
		System.out.println("The Dog Spacenumber is now set too: " + dogSpaceNbr);
		return dogSpaceNbr;
	}

	// This is Constructor

	public Dog() {

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.setDogWeight(18.00);
		dog.getDogSpaceNbr(8);
		dog.getDogAge(3);
		dog.setDogAge(4);
		dog.setDogSpaceNbr(9);
		dog.getDogWeight(20.00);
		dog.getDogName("Charlie");
		dog.setDogName("jackie");

		// Calling checkout method from pet class
		Pet pet = new Pet();
		pet.checkOut();

	}

}
