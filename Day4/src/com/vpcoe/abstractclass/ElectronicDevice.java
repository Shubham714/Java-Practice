package com.vpcoe.abstractclass;

abstract public class ElectronicDevice {
	
	public void nonAbstractMethod() {
		System.out.println("Hey...I'm Non abstract method of Electronic Device");
	}

	public abstract void turnOn();
	public abstract void turnOff();
}
