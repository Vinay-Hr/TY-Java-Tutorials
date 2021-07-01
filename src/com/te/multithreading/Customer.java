package com.te.multithreading;

public class Customer extends Thread{
	
	Godown godown;
	int items;
	public Customer(Godown godown, int items) {
		super();
		this.godown = godown;
		this.items = items;
	}
	@Override
	public void run() {
		godown.purchase(items);
	}
	
	

}
