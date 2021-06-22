package com.te.custom_exception;

public class Account extends MainAccount {
	
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException{
		if(amount<=balance)
		{
			System.out.println("Rs." +amount+" Withdrawn Successfully");
			System.out.println("Remaining Balance: "+ (balance-amount));
		} else {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
	}
}
