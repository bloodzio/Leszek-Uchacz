package com.abstrakcje;

public class MojeKolo extends Kolo
{

	public MojeKolo(double r)
	{
		super(r);
	}

	public MojeKolo()
	{
		this((double) 1);
	}

	public double obliczObwod()
	{
		double r = getPromien();
		return r * 10000;
	}

	public static void main(String[] args)
	{
		MojeKolo mk1 = new MojeKolo(10);
		System.out.println(mk1.obliczObwod());
	}

}
