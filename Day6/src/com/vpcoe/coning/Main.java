package com.vpcoe.coning;

public class Main {
  public static void main(String[] args) {
	Student s=new Student(10,"Vaibhav");
	System.out.println("S=>"+s);
	
	try {
		System.out.println("Clone=>"+s.clone());
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
