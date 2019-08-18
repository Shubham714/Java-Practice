package com.vpcoe.synch;

public class MyThread1 extends Thread{
	PrintTable p;
	
	public MyThread1(PrintTable p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		p.print();
		
	}
	
	

}
