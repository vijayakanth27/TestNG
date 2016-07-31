package testNGsamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {
	@BeforeMethod
	public void Login()
	{
		System.out.println("Login Sucessfully......");
	}
	
	@Test
	public void BillPayMent()
	{
		System.out.println("BillPayMent Sucessfully....");
	}
	
	@Test
	public void FundTransfer()
	{
		System.out.println("Fund Transfer Sucessfully....");
	}
	
	@AfterMethod
	public void Logout()
	{
		System.out.println("Logout Sucessfully....");
	}
}


