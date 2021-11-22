package pageObjectRepository;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	

	
public WebDriver driver;
	
	@FindBy(linkText="Sign in")
	private WebElement signIn;
	
	@FindBy(id="srchword")
	private WebElement searchbox;
	
	
	
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public LoginPage SignIn() 
	{
		
		 signIn.click();
		 
		 return new LoginPage(driver);
		 
		
	}
	
	public void getSearchBox()
	{
		
		searchbox.sendKeys("watch",Keys.ENTER);
		
		
	}
	

}
	
	
	


