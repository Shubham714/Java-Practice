package com.vpcoe.abstractclass;

public class Mobile extends ElectronicDevice{

	@Override
	public void turnOn() {
	System.out.println("Mobile is Turned ON");	
	}

	@Override
	public void turnOff() {
		System.out.println("Mobile is Turned Off");
		
	}
}
