package com.te.multithreading;

public class AccountHolder{

	public static void main(String [] args) {
		
		Account account = new Account(5000);
		
		Husband husband = new Husband(account);
		Wife wife = new Wife(account);
		
//		husband.setPriority(6);
//		wife.setPriority(3);
//		Default Priority is 5 for all, same as Main Thread
		husband.start();
		wife.start();
		
//		System.out.println("Husband Priority" + husband.getPriority());
//		System.out.println("Wife Priority" + wife.getPriority());
		
		
		try {
			Thread.sleep(2000);
		}
		catch  (InterruptedException e) {
			e.printStackTrace();
		}
		
		account.checkBalance();
	}
}
