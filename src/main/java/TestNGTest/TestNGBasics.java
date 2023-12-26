package TestNGTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	@BeforeSuite
	public void setup() {
		System.out.println("Setup System Properties for Browser");	
	}
	
	
	@BeforeTest
	public void lauchBrowser() {
		System.out.println("Launch Browser");	
	}
	
	
	@BeforeClass
	public void openWebPage() {
		System.out.println("Open Web Page");	
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Login to App");	
	}
	
	@Test
	public void checkPageTitle() {
		System.out.println("Check Page");
	}
}
