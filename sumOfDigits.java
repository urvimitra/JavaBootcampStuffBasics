package com.shell.demo;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n;
		System.out.println("Enter no.");
		n=in.nextInt();
		int s=0;
		while(n!=0)
		{
			s+=n%10;
			n/=10;
		}
		System.out.println("Sum of digits is "+s);

	}

}
