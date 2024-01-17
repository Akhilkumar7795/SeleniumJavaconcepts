package com.academy;

import java.util.Scanner;

public class CheckStringPalindrome {

	public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string: ");
	String leng =sc.nextLine();
	String rev="";
	for(int i=leng.length()-1;i>=0;i--)
	{
		rev=rev+leng.charAt(i);
	}
	if(leng.equals(rev))
	
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a palindrome");
	}
	}

}
