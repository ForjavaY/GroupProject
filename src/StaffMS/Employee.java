package StaffMS;


import java.util.ArrayList;
import java.util.Date;



 public  class Employee {

		private int id;
		private String fullName;
		private String birthDate;
		private Gender gender;
		private String address;
		private int telephone;
		private Date joindate;
		private String education;
		private double salary;
		private static int countId=1;
		//private static SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		private ArrayList<Employee> emplist;
		Department depObj;
		
		public Employee(int id,String fullname,String bdate,Gender gender
				,String address,int telephone,Date joindate,String education,double salary){
			
			this.id=countId++;///for employee id add by 1
			this.fullName=fullname;
			this.birthDate=bdate;
			this.gender=gender;
			this.address=address;
			this.telephone=telephone;
			this.joindate=joindate;
			this.education=education;
			this.salary=salary;
			//this.depObj=dep;
			
		}
		public Employee(){
			emplist=new ArrayList<Employee>();
			
		}
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public String getBirthDate() {
			return birthDate;
		}
		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}
		public Gender getGender() {
			return gender;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getTelephone() {
			return telephone;
		}
		public void setTelephone(int telephone) {
			this.telephone = telephone;
		}
		public Date getJoindate() {
			return joindate;
		}
		public void setJoindate(Date joindate) {
			this.joindate = joindate;
		}
		public String getEducation() {
			return education;
		}
		public void setEducation(String education) {
			this.education = education;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public ArrayList<Employee> getEmplist() {
			return emplist;
		}
		public void setEmplist(ArrayList<Employee> emplist) {
			this.emplist = emplist;
		}
		public void Add(){
			
	
			
			 Employee empObj1=new Employee(this.getId(),"Yonas Abrehqm","988-00-74",gender.MALE,
											"Stockholm",012345,null,"Computer",20);
			 Employee empObj2=new Employee(this.getId(),"Yonas Abrehqm","1988-00-74",gender.MALE,
						"Stockholm",012345,null,"Computer",20);
			 Employee empObj3=new Employee(this.getId(),"Yonas Abrehqm","988-00-74",gender.MALE,
						"Stockholm",012345,null,"Computer",20);
			Employee empObj4=new Employee(this.getId(),"Yonas Abrehqm","988-00-74",gender.MALE,
						"Stockholm",012345,null,"Computer",20);
			Employee empObj5=new Employee(this.getId(),"Yonas Abrehqm","988-00-74",gender.MALE,
						"Stockholm",012345,null,"Computer",20);
			Employee empObj6=new Employee(this.getId(),"Yonas Abrehqm","988-00-74",gender.MALE,
						"Stockholm",012345,null,"Computer",20);
			
		    emplist.add(empObj1);
			emplist.add(empObj2);
			emplist.add(empObj3);
			emplist.add(empObj4);
			emplist.add(empObj5);
			emplist.add(empObj6);
		
		}
		public void update(){
			
			System.out.println(emplist.indexOf(2));
			for(Employee s:emplist){
				System.out.println(s.getAddress());
			}
			
			
			//this.displayall();
		}
		public void displayall(){
		
			this.Add();
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
		}
		public int remove(int id){
			return 1;
		}
		public int calculate (int id){
			
			return 1;
		}
		
		
}
