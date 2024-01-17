package com.academy;

//public class MethodOverloading1111 {

	class Frm
	{
		Frm()
		{
			System.out.println("1");
		}
		Frm(int a)
		{
			System.out.println("2");
		}
	}
	class MethodOverloading1111
	{
		public static void main(String[] args)
		{
			new Frm();
			Frm t2=new Frm(10);
		}




}
