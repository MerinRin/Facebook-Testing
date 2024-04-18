package testclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomclasses.LoginPage;

public class FbLoginTest {

	private LoginPage login;
	private WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		login= new LoginPage(driver);
	}
	
	@Test 
	public void hello() {
		System.out.println("hey program is starting");
	}
	
	@Test
	public void test() {
		
		driver.get("https://www.facebook.com/");
		
		
		login.setEmail("merincyriac00@gmail.com");
		login.setPassword("babymetal");
		login.clickLogIn();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
