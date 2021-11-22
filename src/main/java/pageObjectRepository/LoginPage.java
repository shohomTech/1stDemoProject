package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	
	public WebDriver driver;
	
public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="login1")
	private WebElement username;
	
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement mailSignIn;
	
	
	@FindBy(css=".rd_logout")
	private WebElement logOut;
	
	
	public WebElement username() 
	{
		
		return username;
		
	}
	public WebElement password() 
	{
		
		return password;
		
	}
	public void mailSignIn()
	{
		 mailSignIn.click();;
		
	}
	public WebElement logOut()
	{
		return logOut;
		
	}
	

}
