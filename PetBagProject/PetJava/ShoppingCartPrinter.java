package PetJava;

import java.util.Scanner;

public class ShoppingCartPrinter

{

    public static void main(String[] args) {
    	
    	int a[][] = new int[2][3];
    	a[0][0] = 100;
    	a[0][1] = 200;
    	
    	a[1][0] = 300;
    	a[1][1] = 400;
    	
    	a[2][0] = 500;
    	a[2][1] = 600;
    
     
//    for(int i = 0 ; i < a.length ; i++) {
//    	
//    	for(int j = 0  ; j < a[i].length ; j++) { 
//    		System.out.println(a[i][j]);
//    	}
//    	
//    }
    	
    	for (int r[] : a) {
    		for(int i : r) {
    			System.out.println(i);
    		}
    		
    	}
    
        
         }
    }

 

        



