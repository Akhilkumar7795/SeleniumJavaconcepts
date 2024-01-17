package com.academy;

public class NumberofIntegrs {

	//public static void main(String[] args) {
		
		public static int numberOfDigits(int num) {
		    int count = 0;
		    while (num != 0) {
		        count++;
		        num /= 10;
		    }
		    return count;
		}

	}


