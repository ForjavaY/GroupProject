package StaffMS;
import java.util.ArrayList;

public class Department {
	
		public int ID;
		private String strName;
		private  boolean boolStatus=true;
		private static int countDepId = 1;
		
		private ArrayList<Department> depList;
		
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
		public Department(){//Default constractur
			depList=new ArrayList<Department>();
		}
		public Department(int id,String strName, boolean boolStatus) {
			
			ID = countDepId++;
			this.strName = strName;
			this.boolStatus = true;
		}
		public void AddDepartment(){
			
			 Department depObj1=new Department(this.getID(),"Technicians",true);
			 Department depObj2=new Department(this.getID(),"Secretary",true);
			 Department depObj3=new Department(this.getID(),"Programmer",true);
			 Department depObj4=new Department(this.getID(),"Administrator",true);
		
			
		    depList.add(depObj1);
			depList.add(depObj2);
			depList.add(depObj3);
			depList.add(depObj4);
		}
		public void displayallDepartment(){
			
			this.AddDepartment();
			System.out.println("\n\nList of Department");
			System.out.println("--------------------------------------");
			System.out.println("id |\t Department |\t Status ");
			System.out.println("---------------------------------------");
			for(int i=0;i<depList.size();i++){
				System.out.println(depList.get(i).getID()+" | "+depList.get(i).getStrName()+" |\t "+ depList.get(i).getStatus());
			}
			System.out.println("-----------------------------------------");
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
