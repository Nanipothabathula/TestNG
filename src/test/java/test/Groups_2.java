package test;

import org.testng.annotations.Test;

public class Groups_2 {
	@Test(groups = "sanity")
	public void sanity()
	{
		System.out.println("sanity");
	}
	@Test(groups = "smoke")
	public void smoke()
	{
		System.out.println("Smoke");
	}
	@Test(groups = "Regression")
	public void RegressionSanity()
	{
		System.out.println("Regression and sanity");
	}

}
