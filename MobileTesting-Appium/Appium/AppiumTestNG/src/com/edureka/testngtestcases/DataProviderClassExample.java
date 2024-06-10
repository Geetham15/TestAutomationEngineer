package com.edureka.testngtestcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderClassExample {
	
	
	@DataProvider
	public static Object[][] credentialsData()
	{
		
		return new Object[][]
				{
			{"userid1","password1"},{"userid2","password2"}
				
			};
				}
	
	@Test(dataProvider="credentialsData")
	
	public void logintest(String userid, String password)
	{
		System.out.println(userid);
		System.out.println(password);
		
	}
}