import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
//	Scanner scnr =  new Scanner(System.in)	;
//	String s = "I love java and java";
//	
//	int totalcount=s.length();
//	int afterremoving=s.replace("a", "").length();
//	int count =  totalcount - afterremoving;
//	System.out.println(count);
		
		
//		String s =  "@@@@@@$%%%&*() Te@@@@@@@@@@st@@@@@@@@@i@@@@@@@ng @@@@@@se@@@@@@le@@@@@@@@@nium@@@@@@@@@@@@";
//		
//		s=s.replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println(s);
//		
		
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,17,18,19,20};
		
		int sum1 =0;
		
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		
		
		int sum2 = 0;
		for(int i =1; i<=20;i++) {
			sum2=sum2+i;
	}
	System.out.println(sum2-sum1);
		
	}
}

