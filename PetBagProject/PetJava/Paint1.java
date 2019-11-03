package PetJava;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.imageio.IIOException;

public class Paint1 {

	
	private static Scanner scnr;

	public static void main(String[] args) {
        scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded ;
        double cans;
        
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        
        try {	
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();
        
       
        	
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();
       
        
        
        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area:" + wallArea + "  square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Cans needed: " + gallonsPaintNeeded + " gallons");
        
        cans = gallonsPaintNeeded;
        while(wallHeight == 30 && wallWidth == 25);
               
        }catch (Exception excpt) {
            System.out.println("Invalid input Try Numerics " );
        }

	}
}
