package haywebsite;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class hay_access {
	WebDriver d;
	
	@BeforeSuite
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\Selenium\\Automation\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
	    d=new ChromeDriver(option);
		d.get("https://www.hayclothing.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		PageFactory.initElements(d, hay_elements.class);
		
	}
	
	@Test(priority=1)
	public void home() throws InterruptedException
	{
		hay_elements.home.click();
		
		d.switchTo().frame("dummy-chat-button-iframe");
		hay_elements.msg.click();
		Thread.sleep(3000);
		d.switchTo().frame("ShopifyChat");
		hay_elements.msgtxt.sendKeys("Hi");
		Thread.sleep(3000);
		hay_elements.msgclose.click();
		Thread.sleep(3000);
		d.switchTo().defaultContent();
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-2000)");
		
	}
	
	@Test(priority=2)
	public void kurtipage() throws InterruptedException
	{
		Actions act=new Actions(d);
		act.moveToElement(hay_elements.kurti).perform();;
		hay_elements.kurtinew.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0,-2000)");
		
		hay_elements.kurti1.click();	
		hay_elements.kurtisize.click();
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		hay_elements.add.click();
		Thread.sleep(2000);
		hay_elements.cartclose.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)");
		
	}
	
	@Test(priority=3)
	public void page2() throws InterruptedException  //dupatta page
	{
		
		Actions act1=new Actions(d);
		act1.moveToElement(hay_elements.bottom).perform();
		Thread.sleep(2000);
		hay_elements.dup.click();
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,400)");
		
		hay_elements.dup1.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		hay_elements.add1.click();
		Thread.sleep(2000);
		
		//hay_elements.cartclose.click();
		//js.executeScript("window.scrollBy(0,-500)");
				
	}
	
	@Test(priority=0)
	public void storelocator() throws InterruptedException
	{
		hay_elements.storelc.click();
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(2000);
		
	}
	
	@Test(priority=4)
	public void cart() throws InterruptedException
	{
		//hay_elements.cartbtn.click();
		//Thread.sleep(2000);
		hay_elements.chkout.click();
		Thread.sleep(3000);
	}
	
	@AfterSuite
	public void end()
	{
		d.quit();
	}

}
