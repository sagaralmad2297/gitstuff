package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test4 {
	@Test(groups= {"smoke"})
	public void webhomeloan()
	{
		System.out.println(" web home loan");
	}
	@Parameters({"URL","API"})
	@Test
	public void mobilehomeloan(String url,String api)
	{
		System.out.println("mobile home loan");
		System.out.println(url);
		System.out.println(api);
	}
	@BeforeTest
	public void apihomeloan()
	{
		System.out.println("i will excute first");
		
	}
	@AfterTest
	public void last()
	{
		System.out.println("i will excute last");
	}
	@BeforeSuite
	public void beforee()
	{
		System.out.println("i will excute no.1");
	}

}
