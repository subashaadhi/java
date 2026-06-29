package javabasics;

import java.util.Scanner;

public class functions_tasks {
	
//	function tasks 
	
//	1) Create a method series1() that prints the following series: 2, 4, 6, 8, 10, 12, 14, 16
	
	public static void series1() {
		
		for (int i=0;i<=16;i+=2) {
			if(i<16) {
			System.out.print(i+", ");
			}
			else {
				System.out.println(i);
			}
		} 
	}
	
//	2. Create a method series2() that prints the following reverse series: 50, 40, 30, 20, 10, 0

		public static void series2() {
			
			for (int i=50;i>=0;i-=10) {
				if(i>0) {
				System.out.print(i+", ");
				}
				else {
					System.out.println(i);
				}
			} 
		}
		
//		3. Write a method square(int a) that accepts a number and prints its square.

		public static void square(int a) {
			System.out.println(a*a);
		
		} 
		
//		4. Write a method square(int a) that accepts a number and prints its square.
		
		public static void cube(int c ) {
			System.out.println(c*c*c);
		
		} 
		
//		5. Write a method splitDigits(int n) that accepts a number and prints its digits one by one in reverse order.

		public static void splitdigits(int n) {
			
			while (n>0) {
				int d = n%10;
				n=n/10;
				System.out.print(d + " ");
			}
			
			/*
			 * iteration 1 --> 
			 * 
			 * 
			 * 
			 * 
			 * */
			
		}
		
//		6. 
			
		
		

	public static void main(String[] args) {
		
//		

//		series1();
//		series2();
//		
		Scanner scan = new Scanner (System.in);
//		System.out.print("Enter the Input: ");
//		int sq=scan.nextInt();
//		square(sq);
//		
//		System.out.print("Enter the Input: ");
//		int cb=scan.nextInt();
//		cube(cb);
		
		System.out.print("Enter the digits:");
		int num = scan.nextInt();
		splitdigits(num);
		
		
		
	}

}
