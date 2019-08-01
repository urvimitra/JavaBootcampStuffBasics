package com.shell.demo;

public class exceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int j=0;
		try
		{
			int k=i/j;
			System.out.println(k);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
