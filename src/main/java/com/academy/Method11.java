package com.academy;
 

	class Exam1
	{
		Exam1()
		{
			System.out.println("1");
		}
		Exam1(int a)
		{
			System.out.println("2");
		}
	}
	class Method11
	{
		public static void main(String[] args)
		{
			new Exam1();
			Exam1 t2=new Exam1(10);
		}
	}

