package com.przeciazanie_metod;

public class przeciazanie
{
	public int i;
	String z;

	przeciazanie()
	{

		this((int)1, "sdad");
	}

	public przeciazanie(int j, String string)
	{
		i = j;
		string = z;
	}

	public przeciazanie(long  j, String string)
	{
		i =(int) j;
		string = z;
	}
	public przeciazanie(String string, int j)
	{
		i = j;
		string = z;
	}
	przeciazanie inc()
	{
		i++;
		return this;
	}
///////////////////////  BLAD !!!!
//	void f()
//	{
//		
//	}
//	
//	int f()
//	{
//		return 1;
//	}
	/**
	 * @param args
	 */
	void f()
	{
		int i =0;
		i++;
	}
	public static void main(String[] args)
	{
	
		przeciazanie p1 = new przeciazanie((long)2,"23132");
		przeciazanie p2 = new przeciazanie((int)2,"23132");
		przeciazanie t1 = new przeciazanie() , t2 = new przeciazanie();
	
		p1.inc().inc().inc();
		System.out.println(p1.i);
		
	}

}
