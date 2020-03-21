package stepDefinations;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import utilities.browserEngine;
import utilities.testData;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

@RunWith(Cucumber.class)
public class T02_logingpageValidation extends browserEngine {

    @Given("^Open the chorme and launch the application$")
    public void open_the_chorme_and_launch_the_application() throws Throwable {
      
    	browserEngine.getbrowser();
    	driver.get(testData.loginpageurl);
    	
    }
    @When("^The user Enter the Username (.+) and Password (.+)$")
    public void the_user_enter_the_username_and_password(String username, String password) throws Throwable {
   
    	driver.findElement(By.name("email")).sendKeys(username);
    	driver.findElement(By.name("password")).sendKeys(password);	
    }
 
    @And("^click on login button$")
    public void click_on_login_button() throws Throwable {
    	driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button")).click();
    }

    @Then("^velidate the login page$")
    public void velidate_the_login_page() throws Throwable {
    	
    	String loginpaeatile =driver.getTitle();
    	
    	Assert.assertEquals(testData.loginpageetitle, loginpaeatile);
    }
    
    @When("^user logs out from application$")
    public void user_logs_out_from_application() throws Throwable {
    	
    	driver.findElement(By.xpath("//*[@id='navbar-right']/li/a")).click();
		driver.findElement(By.xpath("//*[@id='navbar-right']/li/ul/li/a")).click();
		
    }

    @Then("^user is back on login page window$")
    public void user_is_back_on_login_page_window() throws Throwable {
    	
    	String loginhomepaeatile =driver.getTitle();
    	Assert.assertEquals(testData.loginhomeatitle, loginhomepaeatile);
    }

    @And("^Browser quit by driver$")
    public void browser_quit_by_driver() throws Throwable {
    	
    	driver.quit();
      
    }


}
