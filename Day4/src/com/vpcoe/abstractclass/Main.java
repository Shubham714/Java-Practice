package com.vpcoe.abstractclass;

public class Main {
 
	public static void main(String[] args) {
		ElectronicDevice ed=new Fan();
		
		ed.nonAbstractMethod();
		ed.turnOn();
		ed.turnOff();
		
	Fan f=new Fan();
		f.FanMethod();
		
		Mobile m=new Mobile();
		m.turnOn();
		m.turnOff();
		
		Laptop l=new Laptop();
		l.turnOn();
		l.turnOff();
	}
}
