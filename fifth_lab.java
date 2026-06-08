package javabasics;



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
		
		
		
		
		
		
		
		
		
		
	}
}
