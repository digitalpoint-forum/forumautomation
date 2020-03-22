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


@RunWith(Cucumber.class)

public class T04 extends browserEngine{
		
		 @Given("^Google as a  browser$")
		    public void google_as_a_browser() throws Throwable {
			browserEngine.getbrowser();

		    }
		    @When("^user type url of the forum website$")
		    public void user_type_url_of_the_forum_website() throws Throwable {       
		    	driver.get(testData.homepageurl);
		    }
		    @Then("^forum website home page is opened$")
		    public void forum_website_home_page_is_opened() throws Throwable {
		       System.out.println("Forum home page is loaded");
		    }
		    @And("^the title of the home page is validated$")
		    public void the_title_of_the_home_page_is_validated() throws Throwable {	        	
		    	String homepageatitle=driver.getTitle();
		    	Assert.assertEquals(testData.homepageetile, homepageatitle);
		    	
		    }


	}

