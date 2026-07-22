package javabasics;

public class errors_debugs {
	
	public static void main (String[] args) {
		
		// Question 1
		int age = 18;

		if(age >= 18) {
		    System.out.println("Eligible");  
		}
		else {
		    System.out.println("Not Eligible");
		}
		
		System.out.println();
		
		// Error - 1) Misiing pf curly bracis on both if and else statement.
		// 		   2) Else statement does not possess any condition
		
		// Question 2
		int num = 10;

		if(num == 10)
		{
		    System.out.println("Ten");
		}
		System.out.println();

		// Error - Syntax error inside if statement relational condition.		
		
		
		// Question 3
		int marks = 75;

		if(marks >= 50)
		{
		    System.out.println("Pass");
		}
		
		System.out.println();

		// Error - Syntax error by not giving semi colon after variable declaration
		
		// Question 4
		int a = 10;

		if(a > 5);
		{
		    System.out.println("Greater");
		}

		System.out.println();
		
		// Question 5
		int number = -5;

		if(number > 0)
		{
		    System.out.println("Positive");
		}
		else if(number < 0)
		{ System.out.println("Negative");

		}
		System.out.println();

//		Error - Syntax error by giving a semi colon inside else if statment block.
		
		// Question 6
		String user = "Admin";

		if(user == "Admin")
		{
		    System.out.println("Login Success");
		}

		System.out.println();
		
//		Question 7
		for(int i=1; i<=5; i++)
		{
		System.out.println(i);
		}

		System.out.println();
//		Error - Syntax error by not giving a semi colon inside for loop block.
		
		
//		Question 8
		
		
		for(int i=5; i>=1; i--)       
		{
		    System.out.println(i);
		}

		System.out.println();
		/* i = 1 --> print i --> 1
		 *  i = 0 --> print i --> 0 
		 *  
		 *  so the goes infinity 
		 *  
		 *  Error - logical error to stop the loop 
		 * */
		
		// Question 9
		int m=1;

		while(m<=5)
		{
		    System.out.println(m);
		    m++;
		} 
		System.out.println();
//		Error - not giving the condition that what after the first iteration, the loop should do, so it goes to infinity. 
		
		
		// Question 10
		int j=1;

		do 
		{
		    System.out.println(j);
		    j++;
		}
		while(j<=5) ;
		System.out.println();

		// Error - Syntax Error by not giving a semi colon after while loop.
		

		//Question 11
		for(int i=0; i<5; i++)
		{
			System.out.println(i);

		}
		System.out.println();
		// Error - print statement outside the loop
		
//		Question 12
		for(int i=1; i<=10; i++)
		{
		    if(i==5)
		    break;
		    System.out.println(i);
		}
		System.out.println();
//		Error - syntax error by not giving a semi colon after break statement.
		
//		Question 13
		int day = 2;

		switch(day)
		{
		    case 1:
		        System.out.println("Monday");
		    case 2:
		        System.out.println("Tuesday");
		} System.out.println();
		
		

//		Question 14
		String color = "Red";

		switch(color)
		{
		    case "Red":
		        System.out.println("Stop");
		        break;
		}

		System.out.println();
		
		
//		Error - syntax error by not giving colon after case.
		
		
//		Question 15
		int choice = 3;

		switch(choice)
		{
		    case 1:
		        System.out.println("One");
		        break;
		    default :
		        System.out.println("Invalid");
		}
		System.out.println();

//		 Error - syntax error by not giving colon after default.
		
//		Question 16
		char grade='A';

		switch(grade)
		{
		    case 'A':
		        System.out.println("Excellent");
		        break;
		}
		System.out.println();
		
		// Error - syntax error by not giving single quotation on case.
		
		
//		Question 17
		int month = 5;

		switch(month)
		{
		    case 5:
		        System.out.println("May");
		        break;
		    default:
		        System.out.println("Unknown");
		} 
		System.out.println();

//		Error - logic error by not giving break after case so it print default also.

//		Question 18
		int arr[] = {10,20,30};
		
		System.out.println(arr[2]);
		System.out.println();
		
//		Error - logic error the array contain only 2 index position, so printing 3 index position which doesn't exixts lead to error.
		
//		Question 19
		int arr1[] = new int[5];
//		arr1 [0] = 0; 
//		arr1 [1] = 1;
//		arr1 [2] = 2;
//		arr1 [3] = 3;
//		arr1 [4] = 4;

		for(int i=0;i<arr1.length;i++)
		{
		    System.out.println(arr1[i]);
		}
		System.out.println();
//		Error - logic error by giving inside i<=arr1.length is consider i<=5, but the index allocated for this array were only 4, so the error occurs.

// Question 20
		int arr2[] = {10,20,30};

		System.out.println(arr2.length);

		
//		Error - syntax error by printing the array length [arr2.length()] does the error.
	
//		Question 21
		String arr3[] = {"10","20","30"};

		arr3[0] = "Java";
		
		System.out.println();
//		Error - data tyoe error store string data in int data type leads to error
	
//		Question 22
		int arr4 [] = new int [1];

		arr4[0]=100;

//		Error - syntax error 
		
//		Question 23
		int arr5[] = {10,20,30};

		for(int i=0;i<arr5.length;i++)
		{
			System.out.println(arr5[i]);
		}
		System.out.println();
		
//		Error - syntax error a semi colon placed after a for loop condition leads to error.
		
// Question 24
		String name = "Java";

		System.out.println(name.charAt(3));
		
//		Error - logic error that is only 3 index position exists so to print the 10th index char leads to error.
		
		
//		Question 25
		String text = "hello";

		System.out.println(text.toUpperCase());
		System.out.println();

//		Error - syntax error on function declaration leaving the paranthesis

		
//	    Question 26
		String s1 = "Java";
		String s2 = "Java";

		if(s1.equals(s2))
		{
		    System.out.println("Same");
		}
		
		System.out.println();
//		Error - syntax error 
		
//		Question 27
		String name1 = "null";

		System.out.println(name1.length());
		
		System.out.println();
//		Error - syntax error by entering string value without double quotes.
		
//		Question 28
		
		StringBuilder word = "Java";

		word[0]='P';
		

		


		
	
	}
	
	
	

}
