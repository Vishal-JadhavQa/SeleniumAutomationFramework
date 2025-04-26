package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Log;

public class LoginPage 
{
	private WebDriver driver;
	
	@FindBy(id="Email")
	WebElement usernameTextbox;
	
	@FindBy(id="Password")
	WebElement passwordTextbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBttn;
	
/*	private By usernameField = By.id("Email");
	private By passwordField = By.id("Password");
	private By loginButton = By.xpath("//button[@type='submit']");
*/	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username)
	{
		usernameTextbox.clear();
		usernameTextbox.sendKeys(username);
		
/*		driver.findElement(usernameField).clear();
		driver.findElement(usernameField).sendKeys(username);
*/
	}
	public void enterPassword(String password)
	{
		passwordTextbox.clear();
		passwordTextbox.sendKeys(password);
		
/*		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(password);
*/
	}
	public void clickLogin()
	{
		
		Log.info("Clicking login button..");
		loginBttn.click();
//		driver.findElement(loginButton).click();

	}
}
