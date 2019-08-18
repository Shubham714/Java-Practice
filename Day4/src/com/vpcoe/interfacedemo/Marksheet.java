package com.vpcoe.interfacedemo;

public class Marksheet implements MyInterface {

	@Override
	public void print() {
		System.out.println("Printing Marksheet : marks="+(val+val2));
	}

}
