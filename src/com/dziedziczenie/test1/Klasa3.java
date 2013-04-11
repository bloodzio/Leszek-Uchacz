package com.dziedziczenie.test1;

class Klasa1
{
	 
	Klasa1()
	{
		System.out.println(" Klasa numer 1");
	}

	void dispose()
	{
		System.out.println(" dispose numer 1");
	}
	
	void Metoda()
	{
		System.out.println(" Metoda numer 1");
	}
	
}

class Klasa2 extends Klasa1
{
	Klasa2()
	{

		System.out.println(" Klasa numer 2");
	}

	void dispose()
	{
		
		System.out.println(" dispose numer 2");
		super.dispose();
	}
	 void Metoda()
	{
		System.out.println(" Metoda numer 2");
	}
	
}

public class Klasa3 extends Klasa2
{
  
	Klasa3()
	{
		

		System.out.println(" Klasa numer 3");
	}

	void dispose()
	{
		

		System.out.println(" dispose numer 3");
		super.dispose();
	}
	void Metoda()
	{
		System.out.println(" Metoda numer 3");
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Klasa3 k3 = new Klasa3();
		k3.Metoda();
		try
		{

		} finally
		{

			k3.dispose();
		}
	}

}
