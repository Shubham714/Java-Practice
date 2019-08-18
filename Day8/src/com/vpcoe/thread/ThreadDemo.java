package com.vpcoe.thread;

public class ThreadDemo {
 public static void main(String[] args) {
	
	 MyThread1 t1=new MyThread1("ThreadOne");
	 MyThread2 t2=new MyThread2();
	 Thread t=new Thread(t2);
	 t1.setPriority(Thread.MAX_PRIORITY);
	 t1.start();
	 t.start();
//	 t.setPriority(3);
//	 System.out.println("Priority t1:"+t1.getPriority());
//	 System.out.println("Priority t:"+t.getPriority());
//	 System.out.println("Current:"+Thread.currentThread());
	/* try {
		t1.join(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 try {
		t.join(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
//	 //t1.setName("ThreadOne");
//	 System.out.println("Thread name:"+t1.getName());
//	 System.out.println("ID:"+t1.getId());
//	 System.out.println("Daemon"+t1.isDaemon());
//	 t1.setDaemon(true);
}
}
