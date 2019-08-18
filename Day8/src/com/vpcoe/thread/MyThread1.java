package com.vpcoe.thread;

public class MyThread1 extends Thread {
	public MyThread1(String name) {
		super(name);
	}

	@Override
	public synchronized void run() {
		System.out.println("Thread1 is started...");
		System.out.println("Current:"+Thread.currentThread());
		for(int i=1;i<=10;i++) {
			System.out.println("Thread1=> "+i);
			if(i==5) {
				try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
				
			try {
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread1 is stopeed...");
	}
}
