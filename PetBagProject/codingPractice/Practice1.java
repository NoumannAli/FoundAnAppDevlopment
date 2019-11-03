package codingPractice;

public class Practice1 {

	public static void main(String[] args) {
//		int a[] = {8,10,2,5,11};
//		
//		for (int i : a) {
//			System.out.println(a[0] + a[4]);
//			break;
//			
//		}
//		
//		int b[]= {100,200,300,400};
//		for(int i :b) {
//			int c  = b[1] + b[3];
//			System.out.println("Result: " + c);
//			break;
//		}
		
int a = 20;
int b =30;


		
//int t=a;
//a=b;
//b=t;
//
//System.out.println(a);
//System.out.println(b);

//
//a= a+b;
//b=a-b;
//a=a-b;
b = a+b - (a=b);

System.out.println(a);
System.out.println(b);





String last = "Nouman";
String first = "Ali";

String mid = last;
last = first;
first =  mid;

System.out.println(first +" " + last);


	}

}
