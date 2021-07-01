package com.te.multithreading;

public class MainWarehouse {

	public static void main(String[] args) {
		Godown godown = new Godown(100);
		new Customer(godown, 60).start();
		new Customer(godown, 90).start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new Manufacturer(godown, 100).start();

	}

}
