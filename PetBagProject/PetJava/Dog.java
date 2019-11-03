package PetJava;

import java.util.Scanner;
//dog class
public class Dog {
	String type ;
	String breed;
	String name;
	String topTrick;
Scanner scnr = new Scanner(System.in);		


// constructor
public Dog(String type, String name, String breed){

this.type = type;
this.breed = breed;
this.name = name;




System.out.println( type + " " + breed + " " + name );

}
// set pet top trick method
public void setTopTrick(String topTrick) {
	this.topTrick = topTrick;
	
	System.out.println("The Top trick is:" + topTrick);

}
}
