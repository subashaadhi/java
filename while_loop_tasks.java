package javabasics;

import java.util.Scanner;

public class while_loop_tasks {

	public static void main(String[] args) {
		
	// 1) Write a Java program to display the factorial of a number.
		
//		Scanner scan = new Scanner (System.in);
//		System.out.print("Enter the Number: ");
//		int n = scan.nextInt();
//		
//		
//		int f = 1;                // f=1*1
//		int i = 1;				  // f=1*2
//		
//		while ( i <= n)  {
//			f*=i;
//			i++;
//			}
//		System.out.println("Factorial of the given number: " + f);
//		
//		System.out.println("--------------------------------");
		
		// 2) Print first 10 natural numbers using for & while loop in Java.
		// 3) Write a Java program to print sum of first 10 natural numbers.
		
		// 4) Write a Java program to print multiplication table of a given number.
		
//		Scanner scan1 = new Scanner (System.in);
//		
//		System.out.print("Enter the number: ");
//		int m = scan1.nextInt();
//		
//		int i=1;
//		while (i<=20) {
//
////			if (i == 10) {
////				break;
////			}
//			
////			if (i > 5) {
////				continue;
////			}
//			
//			int ans = i*m;
//			System.out.println(i + "x" + m + "=" + ans);
//			i++;
//		}
		
		// 5) Write a Java program to display the Fibonacci series up to n terms.
		
//		Scanner scan2 = new Scanner (System.in);
//		
//		System.out.print("Enter the value: ");
//		int fB = scan2.nextInt();
//		
//		int n1 = 0;
//		int n2 = 1;
//		
//		int i = 1;
//		while (i<=fB) {
//			int n3 = n1 + n2;
//			n1=n2;
//			n2=n3;
//			System.out.println(n3);
//			i++;
//		}
		
		// 6) Write a Java program to check if the given number is palindrome or not.
		
//		Scanner scan3 = new Scanner (System.in);
//		
//		System.out.print("Enter the value: ");
//		int val = scan3.nextInt();
//		int b = 0;
//		int t = val;
//		
//		while (t > 0 ) {
//			
//			int  d = t%10;
//			 b = b*10+d;
//			 t = t/10;
//		}
//			if ( b == val ) {
//				System.out.println(b + " is a palindrome");
//			}
//			
//			else {
//				System.out.println(b + " is not a palindrome");
//			}
		
		// 7) Write a Java program to check if the given number is Armstrong or not.
		
			
			
	   // 8) Write a Java program to calculate HCF of two given numbers
	
		Scanner scan4 = new Scanner (System.in);
		System.out.print("Enter first number: ");
        int num1 = scan4.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan4.nextInt();

       
        int a = num1;
        int b = num2;

        
        while (b > 0) {
            int remainder = a % b;
            a = b;       // Move 'b' to 'a'
            b = remainder; // Move 'remainder' to 'b'
        }

        
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + a);
          
       // 9) Write a Java program which iterates integers from 1 to 50. For multiples of three print "hi" instead of the number and for multiples of five print "hello". For numbers which are multiples of both three and five print "hihello".
         
        
	   
		
		
	}

}
