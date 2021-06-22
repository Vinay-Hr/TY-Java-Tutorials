package com.te.oops;

public class CarMain {

	public static void main(String[] args) {
//		Car car = new Audi();
//		car.start();
//		car.accelerate();
//		car.brakes();
//		
//		System.out.println("-----------");
//
//		Bmw bmw = new Bmw();
//		car.start();
//		car.accelerate();
//		car.brakes();
//		car.airbags();
//		
		
		Driver driver = new Driver();
		driver.drive(new Audi ());
		
		System.out.println("-------------");
		
		driver.drive(new Bmw ());
	}

}
