package com.te.multithreading;

public class MainThread {

	public static void main(String[] args) {
		ByExtendingThread thread = new ByExtendingThread();
		ByExtendingThread1 thread1 = new ByExtendingThread1();
		
		thread.start();
		thread1.start();
		
		for (int i=1; i<=10; i++)
		{
			System.out.println(i+ "-->"+ Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
