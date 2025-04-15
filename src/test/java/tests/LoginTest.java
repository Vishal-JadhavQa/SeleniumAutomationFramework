package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest
{
	@Test
	public void testValidLogin()
	{
		LoginPage lgp = new LoginPage(driver);
		lgp.enterUsername("admin@yourstore.com");
		lgp.enterPassword("admin");
		lgp.clickLogin();
		
		System.out.println("Title of page is : " +driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
	}
}
