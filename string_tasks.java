package javabasics;

import java.util.Scanner;

public class string_tasks {

	public static void main(String[] args) {
		
//		String tasks
		
//		1)Accept a student name and display a welcome message.
		
		Scanner scan = new Scanner (System.in);
	
//		System.out.print("Enter the Student Name: ");
//		String stdName = scan.nextLine();
//		
//		System.out.println("Welcome "+stdName);
		
//		2)Accept a name and display the total number of characters.
		
//		System.out.print("Enter the Name:");
//		String name = scan.nextLine();
//		System.out.println("Total number of character: "+name.length());
//		
////		3) Accept a name and display the first character.
//		
//		System.out.print("Enter the Name: ");
//		String name1 = scan.nextLine();
//		System.out.println("The First character: " + name1.charAt(0));
		
//		4) Accept a name and display the last character.
		
//		System.out.print("Enter the Name: ");
//		String name2 = scan.nextLine();
//		System.out.println("The last character: " + name2.charAt(name2.length()-1));
		
//		5)Convert a student's name to uppercase.
		
//		System.out.print("Enter the Student Name: ");
//		String name3 = scan.nextLine();
//		System.out.println("Student Name: "+name3.toUpperCase());
		
//		6) Convert a city name to lowercase.
//		System.out.print("Enter the city: ");
//		String city = scan.nextLine();
//		System.out.println("city: "+city.toLowerCase()); 
		
//		7)  Check whether a name starts with the letter P.
		
//		System.out.print("Enter the Name: ");
//		String check = scan.nextLine();
//		if (check.charAt(0)=='P') {
//			System.out.println("Yes it starts with P");
//		}
//		else {
//			System.out.println("No it is not starts with P");
//		}
		
		
//		8) Check whether a name ends with the letter n.
		
//		System.out.print("Enter the Name: ");
//		String check1 = scan.nextLine();
//		if (check1.charAt(check1.length()-1)=='n') {
//			System.out.println("Yes it ends with n");
//		}
//		else {
//			System.out.println("No it is not ends with n");
//		}

//		9)Accept two names and check whether they are equal.
		
//		System.out.print("Enter the Name 1: ");
//		String n1 = scan.nextLine();
//		
//		System.out.print("Enter the Name 2: ");
//		String n2 = scan.nextLine();
//		
//		if (n1.equals(n2)) {
//			System.out.println("Equal");
//		}
//		else {
//			System.out.println("Not Equal");
//		} 
		
//		10) Compare two strings without considering uppercase and lowercase letters.
		
//		System.out.print("Enter the Name 1: ");
//		String string1 = scan.nextLine();
//		
//		System.out.print("Enter the Name 2: ");
//		String string2 = scan.nextLine();
//		
//		if (string1.equalsIgnoreCase(string2)) {
//			System.out.println("Equal");
//		}
//		else {
//			System.out.println("Not Equal");
//		} 
		
//		11) Check whether an email address contains @.
		
//		System.out.print("Enter the Email: ");
//		String mail = scan.nextLine();
//		
//		if (mail.contains("@")) {
//			System.out.println("Valid email");
//		}
//		else {
//			System.out.println("Invalid email");
//		}
		
//		12)12. Check whether an email address contains gmail.com.

		System.out.print("Enter the Email: ");
		String mail1 = scan.nextLine();
		
		
		if (mail1.contains("gmail.com")|| mail1.contains("GMAIL.COM")) {
			scan.nextLine();
		
			System.out.println("Valid email: " + mail1.toLowerCase()+mail1);
		
		}
		else {
			System.out.println("Invalid email");
		}
	
		
		
		
	}

}
