package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = "sanity")
	public void test1()
	{
		System.out.println("sanity");
				
	}
	@Test(groups ="regression" )
	public void test2()
	{
		System.out.println("regression");
				
	}
	@Test(groups = "smoke")
	public void test3()
	{
		System.out.println("smoke");
				
	}
	@Test(groups = "sanity")
	public void test4()
	{
		System.out.println("sanity and integration");
				
	}

}
