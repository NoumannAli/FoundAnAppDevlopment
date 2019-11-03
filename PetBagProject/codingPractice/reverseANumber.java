package codingPractice;

import java.util.Scanner;

public class reverseANumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers: ");
//		int num = scan.nextInt();
		
//		int rev=0;
//		
//		while(num !=0){
//			rev=rev*10 + num%10;
//			num=num/10;
//		}
		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		
//		StringBuffer rev = sb.reverse();
//       System.out.println(rev);
       
       
//       String name = scan.next();
		
//       
//       StringBuffer sb1 = new StringBuffer(name);
//       StringBuffer rev1 = sb1.reverse();
//       System.out.println(rev1);
//       
	
//int rev = 0;
//
//while(num!=0) {
//	rev = rev*10 + num%10;
//	num=num/10;
//	
//}
//System.out.println(rev);	
//	}
		
		
//		int orgNum =  num;
//		
//		int rev = 0;
//		
//		while(num !=0) {
//			rev=rev*10 + num%10;
//			num=num/10;
//		}
//		if(orgNum == rev) {
//			System.out.println(orgNum + " This is Palindrom number");
//		}
//		else {
//			System.out.println(orgNum + " This is not Palindrom number");
//		}
		
		int speed =  scan.nextInt();
		
		if(speed >= 60) {
			System.out.println("You are over speeding 'STOP'");
		}else {
			System.out.println("You are driving under speed limit 'Great'");
		}
		
		

	}
}
