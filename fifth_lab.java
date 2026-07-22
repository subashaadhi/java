package javabasics;

import java.util.Scanner;

public class fifth_lab {
	
	public static void main(String[] args) {
		
		// half pyramid 
		
		for (int i=1; i<=5;i++) {
		 for (int j=1; j<=i;j++) {
			 System.out.print("*"+" ");
		 }
		 	System.out.println();
		}

		System.out.println();
		
		
		// inverted half pyramid
		
		for (int i=1; i<=5;i++) {
			for (int j=5;j>=i;j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Hallow inverted half pyramid
		
		for (int i=1; i<=5;i++) {
			
			for (int j=5;j>=i;j--) {
				
				if ( i==1||j==5||i==j) {
					System.out.print("*"+" "); }
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		// full pyramid 
		
		for (int i=1; i<=5;i++) {
			
			for (int j=5; j>=i;j--) {
				System.out.print(" "+" ");
			}
			
			for (int j=1; j<=i;j++) {
				System.out.print("*"+" ");
			}
			
			for (int j=1; j<=i-1;j++) {
				System.out.print("*"+" ");
			}
			
			System.out.println();
			
		}

		// inverted pyramid 
		
//		for (int i=1; i<=5;i++ ) {
//			
//			for (int j=1; j<=i;i++){
//			System.out.println(" "+" ");
//			}
//			
//			for (int j=5; j>=i;j--) {
//			 System.out.println("*"+" ");
//			}
//			
//			for (int j=5; j>=i+1;j--) {
//				 System.out.println("*"+" ");
//				}
//		}
//		
		
		
		// half pyramid
		
		for (int i=1;i>=5;i++) {
			for (int j=1;j>=5;j++){
				System.out.println("*");
			}
		}
		
		System.out.println("----------------------------------------");
		
//	   	1) Write a Java program to find the factorial of a given number.
		
		//2) write a java program to find the first 10 natural numbers using a for loop.
		
		for (int i = 1; i <= 10; i++){
			System.out.println(i);
		}
		
		System.out.println("----------------------------------------");
		
		//3) Write a java program to find the first 10 natural numbers using a while loop.
		
		int i=1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		
		// 4) Write a java program to find the sum of the first 10 natural numbers.
		
//		for (int i=1; i<=10; i++) {
//		i=i(i+1)/2;
//			System.out.println(i);
//		}
	
		System.out.println("----------------------------------------");
		
		// 5) Write a Java program to print the multiplication table of a given number.
		
//		Scanner scan = new Scanner (System.in);
//		
//		System.out.print("Enter the Number: ");
//		int number = scan.nextInt();
//		System.out.println("Given number multiplication table:");
//		
//		for (i = 1;i<=20;i++) {
//			System.out.println(i + "x" + number + "=" + (number*i));
//		}
		
		System.out.println("----------------------------------------");
		
		//6) Write a Java program to print the Fibonacci series up to a given number of terms.
		
//		Scanner scan1 = new Scanner (System.in);
//		System.out.print("Enter the number to get the Fibonacci series: ");
//		int num = scan1.nextInt();
//		System.out.println("Fibonocci series based on the given number: " + num);
//		
//		int n1=0;
//		int n2=1;
//		for (i = 1; i <= num; i++) {
//			
//			int n3 = n1+n2;
//			n1=n2;
//			n2=n3;
//			System.out.println(n3);
//		}
//		
//		System.out.println("----------------------------------------");
//		
		
		//7) Write a Java program to check whether a given number is a palindrome or not.
		
//		Scanner scan3 = new Scanner (System.in);
//		
//		System.out.print("Enter the Number: ");
//		int a = scan3.nextInt();
//		int b = 0;
//		int t=a;
//		while (t>0) {
//			int d = t%10;
//			 b = 10*b+d;
//			 t=t/10;
//		}
//		
//		if (b == a) {
//			System.out.println(b+" is a Palindrome");
//		}
//		else {
//			System.out.println(b+" is not a palindrome");
//		}
		
		Scanner scan4 = new Scanner (System.in);
		System.out.print("Enter a value : ");
		int a = scan4.nextInt(); 
		int b = 0;
		int t = a;
		
		while(t>0) {
			int d = t%10;
			b += Math.pow(d,3); 
			t=t/10;
		}
		
		if(b == a){System.out.println(b+" Armstrong..");}
		else {System.out.println(b+" Not a Armstrong..");}
		
		
		
	}
}
