package com.te.multithreading;

public class Godown {

	int products;

	public Godown(int products) {
		super();
		this.products = products;
	}
	
	synchronized public void store (int noOfItems) {
		products = products + noOfItems;
		System.out.println("Items Stored");
//		this.notify();
	}
	
	synchronized public void purchase(int noOfItems) {
		
		while(noOfItems > products) {
			System.out.println("Out of Stock! Please Wait.");
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		try {
			this.wait(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} }
		
		products = products - noOfItems;
		System.out.println("Items Purchased");
	}
	
}
