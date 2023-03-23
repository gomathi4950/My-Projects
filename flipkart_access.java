package pom_pack;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class flipkart_access {
	
	WebDriver d;
	
	@BeforeSuite
	public  void start()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\Selenium\\Automation\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		String base=d.getWindowHandle();
		
		PageFactory.initElements(d, flipkart_elements.class);
		
	}
	@Test(enabled=false)
	public void signup()
	{
		
		flipkart_elements.create.click();
		flipkart_elements.mobileno.sendKeys("9944821417");
		flipkart_elements.continuebtn.click();
		flipkart_elements.otp.sendKeys("962195");
		flipkart_elements.setpwd.sendKeys("abcd@123");
		flipkart_elements.signupbtn.click();
		
		
	}
	@Test(priority=0)
	public void login() throws InterruptedException
	{
		
		flipkart_elements.mobileno.sendKeys("9944821417");
		flipkart_elements.enterpwd.sendKeys("abcd@123");
		flipkart_elements.loginbtn.click();
				
	}
	@Test(priority=1)
	public void product() throws InterruptedException
	{
		d.manage().window().maximize();
		Thread.sleep(5000);
		flipkart_elements.search.sendKeys("mobile");
		flipkart_elements.search.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void addcart() throws InterruptedException
	{
		
		flipkart_elements.prod1.click();
		Set<String> newwin=d.getWindowHandles();
		for(String i:newwin)   //making driver to land in last new window
		{
			d.switchTo().window(i);
		}
		
		Thread.sleep(5000);
		flipkart_elements.addtocart.click();
		Thread.sleep(5000);
		
	}
	@Test(priority=3)
	public void payment() throws InterruptedException
	{
		//Thread.sleep(5000);
		//flipkart_elements.ex1.click();
		Thread.sleep(5000);
		//flipkart_elements.ex.click();
			
		flipkart_elements.placeorder.click();
		Thread.sleep(10000);
		
		flipkart_elements.contibtn.click();
		Thread.sleep(10000);
		
	}
	@AfterSuite
	public void end() throws InterruptedException
	{
		Thread.sleep(3000);
		d.quit();
	}

}
