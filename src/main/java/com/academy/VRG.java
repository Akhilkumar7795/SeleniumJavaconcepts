package com.academy;

public class VRG {

	public static void main(String[] args) {
		
		methodone();
		methodone(10,20);
		methodone(10,20,30,40);

	}
public static void methodone(int                 ... x)
{
	System.out.println("var-arg metod");
}
}
