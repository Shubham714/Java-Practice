package com.pcoe.hasa;

public class Main {
	static{
	
		System.out.println("Static block executed:main");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method executed");
		
		Date d=new Date(10,12,1995);
		Person p=new Person("Pradip","Pune",78,d);
		
		System.out.println(p);
		
		p.dispX();
	}
	
	
}
