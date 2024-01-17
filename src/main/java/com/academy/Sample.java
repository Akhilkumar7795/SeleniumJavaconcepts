package com.academy;

class A
{
	void show1()
	{
		System.out.println("i am in class A");
	}
}
class B extends A
{
	void show2()
	{
		System.out.println("i am in class B");
	}
}
class C extends B
{
	void show3()
	{
		System.out.println("i am in class C");
	}
}
class Sample
{
	public static void main(String[] args)
	{

		C ob3=new C();
		ob3.show1();
		ob3.show2();
		ob3.show3();
		
		
	}

}