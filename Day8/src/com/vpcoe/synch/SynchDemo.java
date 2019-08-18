package com.vpcoe.synch;

public class SynchDemo {
 public static void main(String[] args) {
	PrintTable p=new PrintTable();
	
	MyThread1 t1=new MyThread1(p);
	MyThread2 t2=new MyThread2(p);
	t1.start();
	t2.start();
}
}
