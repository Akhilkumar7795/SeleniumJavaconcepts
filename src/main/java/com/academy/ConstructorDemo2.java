package com.academy;

public class ConstructorDemo2 {

	int age;
	String colour;
	
	ConstructorDemo2(int age1,String colour1)
	{
		age=age1;
		colour=colour1;
		
	}
	
	void eat() {
		System.out.println("iam eating");
	}
	
	void run()
	{
		System.out.println("iam running");
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo2 d = new ConstructorDemo2(10,"black");
		System.out.println("age is :"+d.age);
		System.out.println("colour is :"+d.colour);
        d.eat();
        d.run();
        System.out.println("--------------------");
        ConstructorDemo2 c = new ConstructorDemo2(20,"red");
		System.out.println("age is :"+c.age);
		System.out.println("colour is :"+c.colour);
        d.eat();
        d.run();
	}
}