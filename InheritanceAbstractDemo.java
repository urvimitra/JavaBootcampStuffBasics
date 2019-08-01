package com.shell.demo;
abstract  class Shape
{
	int NoOfSides;
	public abstract double calculateArea();

	public int getNoOfSides() {
		return NoOfSides;
	}
	public void setNoOfSides(int noOfSides) {
		NoOfSides = noOfSides;
	}
	
}
class Circle extends Shape
{
	private double radius;

	public double getRadius() {
		return radius;
	}
	
	@Override 
	public double calculateArea() { //method overriding, polymorphism
		// TODO Auto-generated method stub
		return 0;
	}

	
}
class Rectangle extends Shape {

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


public class InheritanceAbstractDemo {
	
public static void main(String[] args)
{
	Circle circle=new Circle();
}
}
