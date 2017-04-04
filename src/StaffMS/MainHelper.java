package StaffMS;

import java.util.ArrayList;
import java.util.Scanner;

public class MainHelper {

	
	public void update(ArrayList<Employee> empList) {

		System.out.println("\n ENTER 1 to update or 0 for exit.");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		while (ch == 1) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter ID of Employee you want to update");
			int id = input.nextInt();
			for (Employee employee : empList) {
				if (employee.getId() == id)
					employee.update();
					
			}
			System.out.println("Do you want update more for yes enter 1  for no enter 0");
			ch = sc.nextInt();
		}

	}
	
	public void remove(ArrayList<Employee> empList){
		System.out.println("\n ENTER 1 to remove or 0 for exit.");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		while (ch == 1) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter ID of Employee you want to remove");
			int id = input.nextInt();
			int index =empList.size();
			for (Employee employee : empList) {
				if (employee.getId() == id) 
					empList.remove(index);
				index--;
			}
			System.out.println("Do you want remove more for yes enter 1  for no enter 0");
			ch = sc.nextInt();
		}

	}
	
	public void addNew(ArrayList<Employee> empList) {
		
	    System.out.println("\nEnter each value\n" + " ENTER 1 for add 0 for exit.");
	     Scanner sc=new Scanner(System.in);
	     int ch=sc.nextInt();
	      final int validateLength=6;
		  String[] str={"Year","Month","Date"};
	      String date="";
	      String name="";
	   while(ch==1){
					    Scanner input = new Scanner(System.in);
					    System.out.println("please name");
				         name = input.nextLine();
				        if (name.length() < validateLength) {
				            System.out.println("Enter a valid username");
				            System.out.println(
				                "User name must contain " + validateLength + " characters");
				            System.out.println("Enter again:");
				            name = input.nextLine();
				        }
				        for(int i=0;i<3;i++){
							System.out.println("please enter birth"+str[i] +" : ");
							date= date + input.next() +"-";
				         }
				      String  birthdate=date.substring(0,date.length()-1);
				        	
				        	
				        System.out.println("please enter gender Male/Female ");
				        String gender=input.nextLine();
				        System.out.println("please  enter city");
				        String city=input.nextLine();
				        System.out.println("please telephone");
				        int tel=input.nextInt();
				      //  ZoneId zoneId=ZoneId.of("Europe/Berlin");
				        String hdate=input.nextLine();//LocalDate.now(zoneId);
				        System.out.println("please enter education");
				        String education =input.nextLine();
				        System.out.println("Please enter Salary");
				        double salary=input.nextDouble();
				   
						 Employee empObject=new Employee(name,birthdate,gender,city,tel,hdate,education,salary);
						 empList.add(empObject);
				            
				           System.out.println("Do you want add more for yes enter 1  for no enter 0");
				           ch=sc.nextInt();
	   				} 

	
	}
	
	public void displayList(ArrayList<Employee> empList){
		System.out.println("\nList of Employee");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("id |\tfullname |\t bdate |\t gender | address | telephone | joindate |education | salary | ");
		System.out.println("-----------------------------------------------------------------------------------------------------");		
		for (Employee employee: empList){
			employee.display();
		}
	}

}
