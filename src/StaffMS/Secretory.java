package StaffMS;

import java.util.Date;

public class Secretory extends Employee {
	
	private double bonus;
	
	public Secretory(int id,String fullname,String bdate,Gender gender
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





	@Override
	public String toString() {
//		return "Secretory [bonus=" + bonus + ", getFullName()=" + getFullName() + ", getBirthDate()=" + getBirthDate()
//				+ ", getGender()=" + getGender() + "]";
		
		return "Secretory [" + "Full Name=" + getFullName() + ", BirthDate=" + getBirthDate()
		+ ", Gender=" + getGender() + "]";
		
	}
	
	
}
