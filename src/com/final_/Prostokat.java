package com.final_;

public class Prostokat extends Figura
{

	private double bokA;
	private double bokB;
	
	public Prostokat()
	{
		this(1.0,1.0);
	}
	public  Prostokat(double a,double b)
	{
		bokA=a;
		bokB=b;
	}
	
	public double obliczPole()
	{
		return bokA*bokB;
	}
	
	public double obliczObwod()
	{
		return 2*(bokA*bokB);
	}
	
	public String toString()
	{
		return "Prostokat"+"obwod : "+obliczObwod()+" pole : "+obliczPole()+"kolor "+super.getKolor();
		
	}
	
	public static void main(String[] args)
	{
		Prostokat p1 = new Prostokat();
		System.out.println(p1);

	}

}
