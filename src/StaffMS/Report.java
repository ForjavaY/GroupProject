package StaffMS;

import java.util.*;
public class Report {

		public Report(){
			
		}
		Employee empObj=new  Employee();
		
		
		public void reportOne(){
			
		ArrayList<Employee> empList=new ArrayList<Employee>();
		Employee techObj=new Technician(empObj.getId(), "Cristopher ","1988/02/14", "Male", "Stockholm", 07356, null, "Computer", 25000,20);
		Employee secObj=new Secretory(empObj.getId(), "Sofi Udda","1981/02/14", "Male", "Malimo", 012345, null, "Computer", 30000,200);
		Employee secObj1=new Secretory(empObj.getId(), " Udda","1981/02/14", "Male", "Malimo", 012345, null, "Computer", 21000.5,200);
		Employee proObj=new Programmer(empObj.getId(), "Yonas A","1981/02/14", "Male", "Malimo", 012345, null, "Computer", 50000,350);
		
		empList.add(techObj);
		empList.add(secObj);
		empList.add(secObj1);
		empList.add(proObj);
		
		displayall(empList);
		
		 
		}
		

		public void displayall(ArrayList<Employee> emplist){
			
			//this.Add();
		
			System.out.println("\nList of Employee");
			System.out.println("-----------------------------------------------------------------------------------------------------");
			System.out.println("id |\tfullname |\t bdate |\t gender | address | telephone | joindate |education | salary | ");
			System.out.println("-----------------------------------------------------------------------------------------------------");
			for(int i=0;i<emplist.size();i++){
				System.out.println(emplist.get(i).getId()+" | "+emplist.get(i).getFullName()+" |\t "+ emplist.get(i).getBirthDate()
						+ " |\t " + emplist.get(i).getGender()+ " |\t " + emplist.get(i).getAddress()+ " |\t " + emplist.get(i).getTelephone()+ 
						" |\t "+ emplist.get(i).getJoindate()+ " |\t " + emplist.get(i).getEducation()+ " |\t " +
								""+ emplist.get(i).getSalary()  );
			}
			System.out.println("-----------------------------------------------------------------------------------------------------");
			//createdData();
			
			System.out.println("Total Avarage Salary =" +totalAvarageSalary(emplist));
			System.out.println("Total Avarage Salary of Technician =" +AvarageSalarayTechinician(emplist));
			System.out.println("Total Avarage Salary of Secretory =" +AvarageSalaraySecretory(emplist));
			System.out.println("Total Avarage Salary of Programmer =" +AvarageSalarayProgrammer(emplist));
			System.out.println("Total percentage of employee =" +GenderPercentage(emplist));
			
		}
		public double AvarageSalarayTechinician(ArrayList<Employee> techlist){
		   	double staffbonustech=0.0d;
		   	int count=0;
				for(Employee e: techlist){
					if(e instanceof Technician){
						 staffbonustech += e.getSalary();
						count++;
					}
				}
			return staffbonustech/count;
		}
		
		public double AvarageSalaraySecretory(ArrayList<Employee> empList){
	
			double staffbonussec=0.0d;
			int count=0;
			for(Employee e: empList){
				if(e instanceof Secretory){
				staffbonussec +=e.getSalary();
				count++;
				}
			}
			return staffbonussec/count;
		}
		
		public double AvarageSalarayProgrammer(ArrayList<Employee> empList){
			
			double staffbonusporg=0.0d;
			int count=0;
			for(Employee e: empList){
				if(e instanceof Programmer){
				staffbonusporg += e.getSalary();
				count++;
				}
			}
			return staffbonusporg;
		}
		public double totalAvarageSalary (ArrayList<Employee> emplist){
			
			double totalSalary = 0.0d;
			
			for (int i = 0; i < emplist.size(); i++) {
				totalSalary += emplist.get(i).getSalary();
			}
			if(emplist.size()<=0){
				return 0;
			}else{
				return totalSalary /emplist.size();
			}
		}
		public double GenderPercentage(ArrayList<Employee> emplist){
			double gpercentage=0.0d;
			int count=0;
			for(Employee e: emplist){
				if(e.getGender()=="Male")
				
				count++;
				
			}
			
				return gpercentage=count/100;
		}
	
	}
