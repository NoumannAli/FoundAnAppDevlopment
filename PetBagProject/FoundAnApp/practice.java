package FoundAnApp;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class practice {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		Scanner scan = new Scanner(System.in);
//		int age;
//		System.out.println("please enter your age");
//		age = scnr.nextInt();
//		if(age >=18) {
//			System.out.println("Eligible for vote");
//		}else {
//			System.out.println("Not eligible for vote");
//		}
		
//		int num;
//		System.out.println("please enter your number");
//		num = scnr.nextInt();
//		
//		if(num%2 == 0 ) {
//			System.out.println("Even Number");
//		}else {
//			System.out.println("Not even number");
//		}
//		int age ;
//		System.out.println("please enter you age");
//		age = scnr.nextInt();
//		
//		for(int i = 0 ;i >= age ; i++) {
//			age = scnr.nextInt();
//
//			System.out.println("eligble for vote");
//			if(age < 18) {
//				System.out.println("Try Again next year you are UnderAge");
//			}
			
//		do {
//			System.out.println("please enter your age");
//			age = scnr.nextInt();
//			if(age >=18) {
//				
//			
//			System.out.println("you are eligble for vote");
//			}else {
//				System.out.println("you are not elegible for vote");
//			}
//			
//		}while(age >=18);
		
//		

//		int a[][]= new int[3][2];
//		a[0][0] = 100;
//		a[0][1]=200;
//		a[1][0]=300;
//		a[1][1]=400;
//		a[2][0]=500;
//		a[2][1]=600;
		
//		for(int i=0;i<=a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				System.out.println(a[i][j]);
//				
//			}
//		}
//		

//		String password;
//		System.out.println("please enter password");
//		password=scnr.next();
//		if(password.contains(",")) {
//			System.out.println("You password contains comma try diffrent password");
//		}else {
//			System.out.println("you are logged in");
//		}
		
//		int c[]= {100,200,300};
//		
//		for(int i : c) {
//			if(i == 200) {
//				System.out.println(i);
//				break;
//				
//			}
//					
//		
	
//	
                                                   //ARRAY LIST
//ArrayList<String> al=new ArrayList();  
//al.add("Ravi");  
//al.add("Vijay");    
//al.add("Ajay");  
// //Traversing list through for-each loop  
//
//for(String obj:al)  
//	if(obj == "Ravi")
//  System.out.println(obj);  
//}  
		
		
		
		int T = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < T; i++) {
		    String myString = scan.nextLine();
		    String even = "";
		    String odd = "";
		    for (int j = 0; j < myString.length(); j++) {
		        if (j % 2 == 0) {
		            even += myString.charAt(j);
		        } else {
		            odd += myString.charAt(j);
		        }
		    }

		    System.out.println(even + " " + odd);
		}
		
		
		}
}

	
	

