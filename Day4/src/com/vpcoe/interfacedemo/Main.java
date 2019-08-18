package com.vpcoe.interfacedemo;

public class Main {

	public static void main(String[] args) {
		
		Marksheet m=new Marksheet();
		m.print();
		m.sample();
		
		BusTicket bt=new BusTicket();
		bt.paidMoney();
		bt.print();
	}
}
