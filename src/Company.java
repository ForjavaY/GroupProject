import java.util.HashSet;



	public class Company {
	private String name;
	private String address;
	private String phone;
	private int id;



	public Company(String name, String address, String phone, int id) {
	
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.id = id;
	}
	public void setId(int id) {
	this.id = id;
	}


	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getAddress() {
	return address;
	}
	public void setAddress(String address) {
	this.address = address;
	}
	public String getPhone() {
	return phone;
	}
	public void setPhone(String phone) {
	this.phone = phone;
	}
	public int getId() {
	return id;
	}
	public void ShowDepartment(HashSet<Department> list){

	for(Department d : list){
		
		System.out.println("Departmet: [ID : " + d.getID() + " ] \t" + " [Name : " + d.getStrName() + " ]\t" + 
				"[Status : " + d.getStatus() + "] \n");
	}

	}

}
