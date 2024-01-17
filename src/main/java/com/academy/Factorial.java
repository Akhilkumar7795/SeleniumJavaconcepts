package com.academy;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {


int fact=1;
int n=9;
for(int i=1;i<=n;i++) {
	fact=fact*i;
}
	
System.out.println("factorial of a entered number is : "+fact);

	}

}
