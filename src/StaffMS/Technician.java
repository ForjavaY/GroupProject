package StaffMS;



public class Technician extends Employee {
	
	
	public Technician (String fullname,String bdate,String gender
			,String address,int telephone,String joindate,String education,double salary,double bonus){
		
 		super(fullname,bdate, gender,address,telephone,joindate,education, salary);
		this.bonus=bonus;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double bonus(){
		newSalary=bonus + super.getSalary();
		return newSalary;
	}
	private double bonus=0.0d;
	private double newSalary=0.0d;
}
