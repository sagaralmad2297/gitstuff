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

}
