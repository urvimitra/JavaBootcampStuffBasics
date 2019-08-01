package com.shell.demo;
class Employee
{
	private String name;
	private int code,hoursworked,hourlywage;
	Employee(int c,int h,int w,String n)
	{
		name=n;
		code=c;
		hoursworked=h;
		hourlywage=w;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getHoursworked() {
		return hoursworked;
	}
	public void setHoursworked(int hoursworked) {
		this.hoursworked = hoursworked;
	}
	public int getHourlywage() {
		return hourlywage;
	}
	public void setHourlywage(int hourlywage) {
		this.hourlywage = hourlywage;
	}
	
}
public class WageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(1,6,100,"abc");
		int totalwage=e.getHourlywage()*e.getHoursworked();
		System.out.println(e.getCode()+" "+e.getName()+" "+totalwage);
	

	}

}
