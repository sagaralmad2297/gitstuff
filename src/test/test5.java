package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test5 {
	@Parameters({"URL"} )
@Test
public void paraa(String url)
{
	System.out.println("parameter");
	System.out.println(url);
}
	@Test
	public void paraa1(String url)
	{
		System.out.println("parameter");
		System.out.println(url);
	}
	@Test
	public void paraa2(String url)
	{
		System.out.println("parameter");
		System.out.println(url);
	}
	@Test
	public void paraa3(String url)
	{
		System.out.println("parameter");
		System.out.println(url);
	}



}
