package com.vpcoe.waitnotify;

public class Bank {
	int balance=5000;
	public synchronized void withdraw(int amount)  {
		System.out.println("Withdrawal started: balance=> "+balance);
		if(amount>balance) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			balance=balance-amount;
		System.out.println("Withdrawal Completed: balance=> "+balance);
	}
   
	public synchronized void deposit(int amount) {
	  System.out.println("Deposit Started: balance=>"+balance);
	  balance=balance+amount;
	  System.out.println("Deposit Completed: balance=>"+balance);
	  notify();
	}
	
	@Deprecated
	void display() {
		
	}
}
