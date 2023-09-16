package com.demo.s;

interface Aa
{
	default void printHi()
	{
		System.out.println("Interface A.");
	}
}
interface Bb extends Aa
{
	default void printHello()
	{
		System.out.println("Interface B.");
	}
}
//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
interface C extends Aa
{
	default void printDetails()
	{
		System.out.println("Interface C.");
	}
}
abstract class D 
{
	abstract void abc();
}

public class Hybrid_Inheritance extends D implements C, Bb{
	public void abc()
	{
		System.out.println("Abstract class D.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hybrid_Inheritance obj = new Hybrid_Inheritance();
		obj.printDetails();
		obj.abc();
		obj.printHello();
		obj.printHi();
//		C.printDetails();
	}
	

}
