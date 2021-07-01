package com.te.multithreading;

public class Manufacturer extends Thread{

	Godown godown;
	int items;
	public Manufacturer(Godown godown, int items) {
		super();
		this.godown = godown;
		this.items = items;
	}
	@Override
	public void run() {
		godown.store(items);
	}
	
	
}
