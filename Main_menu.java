package Labour_Management_and_Weekly_Wages_System;


import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

class Filemanager {
	
	
	static int recordNo =1;
	
	
	static void Salary(String labour[], int salary) {

	    try {
	    	
	        File file = new File("C:\\Users\\ELCOT\\Documents\\Labour Project files\\Attendace.txt");
	        Scanner read = new Scanner(file);

	        int presentCount[] = new int[labour.length];

	        while (read.hasNextLine()) {

	            String line = read.nextLine();

	            for (int i = 0; i < labour.length; i++) {

	                if (line.contains(labour[i]) && line.contains("P")) {
	                    presentCount[i]++;
	                }

	            }

	        }

	        read.close();

	        System.out.println("==========================================");
	        System.out.println("            SALARY REPORT");
	        System.out.println("==========================================");
	        System.out.printf("%-20s %-10s %-10s%n",
	                "Labour", "Days", "Salary");

	        for (int i = 0; i < labour.length; i++) {

	            System.out.printf("%-20s %-10d %-10d%n",
	                    labour[i],
	                    presentCount[i],
	                    presentCount[i] * salary);

	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	
	
	
	
	static void viewAttendance() {
		
		try {
			
			
				
				File viewFrom = new File ("C:\\\\Users\\\\ELCOT\\\\Documents\\\\Labour Project files\\\\Attendace.txt");
				
				Scanner readFrom = new Scanner (viewFrom);
				
				while (readFrom.hasNextLine()) {
					
					System.out.println(readFrom.nextLine()); 
					
				}
				
			
			
			
		}
		
		catch (Exception e){
			
			e.printStackTrace();
			
		}
	}
	
	
	
    static void toSave ( String date , String day , String site, String labour [], String attendance [], int salary) {
	
	try {
		
	FileWriter save = new FileWriter ("C:\\\\Users\\\\ELCOT\\\\Documents\\\\Labour Project files\\\\Attendace.txt",true);
	
	
	save.write("================== RECORD " + recordNo++ + " ============================= \n");
	save.write("Date: " + date + "\n");
	save.write("Day : " + day + "\n"); 
	save.write("Site: " + site + "\n");
	
	save.write("Today's Attendance: \n");
	save.write("---------------------- \n");
	
	save.write("Labour Name \t Attendance \t Salary \n");
	
	for (int i = 0; i<labour.length;i++) {
		
		if (attendance[i].equalsIgnoreCase("p")) {
			save.write(String.format("%-20s %-12s %10d %n", labour[i],attendance[i],salary));
		}
		
		else {
			save.write(String.format("%-20s %-12s %10d %n", labour[i],attendance[i],0));
			
		}
	}
	
	save.write("\n");
	save.close();
	
	
	
	}
	catch (Exception e ) {
//		System.out.println(e); 
		e.printStackTrace();
	}
		
		
	}


	
	
	
		
	
	
}

public class Main_menu {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String date;
		String day;
		
		
		int choice;
		
		int salary = 1000;
		
		  String array_site [] = {"1.Site Ilavarasu", "2.Site Vicky", "3.Site Vishnupriya"};
		  
		   String array_labour [] = {"1. Mani","2. Selvam","3. Murugeshan","4. Ravi "};
		   
		   String attendance [] = new String  [array_labour.length];
	
	    do {
	    	
			System.out.println("=======================================");
		    System.out.println(" Labour & Wages Management System ");
		    System.out.println("=======================================");
		   
		    System.out.println(" 1. Select site & Mark Attendance \n 2. View Attendance \n 3. Weekly Salary \n 4. Exit");
		    System.out.println("--------------------------------------");
		    
		    
		   System.out.print("Enter your choice: ");
		   choice = scan.nextInt();
		   System.out.println();
		   
		  
		   
		   switch (choice) {
		   
		   case 1: 
			   
			
			   System.out.println("--- Ongoing Site --- ");
			   
			   
			   for (String ar0 : array_site) {
				   System.out.println(ar0);
			   }
			   
			   System.out.println("--------------------------------------");
			   
			  
			   System.out.print("Select Site: ");
			   int site = scan.nextInt();
			   System.out.println(); 
			   
			 
			   
			   switch (site) {
			   
			  
			   
			   case 1:
				   
				   String save_site1 = "Site Ilavarasu";
				   System.out.println("Current site: Site Ilavarasu ");
				   
				   System.out.print("Date: ");
				      date = scan.next();
				    
				    System.out.print("Day: ");
				     day = scan.next();
				    
				    
				    
//				    scan.next();
//				     site_store = scan.nextLine();
				     
				   System.out.println(" --- Current Labourers ---");
				   
				  
				   
				   
				   for (int i = 0; i<array_labour.length; i++) {
					   
					   
					   System.out.print(array_labour [i] + "(P/A): ");
					   
					   attendance[i] = scan.next().toUpperCase();
					   
				   }
				   
				   
				   
				   Filemanager.toSave (date, day,save_site1, array_labour, attendance,salary  );
				   System.out.println("Saved");
				  
				   
				   break; 
				   
			 
			   
			   case 2:
				   String save_site2 = "Site Vicky";
				   System.out.println("Current site: Site Vicky ");
				   
				   System.out.print("Date: ");
				      date = scan.next();
				    
				    System.out.print("Day: ");
				     day = scan.next();
				    
				    
				    
//				    scan.next();
//				     site_store = scan.nextLine();
				     
				    
                   System.out.println(" --- Current Labourers ---");
				   
                   for (int i = 0; i<array_labour.length; i++) {
                	  
                	   
                	   
					   System.out.print(array_labour [i] + "(P/A): ");
					   
					   attendance[i] = scan.next().toUpperCase();
					   
					   System.out.println();
					   
				   }
				   
                   
                   Filemanager.toSave ( date, day,save_site2,  array_labour, attendance,salary  );
                   System.out.println("Saved");
				   break;
				   
			  
			   
			   case 3:
				   
				   String save_site3 = "Site Vishnupriya";
				   System.out.println("Current site: Site Vishnupriya ");
				   
				   System.out.print("Date: ");
				      date = scan.next();
				    
				    System.out.print("Day: ");
				     day = scan.next();
				    
				  
				    
//				    scan.next();
//				     site_store = scan.nextLine();
				   
                   System.out.println(" --- Current Labourers ---");
				   

                   for (int i = 0; i<array_labour.length; i++) {
                	   
                   
					   System.out.print(array_labour [i] + "(P/A): ");
					   
					   attendance[i] = scan.next().toUpperCase();
					   
					   System.out.println();
					  
				   }
                   
                   Filemanager.toSave (date, day,save_site3, array_labour, attendance,salary );
                   System.out.println("Saved");
				   
				   break;
				   
			   }
			   
			   break;
		   
		   
		 
		   case 2: 
			   
			   System.out.println("--- Selected view Attendance ---");
			   System.out.println();
			    
			   Filemanager.viewAttendance();
			   
			   break;
			   
		   case 3:
			   
			   System.out.println("selected Weekly Salary");
			   
			   
			   Filemanager.Salary(array_labour, salary);
			   
			   break;
			   
		   case 4: 
			   System.out.println("selected Exit");
			   break;
		   
		   default:
			   System.out.println("Invalid input ");
		   }
		   
		   
		}
		while (choice != 4);
	    
	    
	
	
	}
	
}
