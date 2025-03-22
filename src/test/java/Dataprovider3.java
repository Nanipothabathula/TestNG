import org.testng.annotations.DataProvider;

public class Dataprovider3 {
	
	@DataProvider(name = "Test")
	public Object[][] Test()
	{
		return new Object[][]
				{
			{"Nani", "P"},
			{"P","Nani"}
				
				};
	}
	@org.testng.annotations.Test(dataProvider ="Test")
	public void actual(String name, String pwd)
	{
		System.out.println(name + pwd);
	}
	

}
