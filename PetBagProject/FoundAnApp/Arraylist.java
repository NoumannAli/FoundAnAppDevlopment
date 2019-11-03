package FoundAnApp;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
//		int a[]= {0,1,2,3,4,5,6,7,8,9,10};
//		
//		ArrayList <Integer> al = new ArrayList<>();
//		ArrayList<Integer> al1 = new ArrayList<>();
//		
//		for(int i =0 ; i < a.length; i ++) {
//			if(a[i]%2==0) {
//				System.out.println(al.add(a[i]));
//				
//			}else if(a[i]%2 == 1) {
//				System.out.println(al1.add(a[i]));
//			}
//			
//		}
		
//		int a[]= {0,1,2,3,4,5,6,7,8,9,10};
//		
//		for(int i = 0 ;i < a.length;i++) {
//			if(a[i]%2 ==0) {
//				System.out.println("Even number " + a[i]);
//			
//		}else {
//			System.out.println("odd number " + a[i]);
//		}
//		}
//		int a[] = {50,40,60,20,100,1000};
//		int max = a[0];
//		for(int i=1;i<a.length;i++) {
//			if(a[i] > max) {
//				max=a[i];
//			}
//		}
//		
//		System.out.println("largest value is: " + max);
//		
//		int min = a[0];
//		for(int i= 1 ; i< a.length;i++) {
//			if(a[i] < min) {
//				min=a[i];
//			}
//		}
//	 System.out.println("maximum value is: " + min);
//		
		System.out.println("even numbers");
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		for(int value : a) {
			if(value%2==0) {
				System.out.println(value);
			}
			
		}
		System.out.println("odd numbers");
		for(int value : a) {
			if(value%2 !=0) {
				System.out.println(value);
			}
		}
		
}}



