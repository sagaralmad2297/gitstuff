package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class test2 {
	@Test (groups= {"smoke"},timeOut=9000)
	public void fuck()
	{
		System.out.println("fuck my life");
	}
	@Test(enabled=false)
	public void lasst()
	{
		System.out.println("i will excute no.1 from last");
	}
	@Test(dependsOnMethods= {"fuck"})
	public void Apitest()
	{
		System.out.println("api testing ");
	}
	

}
