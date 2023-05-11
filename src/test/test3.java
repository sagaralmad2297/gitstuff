package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class test3 {
	@Parameters({"URL"})
	@Test
	public void webcarloan(String urlname) {
		System.out.println("this is web car loan");
		System.out.println(urlname);
	}
	@BeforeClass
	public void beforcla()
	{
		System.out.println("i will run before class");
	}
	@Test(groups= {"smoke"})
	public void moblieApicarloan() {
		System.out.println("this is mobile car loan");
	}
	
	@Test(groups= {"smoke"})
	public void mobliehomeloan() {
		System.out.println(" this is mobile home loan");
	}
	@BeforeTest
	public void appiumcarloan()
	{
		System.out.println("i will excute first");
	}
	@BeforeMethod
	public void methodd()
	{
		System.out.println("i will excute before test3");
	}
	@AfterClass
	public void afterclas()
	{
		System.out.println("i will run after class");
	}
@AfterMethod
public void methhod()
{
	System.out.println("i will excute after test3 ");
}
}
