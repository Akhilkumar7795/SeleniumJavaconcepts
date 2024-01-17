package com.academy;

public class ReverseStringUsingBuffer {

	public static void main(String[] args) {


		String name ="Akhil";
		StringBuffer reversed = new StringBuffer(name);
		
reversed.reverse();
System.out.println(reversed);
	}

}
