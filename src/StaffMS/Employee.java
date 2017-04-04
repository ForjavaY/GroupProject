package StaffMS;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;




 public  class Employee {

		private int id;
		private String fullName;
		private String birthDate;
		private String gender;
		private String address;
		private int telephone;
		private String joindate;
		private String education;
		private double salary;
		private static int countId=1;
		//private static SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		private ArrayList<Employee> emplist;
		Department depObj;
		public  double getBonus(){return 0;}
		
		public Employee(int id,String fullname,String bdate,String gender
				,String address,int telephone,String joindate2,String education,double salary){
			
			this.id=countId++;///for employee id add by 1
			this.fullName=fullname;
			this.birthDate=bdate;
			this.gender=gender;
			this.address=address;
			this.telephone=telephone;
			this.joindate=joindate2;
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
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
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
		public String getJoindate() {
			return joindate;
		}
		public void setJoindate(String joindate) {
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
		
		public void addNew() {
			
		    System.out.println("\nEnter each value\n" + " ENTER 1 for add 0 for exit.");
		     Scanner sc=new Scanner(System.in);
		     int ch=sc.nextInt();
		      final int validateLength=6;
			  String[] str={"Year","Month","Date"};
		      String date="";
		      String name="";
		   while(ch==1){
						    Scanner input = new Scanner(System.in);
						    System.out.println("please name");
					         name = input.nextLine();
					        if (name.length() < validateLength) {
					            System.out.println("Enter a valid username");
					            System.out.println(
					                "User name must contain " + validateLength + " characters");
					            System.out.println("Enter again:");
					            name = input.nextLine();
					        }
					        for(int i=0;i<3;i++){
								System.out.println("please enter birth"+str[i] +" : ");
								date= date + input.next() +"-";
					         }
					      String  birthdate=date.substring(0,date.length()-1);
					        	
					        	
					        System.out.println("please enter gender Male/Female ");
					        String geneder=input.nextLine();
					        System.out.println("please  enter city");
					        String city=input.nextLine();
					        System.out.println("please telephone");
					        int tel=input.nextInt();
					      //  ZoneId zoneId=ZoneId.of("Europe/Berlin");
					        String hdate=input.nextLine();//LocalDate.now(zoneId);
					        System.out.println("please enter education");
					        String education =input.nextLine();
					        System.out.println("Please enter Salary");
					        double salary=input.nextDouble();
					   
							 Employee empObject=new Employee(this.getId(),name,birthdate,geneder,city,tel,hdate,education,salary);
							 emplist.add(empObject);
					            
					           System.out.println("Do you want add more for yes enter 1  for no enter 0");
					           ch=sc.nextInt();
		   				} 
		  // for(int i=0;i<mylist.size();i++){
			//   System.out.println(mylist.get(i).getId());
		   //}
		   
			///
		   displayall();
	
		
		}
		public void update(){
			
			System.out.println(emplist.indexOf(2));
			for(Employee s:emplist){
				System.out.println(s.getAddress());
			}
			
			
			//this.displayall();
		}
		public void displayall(){
		
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
				
		
		public int remove(int id){
			return 1;
		}
		public int calculate (int id){
			
			return 1;
		}

		public void createdData() {
				
				String date="1988/02/14";
				SimpleDateFormat df=new SimpleDateFormat("yyyy/mm/dd");
				 Date d=null;
				try{
				d=df.parse(date);
				}catch(Exception e){
					e.printStackTrace();
				}
				
				Employee empObj1 = new Employee(this.getId(), "Yonas Abrehqm",
						date, "Male", "Stockholm", 012345, null, "Computer", 20);
				Employee empObj2 = new Employee(this.getId(), "Yonas Abrehqm",
						date, "Male", "Stockholm", 012345, null, "Computer",
						860);
				Employee empObj3 = new Employee(this.getId(), "Yonas Abrehqm",
						date, "Male", "Stockholm", 012345, "1988-02-14", "Computer", 20);
				Employee empObj4 = new Employee(this.getId(), "Yonas Abrehqm",
						date, "Male", "Stockholm", 012345, null, "Computer",
						9720);
				Employee empObj5 = new Employee(this.getId(), "Yonas Abrehqm",
						date, "Male", "Stockholm", 012345, null, "Computer", 270);
				Employee empObj6 = new Employee(this.getId(), "Yonas Abrehqm",
						date, "Male", "Stockholm", 012345, null, "Computer", 560);
		
				emplist.add(empObj1);
				emplist.add(empObj2);
				emplist.add(empObj3);
				emplist.add(empObj4);
				emplist.add(empObj5);
				emplist.add(empObj6);
		}
		
		
}
