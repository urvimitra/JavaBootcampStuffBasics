package com.shell.demo;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter no");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		boolean flag=true;
		for(int i=2;i<n/2;i++ )
			if(n%i==0) {
				flag=false;
				break;}
		if(flag)
			System.out.println("prime");
		else
			System.out.println("not prime");

	}

}
