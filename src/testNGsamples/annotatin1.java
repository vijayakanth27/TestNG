package testNGsamples;

import org.testng.annotations.Test;

public class annotatin1 {
	
	@Test(priority=1)
	public void Login()
	{
		System.out.println("Login Sucessfully......");
	}
	
	@Test(priority=3)
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