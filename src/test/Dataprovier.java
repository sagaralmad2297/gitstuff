package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovier {
	@Test(dataProvider="getData")
	public void loigin(String username,String password)
	{
		System.out.println("login page");
		System.out.println(username);
		System.out.println(password);
		System.out.println("from asian zone");
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data =new Object[3][2];
		data[0][0]="firstusername";
		data[0][1]="password";
		data[1][0]="secondusername";
		data[1][1]="secondPassword";
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
		
		
	}

}
