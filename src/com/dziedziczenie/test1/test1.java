package com.dziedziczenie.test1;

public class test1
{

	
	 class Klasa1
	{
		Klasa1(int i)
		{
			System.out.println(" Klasa numer 1");
		}
	}
	
	 class Klasa2 extends Klasa1
	{
		Klasa2(int i)
		{
			super(1);
			System.out.println(" Klasa numer 2");
		}
	}
	
	public class Klasa3 extends Klasa2
	{
		Klasa3()
		{
			super(2);
			System.out.println(" Klasa numer 3");
		}
	}
	
	
	public static void main(String[] args)
	{
	test1 t =new test1();
	
	Klasa3	x = t.new Klasa3();
	

	}

}
