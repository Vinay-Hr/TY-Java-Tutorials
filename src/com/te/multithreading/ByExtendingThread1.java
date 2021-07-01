package com.te.multithreading;

public class ByExtendingThread1 extends Thread{

	@Override
	public void run() {
		for (char ch = 'A'; ch<='Z'; ch++) {
			System.out.println(ch +"-->"+ Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
