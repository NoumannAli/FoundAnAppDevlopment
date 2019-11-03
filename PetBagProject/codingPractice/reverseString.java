package codingPractice;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String firstName =  scan.next();
//		
//		int len = firstName.length();
//		
//		for(int i = len-1; i>=0;i--) {
//			
//			char rev = firstName.charAt(i);
//			
//			System.out.print(rev);
		
//		int len = firstName.length();
//		
//		for(int i = len-1 ; i>=0;i--) {
//			char rev = firstName.charAt(i);
//			System.out.print(rev);
		
//	}	
		
//	String rev = "";
//	
//	int len = firstName.length();
//	
//	for(int i=len-1;i>=0;i--) {
//		
//		rev=rev+firstName.charAt(i);
//		
//	}
//		System.out.println(rev);
		
		
//		StringBuffer sb = new StringBuffer(firstName);
//		
//		StringBuffer rev =  sb.reverse();
//		System.out.println(rev);
//		
 String orgString =  firstName;
 String rev ="";
 
 int len = firstName.length();
 
 for(int i =len-1;i>=0;i--) {
	 rev=rev+firstName.charAt(i);
 }
		if(orgString.equals(rev)) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("String is not palindrom");
		}
	}

}
