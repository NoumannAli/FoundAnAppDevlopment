package PetJava;

import java.util.Scanner;
//corgi class
public class Corgi {
	int weight;
	int age;
	Scanner scnr = new Scanner (System.in);
	// methods to set pet weight
	public int setWeight(int pounds) {
		
		System.out.println(" And weighs " + pounds + " pounds.");
		return pounds;
		
	}
	// method to set pet age
 public int setAge(int years) {
	
	 System.out.print("The Corgi is " + years + " years old");
	 
	 return years;
 }
}


