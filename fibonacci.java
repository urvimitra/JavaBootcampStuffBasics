package com.shell.demo;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		int c=a+b;
		System.out.println("First 10 terms");
		System.out.println(a+"\n"+b);
		for(int i=3;i<=10;i++)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}

	}

}
