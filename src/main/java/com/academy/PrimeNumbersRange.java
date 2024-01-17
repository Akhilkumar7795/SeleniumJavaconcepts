package com.academy;

import java.util.Scanner;

public class PrimeNumbersRange {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);
	    System.out.print("Enter the lower limit: ");
	    int lowerLimit = SC.nextInt();
	    System.out.print("Enter the upper limit: ");
	    int upperLimit = SC.nextInt();
	    int sum = 0;
	    for (int i = lowerLimit; i <= upperLimit; i++) {
	      boolean isPrime = true;
	      for (int j = 2; j < i; j++) {
	        if (i % j == 0) {
	          isPrime = false;
	          break;
	        }
	      }
	      if (isPrime) {
	        sum=sum+i;
	      }
	    }
	    System.out.println("The sum of prime numbers between " + lowerLimit + " and " + upperLimit + " is: " + sum);
	
	  }
	}