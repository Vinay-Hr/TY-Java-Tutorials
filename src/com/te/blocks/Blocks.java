package com.te.blocks;

public class Blocks 
{
	Blocks()
	{
		System.out.println("Constructor Block");
	}
	static
	{
	System.out.println("Static Method");
	}
	
	{
		System.out.println("Non-Static Method");
	}
	
	public static void main()
	{
		System.out.println("Main Method of Super Class");
		Blocks blocks = new Blocks();
	}
}
