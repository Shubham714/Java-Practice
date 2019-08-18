package com.vpcoe.synch;

public class MyThread2 extends Thread {
PrintTable p;
	
	public MyThread2(PrintTable p) {
		super();
		this.p = p;
	}

	@Override
	public synchronized void run() {
		p.print();
		notify();
	}
}
