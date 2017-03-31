import java.util.ArrayList;

public class Department {

	private int ID;
	private String strName;
	private  boolean boolStatus=true;
	private static int countDepId = 1;
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public boolean getStatus() {
		return boolStatus;
	}
	public void setStatus(boolean boolStatus) {
		this.boolStatus = boolStatus;
	}
	public Department(String strName, boolean boolStatus) {
		
		ID = countDepId++;
		this.strName = strName;
		this.boolStatus = true;
	}

	public void show(Department departmentObject){
		
		System.out.println("Departmet: [ID : " + departmentObject.getID() + " ]" + " [Name : " + departmentObject.getStrName() + " ]" + 
		"[Status : " + departmentObject.getStatus() + "]");
		
	}
	
	public void show(ArrayList<Department> list){
		
		for(Department d : list){
			
		System.out.println("Departmet: [ID : " + d.getID() + " ] \t" + " [Name : " + d.getStrName() + " ]\t" + 
		"[Status : " + d.getStatus() + "] \n");
		
		}
		
	}
}
