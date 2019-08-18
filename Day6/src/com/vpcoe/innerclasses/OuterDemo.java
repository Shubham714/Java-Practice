package com.vpcoe.innerclasses;

public class OuterDemo {

	Base b=new Base() {
		@Override
		void displayMessage() {
			System.out.println("Annonymous class executed");
		}
	};
	
	void callAnnonymous() {
		System.out.println("Outer class method executed");
		b.displayMessage();
	}
	
	public static void main(String[] args) {
		OuterDemo d=new OuterDemo();
		d.callAnnonymous();
	}
}
