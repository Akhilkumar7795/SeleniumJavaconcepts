package com.academy;

class Employee{
	
	String empid;
	String empname;
	Address addr;
	Employee(String empid1,String empname1,Address addr1){
		empid=empid1;
		empname=empname1;
		addr=addr1;	
	}
	 void empDetails() {
		 System.out.println("Employee id :"+empid);
		 System.out.println("Employee name :"+empname);
		 System.out.println("Employee Address :");
		 System.out.println("location is :"+addr.location);
		 System.out.println("city is :"+addr.city);
		 System.out.println("State is :"+addr.state);
	 }
}
class Address{
	
	String location;
   String city;
  String state;
	 Address(String location1,String city1,String state1)
	 {
		 location=location1;
		 city = city1;
		 state = state1; 
	 }
}

public class OneToOneDemo {

	public static void main(String[] args) {
		
Address ad = new Address("#100,Sector2","ballari","karnataka");

Employee eb = new Employee("101","Akhil",ad);
eb.empDetails();


	}

}
