package com.te.multithreading;

public class Account {

	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		if (amount>balance) {
			System.out.println("Insufficient Balance");
			return;
		}
		balance -=amount;
		System.out.println("Cash Withdrawn");
	}
	
	public synchronized void deposit(double amount) {
		
		double temp = balance;
		temp = temp + amount;
//		try {
//			Thread.sleep(200);
//		}
//		catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		balance = temp;
		System.out.println("Deposit Successful");
	}
	
	public synchronized void checkBalance()  {
		
		System.out.println("Current Balance:" +balance);
		return;
	}
}
