package com.dziedziczenie.poli2;

public class Main
{

	static void rzutowanieWgore(Klasa1 i)
	{
		i.przedstawSie();
	}

	public static void main(String[] args)
	{
		Klasa2 k2 = new Klasa2();
		Klasa1 k1 = new Klasa1();
		rzutowanieWgore(k2);
	}

}
