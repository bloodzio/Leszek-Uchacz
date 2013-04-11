

package com.abstrakcje.DodanieTejSamejMetody;

public class Kolo extends Figura
{
	private double promien;

	public double getPromien()
	{
		return promien;
	}

	public Kolo()
	{
		
		this(1.0);
		//super("zielony",true); niedziala brak konstuktora
		//							nadrzednej
	}

	public Kolo(double r)
	{
		super("zielony",true);
		super.setKolor("bialy");
		promien = r;
		
	}

	public  double  obliczObwod()
	{
		return 2 * Math.PI * promien;
	}

	public double obliczPole()
	{
		return 2 * Math.PI * promien * promien;
	}

	public String toString()
	{
		return "Kolo  "+"obwod : "+obliczObwod()+" pole : "+obliczPole()+"kolor "+super.getKolor() ;
	}
	public static void main(String[] args)
	{
		Kolo k1 = new Kolo(2);
		System.out.println(k1);
		
		// TODO Auto-generated method stub

	}

}
