package com.te.blocks;

public class InheritedBlocks extends Blocks
{
	InheritedBlocks()
	{
		System.out.println("Constructor Block for SubClass");
	}
	static
	{
	System.out.println("Static Method of Sub Class");
	}
	
	{
		System.out.println("Non-Static Method of Sub Class");
	}
	
	public static void main()
	{
		System.out.println("Main Method of SubClass");
		InheritedBlocks InBlocks = new InheritedBlocks();
	}
}
