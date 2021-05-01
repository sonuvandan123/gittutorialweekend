package OverloadingOverdi;

public class B extends A
{
	
	void m1()
	{
		System.out.println("method m1() modified in class B");
	}
	//@Override 
	void m3()
	{
		System.out.println("M2 of class B");
	}
}
