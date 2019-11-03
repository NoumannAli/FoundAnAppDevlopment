package PetJava;

import java.util.Scanner;

public class shoppingcart {

	public static void main(String[] args) {
		String[] myGrades = {"90","100","200","300"};
		int[] myNumerics = new int[myGrades.length];
		
		for(int i=0;i<myNumerics.length;i++) {
			myNumerics[i] = Integer.parseInt(myGrades[i]);
			
			
		}
		
          System.out.println(myNumerics[2]);
	}

}
