package com.academy;

public class ConstructorDemo {

	int age;
	String colour;
	
	void eat() {
		System.out.println("iam eating");
	}
	
	void run()
	{
		System.out.println("iam running");
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo d = new ConstructorDemo();
		d.age=10;
		d.colour="black";
		System.out.println("age is :"+d.age);
		System.out.println("colour is :"+d.colour);
        d.eat();
        d.run();
        System.out.println("--------------------");
        ConstructorDemo c = new ConstructorDemo();
		c.age=10;
		c.colour="black";
		System.out.println("age is :"+c.age);
		System.out.println("colour is :"+c.colour);
        d.eat();
        d.run();
        
	}

}
