package javabasics;

public class second_lab {

	public static void main(String[] args) {
		System.out.println("----------------------------");
		//Assginment Operator>> Tasks 
		System.out.println(" Assginment Operator");
		System.out.println("----------------------------");
		System.out.println();
		//1) A student has 500 in his wallet. After buying a book for ₹120 using -=, find the remaining amount.
		
		int wallet=500;
		wallet-=120;
		System.out.println("1)Remaining amount: "+wallet);
		
		//2) A company gives ₹2000 bonus to an employee using +=. Find the updated salary.
     
		int salary= 24000;
		salary+=2000;
		System.out.println("2)Updated Salary: "+salary);
		
		//3) 3. A water tank contains 100 liters. 20 liters are added using +=. Find total water.
        
		int tank=100;
		tank+=20;
		System.out.println("3)Total water: "+tank);
		
		//4) 3. A water tank contains 100 liters. 20 liters are added using +=. Find total water.
		
		int battery=80;
		battery-=15;
		System.out.println("4)Remaining Battery: "+battery);
		
		//5)5. A student doubles his savings using *= operator. Initial amount = ₹1500.

		int salary1=15000;
		salary1*=2;
		System.out.println("5)Salary: "+salary1);
		System.out.println();
		
		//6) A student scored 40 marks. Check whether the student is Pass or Fail.
		
		int pass=35;
		String mark=(pass>=35)?"Student is pass":"Student is Fail";
		System.out.println("6)Marks: "+mark);
		
		//7)Two friends have ages 18 and 20. Find who is older using conditional operator.
		
		int fd1,fd2;
		fd1=18;fd2=20;
		String oldere=(fd1>fd2)?"friend 1 is older than friend 2":"friend 2 is older than friend 1";
		System.out.println("7)"+oldere);
		
		//8)
		//9) 9. Check whether a number is Positive or Negative using conditional operator.
        
		int nm=0;
		String check=(nm>0)?"Number is positive":"Number is negative";
		System.out.println("9)"+check);
		
		System.out.println("----------------------------");
		

		// Logial operator>> Tasks 
		System.out.println(" Logial operator");
	
		System.out.println("----------------------------");
		System.out.println();
		
		//11)11. A student can attend exam only if attendance is above 75 AND fees paid. Write a program using &&.

		int att=75;
		String paid="allow";
		System.out.println("11)");
		System.out.println("i)attendace>75 and fees paid: "+(att>=75&&paid=="allow"));
		System.out.println("ii)attendance<75 and fees paid: "+(att<75&&paid=="allow"));
		System.out.println("iii)attendance=75 and fees not paid: "+(att>=75&&paid!="allow"));
		System.out.println("iv)attendace<75 and  fees not paid: "+ (att<75&&paid!="allow"));
		System.out.println();
		
		//12) A user can login if username OR email is correct using ||.
		
		String uname="A@1bc";
		String email="abcd@gmail.com";
		System.out.println("12)");
		System.out.println("i)uname==\"A@1bc\"||email==\"abcd@gmail.com: "+(uname=="A@1bc"||email=="abcd@gmail.com"));
		System.out.println("ii)uname!=\"A@1bc\"||email==\"abcd@gmail.com: "+(uname!="A@1bc"||email=="abcd@gmail.com"));
		System.out.println("iii)uname==\"A@1bc\"||email!=\"abcd@gmail.com: "+(uname=="A@1bc"||email!="abcd@gmail.com"));
		System.out.println("iv)uname!=\"A@1bc\"||email!=\"abcd@gmail.com: "+(uname!="A@1bc"||email!="abcd@gmail.com"));
		System.out.println();
		
		//13) A person can enter movie theatre if age is above 18 AND ticket available.
		
		int age=18;
		String t="avail";
		System.out.println("13)");
		System.out.println("i)Age is above 18 and ticket available: "+(age>=18&&t=="avail"));
		System.out.println("ii)Age is above 18 and ticket not available: "+(age>=18&&t!="avail"));
		System.out.println("iii)Age is below 18 and ticket available: "+(age!=18&&t=="avail"));
		System.out.println("iv)Age is below 18 and ticket not available: "+(age!=18&&t!="avail"));
		
		//14) 
		
		
		//15) A student gets placement if aptitude cleared AND technical round cleared.
		
		String apt="cleared";
		String tech="cleared";
		System.out.println("15)");
		System.out.println("i)Aptitude cleared and technical round cleared: "+(apt=="cleared"&&tech=="cleared"));
		System.out.println("ii)Aptitude cleared and technical round not cleared: "+(apt=="cleared"&&tech!="cleared"));
		System.out.println("iii)Aptitude not cleared and technical round cleared: "+(apt!="cleared"&&tech=="cleared"));
		System.out.println("iv)Aptitude not cleared and technical round not cleared: "+(apt!="cleared"&&tech!="cleared"));
		System.out.println();
		System.out.println("----------------------------");
	
		
		// Bit-wise operator 
		System.out.println( " Bit-wise operator" );
		System.out.println("----------------------------");
		System.out.println();
		 
		// 16) Write a Java program to perform Bitwise AND operation between two numbers.
		
		System.out.println("16)Bitwise AND-69&79:  "+(69&79));
		
		// 17) Write a Java program to perform Bitwise OR operation between two numbers.
		
		System.out.println("17)Bitwise OR-43|52: "+(43|52));
		
		// 18) 18. Write a Java program to perform Bitwise XOR operation between two numbers.

        System.out.println("18)bitwise X-OR-85^75: "+(85^75));
    	System.out.println();
        
         System.out.println("----------------------------   ");
         
        // scenario based Questions 
        
        System.out.println();
        System.out.println();
        System.out.println("          | Scenario based Questions |       ");
        System.out.println();
        System.out.println();
       
		//Assignment Operatpr 
        System.out.println("----------------------------   ");
        System.out.println(" Assignment Operator ");
        System.out.println("----------------------------   ");
        System.out.println();
        int tank1=500;
        tank1-=125;
        System.out.println("11)Remaining Wateer: "+ tank1);
        
        // 12) A classroom has 48 students.They are divided into 6 groups. write a java program to find students in each group.
        
        int cl=48;
        cl/=6;
        System.out.println("12)Students in each class: "+ cl);
        
        // 13) A customer buys 2 shirts costing rs.750 each.Write a java program to calculate the bill.
        
        int shirt=750;
        shirt*=2;
        System.out.println("13)Total Bill: "+shirt);
        
        //14) A student travels 12km daily to college. write a java program to calculate total distance traveled in 7days.
        
        int D=12;
        D*=14;
        System.out.println("14)Distance in 7 days: "+D);
        
        //15) A company gives a bonus of 5k along with salary 25k. write a java program to calculate total salary.
        
        int salary2=25000;
        salary2+=5000;
        System.out.println("15)Total Salary: "+salary2);
        
        //16) A juice shop sells one juice for rs.40. Write a java program to calculate amount for 8 juices.
        
        int juice=40;
        juice*=8;
        System.out.println("16)Amount of 8 Juices: "+juice);
        
        //17) A deposits 10k in a bank with 5% simple interest. Write a java program to calculate interest amount.a
      
        System.out.println();
        System.out.println("----------------------------   ");
        // Arithmetic Operator
        System.out.println(" Arithmetic Operator");
        System.out.println("----------------------------   ");System.out.println();
        
        //18) A cricket player scored runs: 45,55,and 70 in 3 matches. write a java program to calculate total runs.
        
        int run1,run2,run3;
        run1=45;
        run2=55;
        run3=70;
        int run=run1+run2+run3;  
        System.out.println("18)Total Runs: "+run);
        
        //19) A student's total mark is 450 of 500. Write a java program to calculate percentage.
        
        int marks=450;
        double per=(marks/500)*100;
        System.out.println("19)Percentage: "+per);
        
        //20) A car travels 240km in 4 hours. Write a java program to calculate speed.
        
        //formula-speed=distance/time
        
        int dis=240;
        int time=4;
        int speed=dis/time;
        System.out.println("20)Speed: "+speed);
        
        
        
		
		
		
		

		
		

	}

}
