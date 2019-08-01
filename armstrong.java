package com.shell.demo;
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter no");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int num=n;
		int s=0;
		while(n!=0)
		{
			s+=(n%10)^3;
			n/=10;
		}
		if(s==num)
			System.out.println("Armstrong");
			else
				System.out.println("Not");

	}

}
