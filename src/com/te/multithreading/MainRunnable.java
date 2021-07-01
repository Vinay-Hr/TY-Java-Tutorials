package com.te.multithreading;

public class MainRunnable {

	public static void main(String[] args) {
		Runnable runnable = new ByImplementingRunnable();
		
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 0; i<=10; i++) {
			System.out.println(i +"-->"+ Thread.currentThread().getName());
		
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
