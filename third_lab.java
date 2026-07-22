package javabasics;


public class third_lab {

	public static void main(String[] args) {
		
		// Conditional Statement:
		System.out.println("-----------------------------");
		System.out.println(" Conditional Statement");
		System.out.println("-----------------------------");
		
		// 1)Write a Java program to accept two numbers m and n where m > n, and find the quotient and remainder.
		
		int m=15;
		int n=1;
		if (m>n) {
		System.out.println();
		System.out.println("1)");
		System.out.println("i)Quotient: "+m/n);
		System.out.println("ii)Remainder: "+m%n);
		}
		
		System.out.println();
	

		//2)  Write a Java program to accept five subject marks and display the grade based on the average
		
		int s1,s2,s3,s4,s5;
		s1=92;s2=42;s3=93;s4=100;s5=45;
		
		int avg=(s1+s2+s3+s4+s5)/5;
//		System.out.println(avg);
		if(s1>100||s2>100||s3>100||s4>100||s5>100) { System.out.println("Enter valid Marks");
			
			
		}
		else if (s1>=35&&s2>=35&&s3>=35&&s4>=35&&s5>=35) {
			if (avg<=100&&avg>=90) { System.out.println("2)Grade: A ");
			
			} 
			else if (avg<90&&avg>=80) { System.out.println("2)Grade: B");
			
				
			}
			
			else if (avg<80&&avg>=70) { System.out.println("2)Grade: c");}
			
			else if (avg<70&&avg>=35) {System.out.println("2)Grade: D");}
		}

		else { System.out.println("2)Grade: fail");
			
		}
		System.out.println();
		
		/*3)Whether a number is positive or negative

        Whether a number is odd or even

        Whether a student pass or fail based on marks

        Whether a year is a leap year or not */
		
		
		double number=0;
		if (number>0&&number%2==0) {
			System.out.println("3.i)Given number is Positive and Even ");	
		}
        else if (number>0&&number%2==1) {
			System.out.println("3.i)Given number is positive and odd");
		}
        else if (number<0&&number%2==0) { 
        	System.out.println("3.i)Given number is Negative and Even");
        }
        else if (number<0&&number%2==-1) { 
        	System.out.println("3.i)Given number is Negative and odd");
        }
	    else {
        	System.out.println("3.i)Neither Positive nor Negative and Even");
        }
	
		double marks=35;
		if (marks>=35&&marks<=100) {
			System.out.println("3.ii)The Student is Pass...");
		}
		else if (marks<35&&marks>=1) {
			System.out.println("3.ii)The Student is Fail...");
		}
		
		else {
			System.out.println("3.ii)Enter the Valid Marks...");
		}
	
		int yr=2006;
		if (yr%4==0||yr%400==0||yr%100==0) {
		System.out.println("3.iii)Given year is a  Leap Year");
		}
		 
		else {
			System.out.println("3.iii)Given year is Not a Leap a year");
		}
		
		System.out.println();
		
	    //4) Write a Java program to check whether a character is a vowel or consonant.
	
	char Hi ='2';
	
	if (Hi=='a'||Hi=='e'||Hi=='i'||Hi=='o'||Hi=='u') {
		System.out.println("4)Given character is vowels");
		}
	
	else {
		System.out.println("4)Given character is consonant");
	}
		System.out.println();
		//Write a Java program to find the maximum and minimum among three numbers.
		
		int num1=1;
		int num2=2;
		int num3=3;
		if (num1>num2&&num1>num3) {
		System.out.println("5.i)Number 1 is Maximum");}
	
		else if (num2>num1&&num2>num3) {
		System.out.println("5.i)Number 2 is Maximum");
		}
		else {
			System.out.println("5.i) Number 3 is Maximum");
		}
		
		if (num1<num2&&num1<num3) {
			System.out.println("5.ii)Number 1 is Minimum");
		}
		else if (num2<num1&&num2<num3) {
			System.out.println("5.ii)Number 2 is Minimum ");
			}
			else {
				System.out.println("5.ii) Number 3 is  Minimum");
			}
		System.out.println();
		
	// 6)Write a Java program to display the season based on the given month and day.
	
		String month="february";
		int days=28;
		if(month=="December"&&days<=31||month=="January"&&days<=31||month=="February"&&days<=28||month=="december"&&days<=31||month=="january"&&days<=31||month=="february"&&days<=28) {
		System.out.println("6)"+month+days+" is a Winter season");
		}
		else if(month=="March"&&days<=31||month=="May"&&days<=31||month=="June"&&days<=30||month=="march"&&days<=31||month=="may"&&days<=31||month=="june"&&days<=30||month=="April"&&days<=30||month=="april"&&days<=30) {
			System.out.println("6)"+month+days+" is a Summer season");
			}
		else if(month=="July"&&days<=31||month=="August"&&days<=31||month=="September"&&days<=30||month=="july"&&days<=31||month=="august"&&days<=31||month=="september"&&days<=30) {
			System.out.println("6)"+month+days+" is a Southwest monsoon season");
			}
		else if (month=="October"&&days<=31||month=="November"&&days<=30||month=="october"&&days<=31||month=="november"&&days<=30) {
			System.out.println("6)"+month+days+" is a Northwest monsoon season");
		}
		else {
			System.out.println("6)Please enter a valid input");
		}
		System.out.println();
	    //7)Write a Java program to find the number of days in a given month.
		
		
		String mnth="monday";
			
		 if (mnth=="january"||mnth=="march"||mnth=="may"||mnth=="july"||mnth=="august"||mnth=="october"||mnth=="december"||mnth=="January"||mnth=="March"||mnth=="May"||mnth=="July"||mnth=="August"||mnth=="October"||mnth=="December")		
        {
        	System.out.println("7)"+mnth+" has 31 days");
        }
		else if (mnth=="april"||mnth=="April"||mnth=="june"||mnth=="June"||mnth=="september"||mnth=="September"||mnth=="november"||mnth=="November")
        {
        	System.out.println("7)"+mnth+" has 30 days");
        }
        
        else if (mnth=="february"||mnth=="February")
        {
        	System.out.println("7)"+month+" has 28 days");
        }        	
		
		
		else {
			System.out.println("7)Enter a valid intput");
		}
        System.out.println();
		// 8)Write a Java program to display "Hello" if the number entered by the user is a multiple of 5, otherwise print "Bye".
		 
	    int hello=1;
	    if (hello%5==0) {
	    	System.out.println("8)Hello");
	    }
		 
	    else {
	    	System.out.println("8)Bye");
	    }
		 System.out.println();
		 
		//9)  Write a Java program to accept the temperature in degree Celsius and check whether water is boiling or not.
		 
		int deg=10;
		if (deg>=100) {
			System.out.println("9)The water is boiling at this temperature");
		}
		
		else {
			System.out.println("9)The water is not boiling at this temperature");
		}
		System.out.println();
		
		// 10) Write a Java program to calculate the library charge based on the number of days using the following conditions:
		 
		int d=16;
		if (d>=1&&d<=5) {
			System.out.println("10)Charge: "+d*2);
		}
		else if (d>5&&d<=10) {
			System.out.println("10)Charge: "+d*3);
		}
		else if (d>10&&d<=15) {
			System.out.println("10)Charge: "+d*4);
		}
		else if (d>15) {
			System.out.println("10)Charge: "+d*5);
		}
		else {
			System.out.println("10)Enter valid input");
		}
		System.out.println("-----------------------------");
		System.out.println();
		// 1)Write a Java program to check whether a person is eligible to vote or not based on age.
		
		int age=17;
		if (age>=18) {
			System.out.println("1)Eligible to vote");
		}
		else {
			System.out.println("1)Not eligible to vote");
		}
		System.out.println();
		
		//2) Write a Java program to check whether a number is divisible by both 3 and 5.
		
		int nu3=5;
		if (nu3%3==0) {
			System.out.println("2)Divisible by 3");
		}
		else {
			System.out.println("2)Not divisible by 3");
		}
		System.out.println();
		
		//3) Write a Java program to accept a salary amount and display whether the employee gets a bonus or not.
		
		
		
        
	}
}
		
		
		
		
	
	
	
	

