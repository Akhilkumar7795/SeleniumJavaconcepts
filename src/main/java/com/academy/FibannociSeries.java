package com.academy;

import java.util.Scanner;

public class FibannociSeries {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of digits : " );
		int c = sc.nextInt();
		int no1 = 0,no2=1;
		System.out.print(no1 +" " + no2);//to get output in a line
		for(int i=1;i<=10;i++)
		{
		c=no1+no2;
		System.out.print(" " + c);
		
		no1=no2;
		no2=c;
		
		
	}

}}
