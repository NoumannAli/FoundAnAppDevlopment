package PetJava;

import java.util.Scanner;

public class Paint2 {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      double wallHeight = 0.0;
	      double wallWidth = 0.0;
	      double wallArea = 0.0;
	      double gallonsPaintNeeded = 0.0;
	      double cansNeeded = 0;
	      
	      final double squareFeetPerGallons = 350.0;
	      final double gallonsPerCan = 1.0;
	      
	      System.out.println("Enter wall height (feet): ");
	      wallHeight = scnr.nextDouble();
	      
	      // Prompt user to input wall's width
	      System.out.println("Enter wall width (feet): ");
	      wallWidth = scnr.nextDouble();                                
	      
	      // Calculate and output wall area
	      wallArea = wallHeight * wallWidth;
	       
	      
	      // Calculate and output the amount of paint in gallons needed to paint the wall
	      gallonsPaintNeeded = wallArea/squareFeetPerGallons;
	      System.out.println("Paint needed:" + gallonsPaintNeeded + " gallons");  
	      
	      // Calculate and output the number of 1 gallon cans needed.
	      cansNeeded =  (double) Math.round(gallonsPerCan/gallonsPaintNeeded);  
	      System.out.printf("Cans Needed: %.2f%n" , cansNeeded );  

	      return;
	   }

	

}

