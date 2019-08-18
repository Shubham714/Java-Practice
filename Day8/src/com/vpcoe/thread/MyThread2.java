package com.vpcoe.thread;

public class MyThread2 implements Runnable{

	@Override
	public synchronized void run() {
		System.out.println("Thread2 is started...");
		for(int i=11;i<=20;i++) {
			System.out.println("Thread2=> "+i);
			if(i==17) {notify();}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread2 is stopeed...");
		
}
}
