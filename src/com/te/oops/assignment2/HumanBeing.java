package com.te.oops.assignment2;

public class HumanBeing {

	public void Human(Mind mind)
	{
		mind.read();
		mind.speak();
		mind.think();
	}
	
	public void Human(Body body)
	{
		body.walk();
		body.run();
		body.sleep();
		body.breathe();
	}
}
