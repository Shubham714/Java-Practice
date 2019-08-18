package com.vpcoe.waitnotify;
@SuppressWarnings(value = { "unused" })
public class Test {
	
	public static void main(String[] args) {
		int a=100;
		Bank b=new Bank();
	
		Bank b1=new Bank();
	Bank b2=new Bank();
	Bank b3=new Bank();
		
		
		new Thread(){
			public void run() {
		 	b.withdraw(7000);
			}
		}.start();
		
		new Thread(){
			public void run() {
		 	b.deposit(8000);
			}
		}.start();
	}
}
