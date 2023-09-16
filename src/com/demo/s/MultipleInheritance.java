package com.demo.s;


interface A
{
	void getdetailsofA();
}
interface B
{
	void getdetailsofB();
}

public class MultipleInheritance implements A, B{
	public void getdetailsofA()
	{
		System.out.println("Interface A");
	}
	public void getdetailsofB()
	{
		System.out.println("Interface B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance ob = new MultipleInheritance();
		ob.getdetailsofA();
		ob.getdetailsofB();
	}

}
