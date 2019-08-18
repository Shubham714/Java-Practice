package com.vpcoe.innerclasses;

public class Outer {
	static private int a=100;
	void show() {
		System.out.println("Outer->"+a);
	}
	
	static class Inner{
		static int b=200;
		void disp() {
			System.out.println("Add->"+(a+b));
		}
	}
}
