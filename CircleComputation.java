package com.shell.demo;

import java.util.Scanner;

public class CircleComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double r,a,c;
		System.out.println("Enter radius: ");
		r=in.nextDouble();
		a=3.14*r*r;
		c=2*3.14*r;
		System.out.println("The Area is: "+Math.round(a*100.0)/100.0);
		System.out.println("The circumference is:  "+Math.round(c*100.0)/100.0);

		
		
		
		

	}

}
