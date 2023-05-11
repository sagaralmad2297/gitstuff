package test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class test1 {
	
	
	
	
    @Test 
	public void life()
	{
		System.out.println("fuck");
		
		
	}
			@Test
	public void done()
	{
		System.out.println("fuccccccckkkkkkk");
		
		
	}
			@Parameters({"URL"})
			@Test
			public void  para(String urlname)
			{
				System.out.println("parameters");
				System.out.println(urlname);
			}
			@Test
			public void sar()
			{
				System.out.println("good ");
				assertTrue(false);
			}

}
