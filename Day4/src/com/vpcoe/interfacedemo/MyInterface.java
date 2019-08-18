package com.vpcoe.interfacedemo;

public interface MyInterface {

	public static final int val=10;
	int val2=20; //public static final
	
	void print();  //public abstarct
	
	default void sample() {
		System.out.println("Hi...default implemeted");
	}
}
