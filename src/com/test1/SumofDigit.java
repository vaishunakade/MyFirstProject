package com.test1;

import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int n = sc.nextInt();
		int  last_digit;
		int first_digit = 0;
		last_digit = n%10;
		while(n>0)
		{
			first_digit = n%10;
			n=n/10;
		}
		int sum = 0;
		sum = last_digit+first_digit; 
		System.out.println(sum);		

	}

}
