package javabasics;


public class datatypes {

	public static void main(String[] args) {

		int s=10;
		System.out.println("Integer: "+s);
		
		
		//byte
		byte a=-128;
		byte a1=127;
		System.out.println("Byte Range: "+ a+" to "+a1);
		
		//short
		short b=-32768;
		short b1=32767;
		System.out.println("Short Range: " + b+ " to " + b1);
		
		//float 
		float a2=0.0507200666464f;
		System.out.println("Decimal Range: "+ a2);
		
		//double
		double abc = 0.23098765432 ;
		System.out.println(abc);
		
		//boolean
		
		// char
		char a3='a';
		System.out.println(a3);
		
		//typecasting 
		
		/* two types- i) Explicit type casting or narrowing 
		             ii) Implicit type casting or widening */
		
		// Narrowing
		 int a4=40000;
		 short b4=(short)a4;
		 System.err.println(b4);
		 
		 // widening
		 
		 byte n=127;
		 int n1=n;
		 System.out.println(n1);
		 
		 // operators
		 
		 int q=100;
		 int t=3;
		 double m=q/t;
		 double j=q%t;
		 System.out.println(j);
		 System.out.println(m);
		
		

		
	}

}
