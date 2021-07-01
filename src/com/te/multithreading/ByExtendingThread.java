package com.te.multithreading;

public class ByExtendingThread extends Thread{

	@Override
	public void run() {
		for (char ch = 'a'; ch<='z'; ch++) {
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
