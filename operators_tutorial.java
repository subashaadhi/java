package javabasics;

public class operators_tutorial {

	public static void main(String[] args) {
	
		// 2) Assignment operator
		
		int a=1;
		a+=20000;
		a-=19999;
		a*=1;
		a/=1;a%=1;
		System.out.println(a);
		
		// 3) Relational operator 
		
		System.out.println("Relational Operator");
		int a1,b1,c1,d1;
		a1=1;
		b1=2;
		c1=3;
		d1=4;
		System.out.println(a1!=b1);
		System.out.println(b1==c1);
		System.out.println(a1<=d1);
		System.out.println(c1>a1);
		System.out.println(c1>=d1);
		
		// 4) Logical Operator 
		
		System.out.println("Logical Operator");
		
		int a2,b2,c2,d2;
		a2=1;b2=2;c2=3;d2=1;
		System.out.println(a2==d2&&a2>b2||c2>=d2);
		System.out.println(a2>b2&&a2==d2||c2>=d2);
		System.out.println(!(a2==b2));
		
		// 5) Bit-wise Operator
		
		System.out.println(98&127);
		System.out.println(98|127);
		System.out.println(98^127);
		System.out.println(~98);
		
		
		for (int i=1;i<=5;i++) {  
			System.out.println(i);
		}
		
//		i = 1 --> 1<5 --> print --> 1
		
		int i = 1;
		while (i<5) {
			System.out.println(i);
			i++;
		}
	
		int j=1;
		do {
		System.out.println(j);
		j++;
		} while (j<1);
		
	}

}
