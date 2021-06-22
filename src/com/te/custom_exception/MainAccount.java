package com.te.custom_exception;

public class MainAccount {

	public static void main(String[] args) {
		Account account = new Account(10000);
		
		try {
			account.withdraw(15000);
		}
		catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}
