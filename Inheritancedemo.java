package com.shell.demo;
class Shape
{
	private int noofSides;
	public int getNoOfSides()
	{
		return noofSides;
	}
	public void setNoOfSides(int noOfSides)
	{
		this.noofSides=noOfSides;
	}
}
class Circle extends Shape
{
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
public class Inheritancedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle=new Circle();
		circle.setNoOfSides(0);
		circle.setRadius(12.4);
		
	}

}
