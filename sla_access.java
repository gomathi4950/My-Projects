package pom_pack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class sla_access {
	WebDriver d;
	
	
	
	@BeforeSuite
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\Selenium\\Automation\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.softlogicsys.in/");
		
		PageFactory.initElements(d, sla_elements.class);
		
	}
	
	@Test(priority=0)
	public void masterprogram() throws InterruptedException
	{
		Thread.sleep(4000);
		d.manage().window().maximize();
		Thread.sleep(4000);
		sla_elements.mc.click();
		sla_elements.op1.click();
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-2000)");
		
	}
	
	@Test(priority=1)
	public void trainingcourse() throws InterruptedException
	{
		Thread.sleep(4000);
		sla_elements.tc.click();
		
		Thread.sleep(4000);
		Actions act=new Actions(d);
		act.moveToElement(sla_elements.tc).perform();
		sla_elements.tcop1.click();
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-2000)");
		
		
		Thread.sleep(12000);
		Actions act1=new Actions(d);
		act1.moveToElement(sla_elements.tc).perform();
		sla_elements.tcop2.click();
		
		
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-2000)");
		
		Thread.sleep(4000);
		Actions act2=new Actions(d);
		act2.moveToElement(sla_elements.tc).perform();
		sla_elements.tcop3.click(); 
		
	
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-2000)");
		
		
	}
	
	@Test(priority=2)
	public void morecourses() throws InterruptedException
	{
		Thread.sleep(4000);
		sla_elements.morecourses.click();
		Actions act1=new Actions(d);
		act1.moveToElement(sla_elements.java).perform();
		sla_elements.javaoption.click();
		
        JavascriptExecutor js=(JavascriptExecutor)d;
		
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-3000)");
		
		Thread.sleep(15000);
		sla_elements.morecourses.click();
		Actions act2=new Actions(d);
		act2.moveToElement(sla_elements.softtest).perform();
		sla_elements.softtestoption.click();
		
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-3000)");
		
		Thread.sleep(15000);
		sla_elements.morecourses.click();
		Actions act3=new Actions(d);
		act3.moveToElement(sla_elements.digital).perform();
		sla_elements.digitaloption.click();
		
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-2000)");
		
	}
	
	@Test(priority=3)
	public void placement() throws InterruptedException
	{
		Thread.sleep(4000);
		sla_elements.placement.click();
		Actions act1=new Actions(d);
		act1.moveToElement(sla_elements.placement).perform();
		sla_elements.placementop1.click();
		
        JavascriptExecutor js=(JavascriptExecutor)d;
		
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-3000)");
		
		Thread.sleep(4000);
		Actions act2=new Actions(d);
		act2.moveToElement(sla_elements.placement).perform();
		sla_elements.placementop2.click();
		
		
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-3000)");
		
		Thread.sleep(4000);
		Actions act3=new Actions(d);
		act3.moveToElement(sla_elements.placement).perform();
		sla_elements.placementop3.click();
		
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-2000)");
		
	}
	
	@Test(priority=4)
	public void company() throws InterruptedException
	{
		Thread.sleep(4000);
		Actions act1=new Actions(d);
		act1.moveToElement(sla_elements.company).perform();
		sla_elements.companyop1.click();
		

        JavascriptExecutor js=(JavascriptExecutor)d;
		
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-2000)");
		
		Thread.sleep(4000);
		Actions act2=new Actions(d);
		act2.moveToElement(sla_elements.company).perform();
		sla_elements.companyop2.click();
		
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-2000)");
		
		Thread.sleep(4000);
		Actions act3=new Actions(d);
		act3.moveToElement(sla_elements.company).perform();
		sla_elements.companyop3.click();
		
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-2000)");
	}
	@Test(priority=5)
	public void contact() throws InterruptedException
	{
		sla_elements.contact.click();
		Thread.sleep(3000);
				
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-2000)");
		
		
	}
	
	@AfterSuite
	public void end() throws InterruptedException
	{
		Thread.sleep(4000);

		d.quit();
	}

}
