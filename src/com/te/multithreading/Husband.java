package com.te.multithreading;

public class Husband extends Thread {
		
		Account a;
		
		public Husband(Account a) {
			super();
			this.a = a;
		}
		
		@Override
		public void run() {
			
			 a.deposit(1000);
			 System.out.println(Thread.currentThread().getName());
		}

		
		
}
