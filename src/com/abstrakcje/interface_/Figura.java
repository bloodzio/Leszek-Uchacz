package com.abstrakcje.interface_;

public abstract  class Figura implements Areable
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
		return "Figura " + kolor + ", wypelnienie=" + wypelnienie + "]";
	}
	
	//public abstract double obliczPole();
	
	public static void main(String[] args)
	{
		Figura[] figury = new Figura[5];
		figury[0] = new Kolo();
		figury[1] = new Prostokat();

		for (int i = 0; i < 5; i++)
		{
			System.out.println(figury[i].obliczPole());
			
		}
		
	}


}
