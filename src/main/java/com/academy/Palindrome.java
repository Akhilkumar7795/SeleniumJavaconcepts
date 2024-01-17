package com.academy;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

	
		int no =121;int rem;int rev=0;
		int temp=no;
		
		while(temp!=0) {
			
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no + " is a Palindrome");
		}
		else {
			System.out.println(no + "  not a Palindrome");
		}
		
		}
	}
