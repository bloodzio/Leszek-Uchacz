package com.final_;

public  class Figura
{
	private String kolor;
	public String getKolor()
	{
		return kolor;
	}

	public void setKolor(String kolor)
	{
		this.kolor = kolor;
	}

	public boolean isWypelnienie()
	{
		return wypelnienie;
	}

	public void setWypelnienie(boolean wypelnienie)
	{
		this.wypelnienie = wypelnienie;
	}

	private boolean wypelnienie;

	public Figura(String k, boolean w)
	{
		kolor = k;
		wypelnienie = w;
	}

	public Figura()
	{

		this("czerwony", true);

	}
	
	public String toString()
	{
		return "Figura [kolor=" + kolor + ", wypelnienie=" + wypelnienie + "]";
	}

	public static void main(String[] args)
	{
		//Figura[] f1= new Figura[];

	}

}
