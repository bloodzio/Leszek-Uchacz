package com.if_else.trojargumentowy;

public class if_else3
{
	static int test1(int i)
	{
		return i < 10 ? i * 100 : i * 20;
	}

	static int test2(int i)
	{
		if (i < 10)
			return i * 100;
		else
			return i * 20;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		System.out.println("test1 : "+test1(9));

		System.out.println("test2 : "+test2(10));
		
	}

}
