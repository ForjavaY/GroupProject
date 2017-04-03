package StaffMS;

import java.sql.Date;
import java.util.ArrayList;





public class MianClass {

		public static void main(String []args){

	//		Employee e=new Employee();
		
		//	e.displayall();
			//e.update();
			Department d=new Department();
			d.displayallDepartment();
			System.out.println("-------------------------------------------------------------------------------------");
			Date date1 =new Date(2015, 8, 9);
		
			
			
			
			
			
		    Secretory sec1 = new Secretory(1, "Matilda Johansson", "1988/08/01", Gender.FEMALE, "Årstaberg",
		    		132654, date1, "Nothing", 15, 0.0);
		    System.out.println(sec1.toString());
		    
		    Technician tec1 = new Technician(1, "Matilda ", "1988/08/01", Gender.FEMALE, "Årstaberg",
		    		132654, date1, "Nothing", 25, 0.0);
		    System.out.println(tec1.toString());
		    
		    Programmer prog1 = new Programmer(1, "Matilda Johansson", "1988/08/01", Gender.FEMALE, "Årstaberg",
		    		132654, date1, "Nothing", 15, 0.0);
		    System.out.println(prog1.toString());
		    
		    ArrayList<Employee> emplist = new ArrayList<Employee>();
			emplist.add(prog1);
			emplist.add(tec1);
			emplist.add(sec1);
			
			Management manager = new Management();

			double averageSalary = manager.averageSalary(emplist);
			System.out.println(averageSalary);
			
			
		}
}
