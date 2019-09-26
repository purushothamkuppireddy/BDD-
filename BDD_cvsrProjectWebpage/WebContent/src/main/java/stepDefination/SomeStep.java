package stepDefination;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SomeStep {
	WebDriver driver;
	
	@Given("^user is register in$")
	public void user_is_register_in() throws Throwable {
		System.setProperty("webdriver.chrome.driver","F:\\eclipse-jee-2018-12-R-win32-x86_64\\BDDbankExample\\src\\main\\java\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://localhost:4200/");
	}

	@When("^title of login page is something$")
	public void title_of_login_page_is_something() throws Throwable {
		 String title=driver.getTitle();
		   Assert.assertEquals("Bank", title);
			
	}

	@Then("^user enters details for register$")
	public void user_enters_details_for_login() throws Throwable {
		driver.findElement(By.id("register")).click();;
	    driver.findElement(By.name("fname")).sendKeys("purushotham");
	    driver.findElement(By.name("lname")).sendKeys("reddy");
	    driver.findElement(By.name("email")).sendKeys("kpr@gamil");
	    driver.findElement(By.name("pass")).sendKeys("123456");
	    driver.findElement(By.name("adhar")).sendKeys("770225733586454");
	    driver.findElement(By.name("bal")).sendKeys("200");
	    driver.findElement(By.name("registerButton")).click();
	    Alert alert = driver.switchTo().alert();
		alert.accept();
		 driver.findElement(By.name("resetButton")).click();
	}
	@Then("^second user register in$")
	public void second_user_register_in() throws Throwable {
		driver.findElement(By.id("register")).click();;
	    driver.findElement(By.name("fname")).sendKeys("pavan");
	    driver.findElement(By.name("lname")).sendKeys("reddy");
	    driver.findElement(By.name("email")).sendKeys("pavan@gamil");
	    driver.findElement(By.name("pass")).sendKeys("654321");
	    driver.findElement(By.name("adhar")).sendKeys("770685341454");
	    driver.findElement(By.name("bal")).sendKeys("0");
	    driver.findElement(By.name("registerButton")).click();
	    Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}


	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
		
		driver.findElement(By.id("login")).click();;
	    driver.findElement(By.name("uname")).sendKeys("purushotham");
	    driver.findElement(By.name("pass")).sendKeys("123456");
	    driver.findElement(By.name("loginButton")).click();
	    Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.accept();
		
	}

	@Then("^user is on transaction page$")
	public void user_is_on_transaction_page() throws Throwable {
//		WebElement txbtn = driver.findElement(By.xpath("//button[@type='button']"));
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[1].click()", txbtn);//works for only arguments[0]
		
		//deposit
		driver.findElement(By.name("dButton")).click();
		driver.findElement(By.name("DAmt")).sendKeys("5000");
		WebElement depositbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", depositbtn);
		
		//withdraw
		driver.findElement(By.name("wButton")).click();
		driver.findElement(By.name("WAmt")).sendKeys("2000");
		WebElement withdrawbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js3=(JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", withdrawbtn);
			
		//fundTransfer
		driver.findElement(By.name("fButton")).click();
		driver.findElement(By.name("FAmt")).sendKeys("2000");
		driver.findElement(By.name("toAccountName")).sendKeys("pavan");
		WebElement fundbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js4=(JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click()", fundbtn);
	    	}


}
