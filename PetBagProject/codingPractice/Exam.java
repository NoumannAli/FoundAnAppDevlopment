package codingPractice;

public class Exam {

	public static void main(String[] args) {
		
		// 1: swap two number
		int a=10;
		int b=20;
		
//		int c = a;
//		a=b;
//		b=c;
		
//        a=a+b;
//        b=a-b;
//        a=a-b;
		
//		a=a+b - (a=b);
//		
//		System.out.println(a);
//		System.out.println(b);
//		
		
		// 2: reverse a number
		
		int num = 12345;
//		
//		int rev=0;
//		
//		while(num !=0) {
//			rev=rev*10 + num%10;
//			num=num/10;
//		}
//		System.out.println(rev);
//StringBuffer sb = new StringBuffer(String.valueOf(num));
//StringBuffer rev = sb.reverse();
//System.out.println(rev);
		
		// 3: reverse a string
//		String name = "NoumanAli";
//		String rev="";
//		
//		int len = name.length();
//		for(int i = len-1;i>=0;i--) {
//			rev=rev+name.charAt(i);
//		}System.out.println(rev);
		
		// 4: Find palindrom number
		
		
//		int num1 = 16461;
//		
//		int orgnum = num1;
//		int rev = 0;
//		
//		while(num1!= 0 ) {
//			rev=rev*10 + num1%10;
//			num1=num1/10;
//			
//		}
//		
//		if(orgnum == rev) {
//			System.out.println("it is palindrom number");
//		}else {
//			System.out.println(" it is not palindrom number");
//		}
		
		//fiz buzz challange
		int num1=100;
		for(int i = 1 ; i<=num1;i++) {
			if(i%3 ==0 && i%5==0) {
				System.out.println("fizzbuzz");
			}
			if(i%3==0) {
				System.out.println("fizz");
			}else if (i%5==0) {
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
			
		}
		
		}
	}


