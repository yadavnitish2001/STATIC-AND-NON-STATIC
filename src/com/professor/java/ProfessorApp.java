package com.professor.java;

public class ProfessorApp {
	public static void main(String[] args) {
		System.out.println("total professor at start: "+Professor. getTotalProf());
		System.out.println("---------------------");
		Professor prof1=new Professor("Java");
		prof1.teach();
		Professor prof2=new Professor("SQL");
		prof2.teach();
		System.out.println("--------------------------");
		System.out.println("total professor at now: "+Professor. getTotalProf());
	}
}


