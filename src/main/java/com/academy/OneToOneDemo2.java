package com.academy;

class Passport{
	
	String number;
	String validity;
	Person pr;
	Passport(String number1,String validity1,Person pr1){
		
		number = number1;
		validity = validity1;
pr=pr1;
	}
		void passportDetails() {
			
			System.out.println("Passport number is : "+number);
			System.out.println("Passport validity is : "+validity);
			System.out.println("Person details");
			System.out.println("Person name is : "+pr.name);
			System.out.println("Person age is : "+pr.age);
			System.out.println("Person dob is : "+pr.dob);
		}
	}

class Person{
	
	String name;
	String age;
	String dob;
	
	Person(String name1,String age1,String dob1){
		name=name1;
		age=age1;
		dob=dob1;
	}
}

public class OneToOneDemo2 {

	public static void main(String[] args) {
		
Person p = new Person("101","244","34");
Passport pp = new Passport("akhil","24",p);
pp.passportDetails();
	}

}
