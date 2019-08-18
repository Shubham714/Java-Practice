package com.vpcoe.synch;

public class PrintTable {
  
  
  //public synchronized void print()
	public void print() {
		System.out.println("Print method started");
				
		synchronized(this) {
		for(int i=1;i<=10;i++) {
		   if(Thread.currentThread().getName().equals("Thread-0")) {
			try {
				this.wait();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		System.out.println(Thread.currentThread().getName()+"=>"+(i*5));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
		
		}this.notify();
		}
	}
}
