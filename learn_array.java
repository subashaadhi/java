package javabasics;

import java.util.Scanner;

public class learn_array {

	public static void main(String[] args) {
		
		// syntax for array - in single dimension 
		
		// datatyoe variable [] = new datatyoe [array-size]
		// variable [index value] = value;	
//		
//		int a [] = new int [5];
//		a [0] = 1;
//		a [1] = 2;
//		a [2] = 3;
//		a [3] = 4;
//		a [4] = 5;
//		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
//		
//		System.out.println("------------------------------------");
		
		// loops in array - use cases 
		
//		for (int i = 0; i <=4; i++) {
//			System.out.println(a[i]);
//		}
//		
//		System.out.println("------------------------------------");
//		
//		int i = 0;
//		while (i<5) {
//			System.out.println(a[i]);
//			i++;
//		}
		
//		System.out.println("------------------------------------");
		
		// Enhanced for loop 
		
		/* syntax - for (datatype variable : array variable) {
		 * 					// block of code
		 * 				}
		*/
//		
//		for (int b : a) {
//			System.out.println(b);
//		}
//		System.out.println("------------------------------------");
		
		// c/c++ method 
		
		// Syntax - datatype variable [] = {values};
		
//		int c [] = {5,4,3,2,1};
//		System.out.println(c[4]);
//		System.out.println(c[3]);
//		System.out.println(c[2]);
//		System.out.println(c[1]);
//		System.out.println(c[0]);
//		
//		System.out.println("------------------------------------");
		
		// loops in c/c++ method 
		
//		int d [] = {1,2,3,4,5};
//		
//		for (i=0; i<5;i++) {
//			System.out.println(d[i]);
//		}
//		
//		System.out.println("------------------------------------");
//		
//		
//		int j = 0;
//		while (j<5) {
//			System.out.println(d[j]);
//			j++;
//		}
//		
//		System.out.println("------------------------------------");
		
		// Single dimension array - values get from USER INPUT 
//		
//		Scanner scan = new Scanner (System.in);
//		
//		System.out.print("Enter the Array Size: ");
//		int size = scan.nextInt();
//	    
//		int e [] = new int  [size];
//		
//		for (int i = 0; i < e.length; i++) {
//			
//			System.out.print("Enter the Array " + i + " index value: ");
//		    e [i] = scan.nextInt();
//		    
//			 }
		
//		for (int i = 0; i<e.length; i++) {
//			System.out.println(e[i]);
//		}
//		
//		for (int f : e ) {
//			System.out.println(f);
//		}
		
		
		// Single dimension array - values get from USER INPUT (STRING)
		
//		Scanner scan1 = new Scanner (System.in);
//		
//		System.out.print("Enter the Array size: ");
//		int  size1 = scan1.nextInt();
//		
//		String word [] = new String[size1];
//		
//		for (int k = 0; k < word.length; k++ ) {
//			System.out.print("Enter the array "+ k +  " index number: " );
//			word [k] = scan1.next();
//			
//		}
//		
//		for (String m:word) {
//			System.out.println(m);
//		}
		
		// Multidimension array 
		
		// syntax - datatyoe variable [] [] = new datatyoe [row size] [column size];
		//          variable [row index] [column index] = value;
		
//		int a [][] = new int [3][2];
//		a[0][0] = 1;
//		a[0][1] = 2;
//		a[1][0] = 3;
//		a[1][1] = 4;
//		a[2][0] = 5;
//		a[2][1] = 6;
		
//		System.out.println(a[0][1]);
		
//		for (int i = 0; i<3;i++) {
//			for (int  j= 0; j<2;j++) {
//				System.out.print(a[i][j]+ " ");
//			}
////			System.out.println();
////			System.out.println();
//		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
