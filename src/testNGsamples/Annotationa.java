package testNGsamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationa {
	
	@Test

	public void GmailLogin (){
		
		
		System.out.println("TestNG Sample");
	}
	@Test
	public void ApplePhone (){
		
		System.out.println("My New Phone");
		
		}
	
	@BeforeTest
	
	public void OpenTheBrowser() {
		
		System.out.println("Google Chrome");
		
}
	
	@AfterTest
	
	public void CloseTheBrowser() {
	System.out.println("Close THe BRowser");
	}
	}
	
	
	


