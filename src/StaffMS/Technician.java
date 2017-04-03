package StaffMS;

import java.util.Date;

public class Technician extends Employee {
	
	private double bonus;
	public Technician (int id,String fullname,String bdate,String gender
			,String address,int telephone,Date joindate,String education,double salary,double bonus){
		
		super( id,fullname,bdate, gender,address,telephone,joindate,education, salary);
		this.bonus=bonus;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}
