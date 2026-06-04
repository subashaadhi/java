package javabasics;

import java.util.Scanner;

public class fourth_lab {

	public static void main(String[] args) {
		
	// Switch Case
		
    //1) Student Details - Accept student name, age, and department and display them.
//    System.out.println("**********Student Details**********");
//    System.out.println();
//    
//	Scanner scan = new Scanner (System.in);
//	System.out.print("Enter the Student Name: ");
//	String stndName=scan.nextLine();
//	System.out.println("Student Name: "+stndName);
//	System.out.println();
//	
//	System.out.print("Enter the Age: ");
//	byte age=scan.nextByte();
//	scan.nextLine();
//	System.out.println("Student Age: "+age);
//	System.out.println();
//	
//	System.out.print("Enter the Department: ");
//	String Dept=scan.nextLine();
//	System.out.println("Student Department: "+Dept);
//	System.out.println();
		
		
	// 2)Mobile Purchase - Accept mobile name and price and display details.
		
//		System.out.println("**********Mobile Purchase**********");
//        System.out.println();
//		
//	Scanner scan1=new Scanner (System.in);
//	System.out.print("Enter the Mobile Name: ");
//	String mobileName=scan1.nextLine();
//	System.out.println("Mobile Name: "+mobileName);
//	System.out.println();
//	
//	System.out.print("Enter the Mobile Price: ");
//	int price=scan1.nextInt();
//	System.out.println("Mobile Price: "+price);
//	System.out.println();
//	
	
// 3)Employee Information - Accept employee name, ID, and salary and display them.
	

//		System.out.println("**********Employee Information **********");
//        System.out.println();
//        
//        Scanner scan2=new Scanner (System.in);
//        System.out.print("Enter the Employee name: ");
//        String empName=scan2.nextLine();
//        System.out.println("Employee Name: "+empName);
//        System.out.println();
//        
//        System.out.print("Enter the ID: ");
//        String id=scan2.nextLine();
//        System.out.println("Employee ID: "+id);
//        System.out.println();
//        
//        System.out.print("Enter the Salary: ");
//        int salary=scan2.nextInt();
//        System.out.println("Employee Salary: "+salary );
//        System.out.println();
        
        
		
		// 4) College Admission - Accept student name, 10th mark, and 12th mark and display them
        
//        
//		System.out.println("**********College Admission**********");
//        System.out.println();
//        
//        Scanner scan3=new Scanner (System.in);
//        System.out.print("Enter the student name: ");
//        String name=scan3.nextLine();
//        System.out.println("Student Name: "+name);
//        System.out.println();
//        
//        System.out.print("Enter the 10th Mark: ");
//        short mark=scan3.nextShort();
//        if(mark<=500) {
//        	System.out.println("10th Mark: "+mark);
//        }
//        else {
//        System.out.println("Enter the Valid Marks");
//        } 
//        System.out.println();
//        
//        
//        System.out.print("Enter the 12th Mark: ");
//        short mark1=scan3.nextShort();
//        if(mark1<=600) {
//        	System.out.println("12th Mark: "+mark1);
//        }
//        else {
//        System.out.println("Enter the Valid Marks");
//        }
//        System.out.println();
	
		
		
//		// 5) Product Billing - Accept product name, quantity, and price. Calculate total amount

//		  System.out.println("**********Product Billing**********");
//        System.out.println();
//        
//        Scanner scan4=new Scanner (System.in);
//        System.out.print("Enter the Product: ");
//         String pName=scan4.nextLine();
//         System.out.println();
//       
//        System.out.print("Enter the  Quantity: ");
//        short quantity=scan4.nextShort();
//        System.out.println();
//        
//        System.out.print("Enter the Price: ");
//        int price1=scan4.nextInt();
//        scan4.nextLine();
//        System.out.println();
//        
//        System.out.println("Total Amount: "+ quantity*price1);
        
        
        // Switch Case Tasks
		
		// 1) - Accept a number (1-7) and display the corresponding day.
        
//		System.out.println("***********Day Finder**********");
//        System.out.println();
//        
//        Scanner scan6=new Scanner (System.in);
//        System.out.print("Enter the Number of the day: ");
//        byte days=scan6.nextByte();
//        
//        switch (days) {
//        
//        	case 1: 
//        		System.out.println("Sunday");
//        		break;
//        	
//        	case 2: 
//        		System.out.println("MOnday");
//        		break;
//        		
//        	case 3: 
//        		System.out.println("Tuesday");
//        		break;
//        		
//        	case 4: 
//        		System.out.println("Wednesday");
//        		break;
//        		
//        	case 5:
//        		System.out.println("Thursday");
//        		break;
//        		
//        	case 6:
//        		System.out.println("Friday");
//        		break;
//        		
//        	case 7:
//        		System.out.println("Saturday");
//        		
//        	default: 
//        		System.out.println("Enter the valid input");
//        		
//        		
//        		}
//        System.out.println();
		
		
		//3) Course Selection - Display welcome message for selected course.
		
//		System.out.println("***********Course Selection**********");
//        System.out.println();
//		
//        System.out.println("Available Courses: ");
//        System.out.println();
//        
//        System.out.println(" 1)Java Fullstack Development \n 2)Python Fullstack Development \n 3)MPython ern stack Development \n 4)Mean Fullstack Development");
//       
//        Scanner scan8=new Scanner (System.in);
//        System.out.println();
//        
//        System.out.print("Enter the course: ");
//        byte course = scan8.nextByte();
//        
//        switch (course) {
//        
//        case 1:
//        	System.out.println("WELCOME! You are entering Java Fullstack Development  ");
//            break;
//            
//        case 2:
//        	System.out.println("WELCOME! You are entering Python Fullstack Development");
//            break;
//            
//        case 3:
//        	System.out.println("WELCOME! You are entering Mern stack Development");
//            break;
//            
//        case 4:
//        	System.out.println("WELCOME! You are entering Mean stack Development");
//        	break;
//        	
//        default:
//        	System.out.println("Enter the valid input");
//        }
//        
		
		// 4) Food Menu - Display selected food item.
		System.out.println("***********Food Menu**********");
        System.out.println();
        
        
        
        System.out.println("Starters:");
        System.out.println(" 1)Samosa \n 2)Veg roll \n 3)Popcorn chicken \n 4)Veg sandwich \n 5)Chicken Shawarma");
		System.out.println();
		
		Scanner scan9 = new Scanner (System.in);
		System.out.print("Select our Tasty Starter: ");
		byte food = scan9.nextByte();
		System.out.println();
		
		 switch (food) {
       
       case 1:
       	System.out.println("Take the bite of  Samosa");
           break;
           
       case 2:
       	System.out.println("Take the bite of Veg roll");
           break;
           
       case 3:
       	System.out.println("Take the bite of Popcorn chicken");
           break;
           
       case 4:
       	System.out.println("Take the bite of Veg sandwich");
       	break;
       	
       case 5:
       	System.out.println("Take the bite of Chicken shawarma");
       	break;
       	
       default:
    	   System.out.println("We are unable to make you the dish");
       }
		
		
		
		
        

		
		
		
		
		
		
		
		
		
		
	}

}
