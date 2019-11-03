package FoundAnApp;

import java.util.Scanner;

public class twoMatrices {
	

	public static void main(String[] args) {
		int numberofRows;
		int numberofcolums;
		
		Scanner scanner = null;
		
		try {
				scanner = new Scanner(System.in);
			
			System.out.println("please enter row of matrix");
			numberofRows = scanner.nextInt();
			System.out.println("please enter number of colums");
			numberofcolums = scanner.nextInt();
			int matrix1[][] = new int [numberofRows][numberofcolums];
			int matrix2[][] = new int [numberofRows][numberofcolums];
			int Result[][] = new int[numberofRows][numberofcolums];
		
			System.out.println("Enter elements of first matrix");
			for(int i = 0 ; i< numberofRows ; i++) {
				for(int j = 0 ; j<numberofcolums;j++) {
					matrix1[i][j] = scanner.nextInt();
			
					
				}
			}
			System.out.println("first matrix is");
			for(int i = 0 ; i< numberofRows ; i++) {
				for(int j = 0 ; j<numberofcolums;j++) {
					System.out.println(" " + matrix1[i][j] + "\t");
				}
				System.out.println();
					
			
	}
			System.out.println("please enter second matrix");
			for(int i =0 ; i < numberofRows;i++) {
				for(int j =0 ; j < numberofcolums;i++) {
					matrix2[i][j] = scanner.nextInt();
				}
			}
			System.out.println("Second matrix is");
			for(int i =0 ; i < numberofRows;i++) {
				for(int j =0 ; j < numberofcolums;j++) {
					System.out.println(" " + matrix2[i][j] + "\t");
				}
				System.out.println();
				}}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("invalid entry " + e );
				}
		
	}
	}