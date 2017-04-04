package StaffMS;


import java.util.*;

import javax.swing.JOptionPane;

public class MianClass {


		public static void main(String[] args){

			//Employee e=new Employee();
		// createdData();
		
		//	e.addNew();
			Report rp=new Report();
			rp.reportOne();
			ArrayList<Employee> empList = rp.empList;

// Create MainHelper instance to add/update/remove employees
			MainHelper helper = new MainHelper();
			
			String input = JOptionPane.showInputDialog("Please choose a number from 1 to 4\n 1: Show report \n 2: Add employee \n 3: Update employee \n 4: Remove employee");
			int choice = Integer.parseInt(input);
			switch(choice){
			
			case 1:
				//show information();
				rp.reportOne();
				break;
			case 2:
				//Add new employee
				helper.addNew(empList);
				System.out.println(empList.toString());
				break;
			case 3:
				//Update employee
				helper.update(empList);
				rp.reportOne();
				break;
			case 4:
				//Remove employee
				helper.remove(empList);
				helper.displayList(empList);
				break;			
			default:
				System.out.println("Please choose a number from 1 to 4\n 1: Show report \n 2: Add employee \n 3: Update employee \n 4: Remove employee");		
			}
			
			//ArrayList<Employee> emplist = new ArrayList<Employee>();
			
		//	Department d=new Department();
			//d.displayallDepartment();
	
		}



}
