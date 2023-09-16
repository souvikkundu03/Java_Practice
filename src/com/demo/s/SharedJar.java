package com.demo.s;


interface Demo1 {
	  public static final int id = 2;
	  
	  public static final String compnayname = "IBM_TO_ABC";
	  
	  int addition(int a, int b);
	  
	  int addition(int a, int b, int c);
}
public class SharedJar implements Demo1{
	public int addition(int a, int b)
	{
		return a+b;
	}
	public int addition(int a, int b, int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedJar obj = new SharedJar();
		System.out.println(obj.addition(5, 9));
		System.out.println(obj.addition(5, 9, 8));

	}

}
