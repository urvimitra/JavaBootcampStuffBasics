package com.shell.demo;

public class Customer {
	String custid,custname;
	Customer()
	{
		custid="1";
		custname="abc";
	}
	void print()
	{
		System.out.println(custid+" "+custname);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		c.print();
	}
}

