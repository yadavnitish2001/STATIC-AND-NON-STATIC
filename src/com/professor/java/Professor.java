package com.professor.java;
public class Professor {
	//static variables
	static String univName="VTU";
	static int totalProf=0;
	//non-static variables
	int profId;
	String Subject;
	//static blocks
	static {
		System.out.println("Welcome to "+univName);
	}
	//non-static block
	{
		totalProf+=1;
		profId=totalProf;
		System.out.println("Hiring a  new professor....");
	}
	//static methods
	public static int getTotalProf() {
		return totalProf;
	}
	public void teach() {
		System.out.println("Professor Id:"+profId+" is teaching "+Subject);
	}
	public Professor(String Subject) {
		this.Subject=Subject;
	}
}
