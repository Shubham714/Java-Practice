package com.vpcoe.interfacedemo;

public class BusTicket  extends PayMoney implements MyInterface,MyInterface2{

	@Override
	public void print() {
		System.out.println("Printing BusTicket");
		
	}

}
