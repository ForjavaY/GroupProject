package StaffMS;

import java.util.Date;
public class Programmer extends Employee {

   private double bonus;
	
	public Programmer(int id,String fullname,String bdate,Gender gender
			,String address,int telephone,Date joindate,String education,double salary,double bonus){
		
		super( id,fullname,bdate, gender,address,telephone,joindate,education, salary);
		this.bonus=bonus;
		
	}
	
	@Override
	public String toString() {
		return "Programmer "+  "FullName=" + getFullName() +"Salary"+getSalary() + "Gender=" + getGender() + "]";
	}

	public void setBonus(double bonus){
		this.bonus=bonus;
	}
	
	//public double getSalary(){
		//double basesalary=super.getSalary();
		//return basesalary*bonus;
		
		
		
		
	}
	
