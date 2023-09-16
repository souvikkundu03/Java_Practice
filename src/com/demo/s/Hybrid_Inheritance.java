package com.demo.s;

interface Aa
{
	void printHi();
}
interface Bb extends Aa
{
	void printHello();
}
interface C extends Aa
{
	void printDetails();
}
abstract class D implements C, Bb
{
	abstract void abc();
}

public class Hybrid_Inheritance extends D{
	public void abc()
	{
		System.out.println("Abstract class D.");
	}
	public void printDetails()
	{
		System.out.println("Interface C.");
	}
	public void printHello() {
		System.out.println("Interface B.");
		
	}
	public void printHi()
	{
		System.out.println("Interface A.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hybrid_Inheritance obj = new Hybrid_Inheritance();
		obj.printDetails();
		obj.abc();
		obj.printHello();
		obj.printHi();

	}
	

}
