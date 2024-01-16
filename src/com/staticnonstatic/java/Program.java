package com.staticnonstatic.java;
public class Program {
	static int x,y;
	static {
		System.out.println("Static Block");
		x=10;
		y=20;
	}
	static void disp1() {
		System.out.println("Static methods");
		System.out.println("x:"+x);
		System.out.println("Y:"+y);
	}
	int p,q;{
		System.out.println("Non static block");
		p=55;
		q=65;
		x=75;
		y=85;
	}
	void disp2() {
		System.out.println("Non-static methods");
		System.out.println("p:"+p);
		System.out.println("Q:"+q);
		System.out.println("x:"+x);
		System.out.println("Y:"+y);
	}
	Program(){
		System.out.println("Constructor");
	}
}
