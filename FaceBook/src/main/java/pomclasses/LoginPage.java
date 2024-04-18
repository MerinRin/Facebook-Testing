package pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	//Constructor
		public LoginPage(WebDriver driver) {
			this.driver= driver;
		}
		
    private By emailfeild= By.id("email");
    private By passfeild= By.id("pass");
    private By loginbutton= By.xpath("//*[@type='submit']");
    
	
	public void setEmail(String email) {
		driver.findElement(emailfeild).sendKeys(email);
	}
	
    public void setPassword(String pass) {
    	driver.findElement(passfeild).sendKeys(pass);
	}

    public void clickLogIn() {
    	driver.findElement(loginbutton).click();
    }
	
}
