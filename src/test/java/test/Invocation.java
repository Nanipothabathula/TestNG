package test;

import org.testng.annotations.Test;

public class Invocation {
	@Test(invocationCount = 2)
	public void test1()
	{
		System.out.println("sanity");
				
	}
	@Test(dependsOnMethods = "test3")
	public void test2()
	{
		System.out.println("regression");
				
	}
	@Test
	public void test3()
	{
		System.out.println("smoke");
				
	}

}
