package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {
	
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\downloadFoldr\\chromedriver-win32\\chromedriver.exe");
	    
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		
	}

	@When("User enter username")
	public void user_enter_username() {
	   
	}

	@When("User enter password")
	public void user_enter_password() {
	    
		
	}

	@Then("Click on login butten")
	public void click_on_login_butten() {
	    
	}

}
