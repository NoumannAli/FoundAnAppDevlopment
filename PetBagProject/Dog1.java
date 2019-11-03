import java.util.Scanner;

public class Dog1 {
	String type ;
		String breed;
		String name;
		String topTrick;
Scanner scnr = new Scanner(System.in);		



public Dog1(String type, String name, String breed){
	
	this.type = type;
	this.breed = breed;
	this.name = name;
	System.out.println("Please enter your dog type");
	type = scnr.nextLine();
	System.out.println("Please enter your dog breed");
	breed = scnr.nextLine();
	System.out.println("Please enter your dog name");
	name = scnr.nextLine();


	
	System.out.println("You Dog type is: " + type + "\n" + "Your pet breed is: " + breed + "\n" + "Your pet name is: " + name + "\n" );
	
}

public void setTopTrick() {
	this.topTrick = topTrick;
	System.out.println("Please Enter to set your pet Top Trick");
	topTrick = scnr.nextLine();
	System.out.println("Your Pet's top trick is set too: " + topTrick);
	
	
}
public static void main(String[] args) {
	Dog1 dog = new Dog1("Danger" , "jake", "pug");
	
	dog.setTopTrick();
	
	
	
	
		
	
	
}
	
}
