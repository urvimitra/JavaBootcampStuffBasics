package com.shell.demo;

public class AuMauChau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=110;i++)
		{
			if(i%3==0&&i%5==0&&i%7==0)
				System.out.print("AauMauChau"+" ");
			else if(i%3==0&&i%5==0)
				System.out.print("AauMau"+" ");
			else if(i%5==0&&i%7==0)
				System.out.print("MauChau"+" ");
			else if(i%3==0&&i%7==0)
				System.out.print("AauChau"+" ");
			else if(i%3==0)
				System.out.print("Aau"+" ");
			else if(i%5==0)
				System.out.print("Mau"+" ");
			else if(i%7==0)
				System.out.print("Chau"+" ");
			else
				System.out.print(i+" ");
			
			if(i%11==0)
				System.out.println();
				
			
			
			
		}

	}

}
