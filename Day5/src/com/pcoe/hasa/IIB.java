package com.pcoe.hasa;

public class IIB {
	int a,b;
	static int c;
	static{
		c=0;
		System.out.println("Static block");
	}
	{
		a=10;
		c=100;
		System.out.println("IIB1 is executed");
	}
	{
		System.out.println("IIB2 is executed");
	}
      IIB(){
    	  System.out.println("Constructor called");
      }
	
	public static void main(String[] args) {
		IIB iib=new IIB();
	}
}
