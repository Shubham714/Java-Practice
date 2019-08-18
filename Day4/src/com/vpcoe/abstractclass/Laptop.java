package com.vpcoe.abstractclass;

public class Laptop extends ElectronicDevice {


	@Override
	public void turnOn() {
	System.out.println("Laptop is Turned ON");	
	}

	@Override
	public void turnOff() {
		System.out.println("Laptop is Turned Off");
		
	}
}
