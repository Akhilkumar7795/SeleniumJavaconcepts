package com.academy;

import java.util.Scanner;

public class GreaterThreeNumbers {

		  public static void main(String[] args)
		  {
			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter the first number:");
			  int no1 = sc.nextInt();
			  System.out.println("Enter the second number");
			  int no2 = sc.nextInt();
			  System.out.println("Enter the third number");
			  int no3 = sc.nextInt();
			  int greatest=no1;
			  if(no2>greatest)
			  {
			greatest = no2;
		  }
			  if(no3>greatest)
			  {
				  greatest = no3;
			  }
			  System.out.println("greatest no is : "+greatest);
		  }}
			  