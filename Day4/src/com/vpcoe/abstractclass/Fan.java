package com.vpcoe.abstractclass;

public class Fan extends ElectronicDevice{

	@Override
	public void turnOn() {
	System.out.println("Fan is Turned ON");	
	}

	@Override
	public void turnOff() {
		System.out.println("Fan is Turned Off");
		
	}

	public void FanMethod(){
		System.out.println("FanMethod Invoked");
	}
}
