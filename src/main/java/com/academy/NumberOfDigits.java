package com.academy;

public class NumberOfDigits {

	public static void main(String[] args) {
		
		int no =34587657;
		int length =0;
		
		while(no!=0)
		{
			length=length+1;
			no=no/10;
		}
System.out.println("length is  "  +  length);
	}

}
