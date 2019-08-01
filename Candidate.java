package com.shell.bean;

public class Candidate {

	private int id;
	private String name;
	private int[] marks; 
	private boolean joining;
	public Candidate(int i,String s, int[] m, boolean j)
	{
		id=i;
		name=s;
		marks=m;
		joining=j;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public boolean isJoining() {
		return joining;
	}
	public void setJoining(boolean joining) {
		this.joining = joining;
	}
	
}

