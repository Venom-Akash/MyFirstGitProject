package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.Markets;
import pageObjectModel.News;
import pageObjectModel.Portfolio;


public class MoneyControl {
	// global variable
  public WebDriver driver;
  ChromeOptions options = new ChromeOptions();
  public Properties configprop;
  
  
  
  @Before
  public void setup() throws IOException {
	  
	 // load properties file
	  configprop= new Properties();
	  FileInputStream  config= new FileInputStream("config.properties");
	  configprop.load(config);
	  String ab= configprop.getProperty("url");
	  System.out.println("bbbbbbbbbbbbbbbbbbbb   "+ab);
	  
	  
	  
  }
  @After
  public void tearup() {
	  
	  System.out.println("After running feature file");
  }
  
 
  
  
  
  
  
  
  
  
  Markets markets= PageFactory.initElements(driver, Markets.class);
	
	News news= PageFactory.initElements(driver, News.class);
	
	Portfolio portfolio=PageFactory.initElements(driver, Portfolio.class);
	


	@Given("User Open Chrome Browser")
	public void user_open_chrome_browser() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Hellllllllllllooooooooooooo");
	}

	@When("User enter moneycontrol https:\\/\\/www.moneycontrol.com\\/")
	public void user_enter_moneycontrol_https_www_moneycontrol_com() {
		// Write code here that turns the phrase above into concrete actions
					
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.moneycontrol.com");
		System.out.println("2222222222222222");
		
	}

	@Then("User check title of the page")
	public void user_check_title_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
		String title=driver.getTitle();
		System.out.println("Title "+title);
		
	}
	
	@Then("user close the browser")
	public void user_close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    
		portfolio.call();
	    driver.close();
	}
	
	@When("User enter moneycontrol")
	public void user_enter_moneycontrol() {
	    // Write code here that turns the phrase above into concrete actions
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.moneycontrol.com");
	}

	@When("User enter google")
	public void user_enter_google() {
	    // Write code here that turns the phrase above into concrete actions
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
	}
	

}
