package testNGsamples;

import org.testng.annotations.Test;

public class EnablenddisableMethod {
	
	@Test(priority=1)
	public void Login()
	{
		System.out.println("Login Sucessfully......");
	}
	
	@Test(enabled=false)
	public void BillPayMent()
	{
		System.out.println("BillPayMent Sucessfully....");
	}
	
	
	
	@Test(priority=2)
	public void FundTransfer()
	{
		System.out.println("Fund Transfer Sucessfully....");
	}
	
	@Test(priority=4)
	public void Logout()
	{
		System.out.println("Logout Sucessfully....");
	}
	

}
