package com.te.multithreading;

public class Wife extends Thread {

	Account a;
	
	public Wife(Account a) {
		super();
		this.a = a;
	}

	@Override
	public void run() {
		a.deposit(1000);
		System.out.println(Thread.currentThread().getName());
	}
	
	
}
