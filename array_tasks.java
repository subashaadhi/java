package javabasics;

import java.util.Scanner;

public class array_tasks {

	public static void main(String[] args) {
		
		/* 1) Find Sum of Array Elements
        Write a program to find the sum of all elements in an array. */
      
//	//		int ar1 [] = {1,2,3,4,5};
//		int m = 0;
////	for (int i=0;i<ar1.length;i++) {
////		m += ar1[i];
////	}
////	System.out.println(v);
////	
//	for (int f : ar1) {
//		m +=f;
//	}
//	System.out.println(m);
	
		
		
	//	Scanner scan = new Scanner (System.in);
//      
//		System.out.print("Enter the array size: ");
//		int size = scan.nextInt();
//		
//		int ar [] = new int [size];
//		for (int i=0; i<size; i++) {
//			System.out.print("Enter the array "+ i+"index value: " );
//			   ar[i] = scan.nextInt(); 
//			 
//			}
//		int sum = 0;
//		for ( int v : ar ) {
//			sum += v;
//		
//		}
//	 
//		System.out.println("Sum of the arrays: "+sum);
		
		
		// 2. Find Largest Element in Array
		// Write a program to find the largest number in an array.
		
//		int ar2 [] = {1,2,11,4,9};  //  b > max --> max = b
//		int max = ar2[0];		   
								    //  1 > 1 --> skips
//		for (int b : ar2) {			//  2 > 1 -->  saves max = 2
//			if (b > max) {			// 11 > 2 -->  saves max = 11
//				max = b;			//  4 > 11 -->  skips
//			}						//  9 > 11 --. skips
//				
//		}
//		
//		System.out.println("Maximum value of the array: "+max);
				
		/*3. Find Smallest Element in Array

		Write a program to find the smallest number in an array.*/ 

		
//		int ar3 [] = {-1,2,3,4,5};
//		int min = ar3[0];
//		
//		for (int c : ar3) {
//			if (c < min) {
//				min = c;
//			}
//		}
		
//		System.out.println("Minimum value of the array: " + min);
		
		// 4. Reverse an Array
		//Write a program to print array elements in reverse order.
			
//		int ar4 [] = {1,2,3,4,5};
//		
//		int start = 0;
//		int end = ar4.length-1;
//		
//		while (start<end) {
//			 int temp = ar4[start];
//			ar4[start]=ar4 [end];
//			ar4[end]= temp;
//			 start++;
//			 end--;
//		}
//		for (int prt : ar4) {
//			System.out.println(prt);
//		}
		
		/*5. Count Even and Odd Numbers
		Write a program to count even and odd numbers in an array.*/
		
		
//		 int numbers [] = {1,2,3,4,5};
//		 
//		 int e= 0;
//		 int o = 0;
//		 
//		 for (int find : numbers) {
//			
//			 if ( find%2 == 0) {
//				 e++; }
//			 
//			 else {
//				 o++;
//			 }
//		 }
//		
//		 System.out.println("Even count is: " + e);
//		 System.out.println("Odd count is: "+o);
		
		/*
       6. Search an Element in Array
      Write a program to check whether a number exists in the array or not.
       */
		
//		int ar5[] = {1,2,3,4,5};
//		
//		Scanner SCAN = new Scanner (System.in);
//		System.out.print("Search the array elements = ");
//		int search = SCAN.nextInt();
//		
//		for (int array:ar5) {
//			if (array == search) {
//				
//				System.out.println("Element exist");
//				return;
//			}
//		}
//		
//		System.out.println("Element does not exits");


//	 7)	Sort an Array (Ascending Order)
//       Write a program to sort array elements in ascending order.
		
//		int ar6[] = {2,4,5,2,1};
//		
//		for (int i = 0; i<ar6.length;i++) {							
//			for (int j = i+1; j<ar6.length; j++) {				
//				
//				if (ar6[i]>ar6[j]) {
//					
//				int tempo = ar6[i];
//				    ar6[i] = ar6 [j];
//				    ar6[j] = tempo;
//				    
//				}
//			}
//		}
//		
//		System.out.print("Sorted Array: ");
//		for (int sort:ar6) {
//			System.out.print(sort+",");
//		}
				
		/*
		 * iteration 1
		 *  i = 0 j=1
		 *  ar[0] > ar [1] = 2 > 4  --> skips
		 *  
		 *  i = 0 j=2 
		 *  ar{0} > ar [2] = 2 > 5  -->  skips
		 *  
		 *   i = 0 j=3
		 *  ar{0} > ar [3] = 2 > 2  -->  skips
		 *  
		 *   i = 0 j=4 
		 *  ar{0} > ar [4] = 2 > 1  -->  swaps
		 *  
		 *  temp = ar[0] --> temp = 2
		 *  
		 *  ar [0] = ar [4] --> 2 = 1
		 *  
		 *  ar [4] = temp --> 1=2
		 *   
		 *  
		*
		 * 
		 * */
				
//			8)	Copy One Array to Another
//   Write a program to copy all elements from one array to another.
//				
//			int ar7 [] = {1,2,3};
//			
//			int ar8 [] = new int [ar7.length];
//			
//			for (int i = 0; i<ar7.length;i++) {
//				ar8[i] = ar7[i];
//			}
//			for (int newarray : ar8) {
//				System.out.print(newarray+" ");
//			}
			
            /*
             *  iteration 1 
             *  
             *  i = 0 
             *  ar8[0] = ar[0] --> ar8 [0] = 1
             *  
             *  iteration 2
             *  
             *  i=1
             *  ar8[1] =ar7[1] --> ar8 [1] = 2
             *  
             *  iteration 3
             *  
             *  i=2
             *  ar8[2] =ar7[2] --> ar8 [2] = 3    
             *  
             * */
			
//			9. Find Duplicate Elements
//			Write a program to find duplicate elements in an array.

		
//			int ar9[] = {1,2,2,3,4,5,3,5};
//			
//			int dup  = 0;
//			
//			for (int i = 0; i<ar9.length; i++) {
//				
//				for (int j=i+1; j<ar9.length; j++) {
//					
//					if (ar9[i] == ar9[j]) {
//						
//						dup = ar9[i];
//						
//						System.out.print(dup + " ");
//					}
//				}
//			} 
			
			/* iteration 1
			 *  
			 * i=0 j=1 
			 * ar9[0]==ar9[1] --> 1 == 2 skips
			 * dup = ar9 [0] --> 
			 * 
			 * i=0 j=2 
			 * ar9[0]==ar9[2] --> 1 == 2 skips
			 * dup = ar [0] 
			 * 
			 * i=0 j=3
			 * ar9[0]==ar9[3] --> 1 == 3 skips
			 * dup = ar [0] 
			 * 
			 * i=0 j=4
			 * ar9[0]==ar9[4] --> 1 == 4 skips
			 * dup = ar [0] 
			 * 
			 * i=0 j=5 
			 * ar9[0]==ar9[5] --> 1 == 5 skips
			 * dup = ar [0] 
			 * 
			 * i=0 j=6 
			 * ar9[0]==ar9[6] --> 1 == 3 skips
			 * dup = ar [0] 
			 * 
			 * i=0 j=7 
			 * ar9[0]==ar9[7] --> 1 == 5 skips
			 * dup = ar [0] 
			 * 
			 * iteration 2
			 * i=1 j=2 
			 * ar9[1]==ar9[2] --> 2 == 2 saves
			 * dup = ar [1] --> dup = 2
			 * 
			 * 
			 * 
			 * */
			
//		    10) 10. Merge Two Arrays
//			Write a program to combine two arrays into one.
			
//			int ar10 [] = new int [5];
//			
//			ar10[0] = 1;
//			ar10[1] = 2;
//			ar10[2] = 3;
//			ar10[3] = 4;
//			ar10[4] = 5;
//			
//			int ar11[] = {1,2,3,4,5};
//			int length = ar10.length + ar11.length;
//			
//			int ar12 [] = new int [length];
//			
//			for (int i = 0; i<ar10.length;i++) {
//				  ar12 [i] = ar10[i];
//			}
//			for (int i = 0; i<ar11.length; i++) {
//				 ar12 [ar10.length+i] = ar11 [i];
//			}
//			
//			for (int nar12:ar12) {
//				System.out.print(nar12+" ");
//			}
			
//		 11. Second Largest Element
//		 Write a program to find the second largest number in an array.
		
//			int ar13[] = {1,2,3,4,5,55};
//			
//			int secondmax = ar13[0];
//			int max = ar13[0];
//			
//			for (int m:ar13) {       
//				if (m>max) {
//					secondmax = max;
//					max = m;
//					}
//				}  System.out.println(secondmax);
		
		
//			
		// 12. Frequency of Each Element
        //Write a program to count how many times each element appears.
		
//		int ar14 [] = {1,2,3,1,2}; 
		
		
		
		
			
	
	
	
	
	
	
	
     	}
	}


