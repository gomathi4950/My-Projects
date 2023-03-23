package pom_pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class gaana_access {
	
	WebDriver d;
	@BeforeSuite
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\Selenium\\Automation\\chromedriver.exe");
		 d=new ChromeDriver();
		
		d.get("https://gaana.com/");
		d.manage().window().maximize();
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		PageFactory.initElements(d, gaana_elements.class);
		
	}
	
	
	@Test(enabled=false)
	public void signup() throws InterruptedException
	{
		d.manage().window().maximize();
		Thread.sleep(4000);
		gaana_elements.signup.click();
		Thread.sleep(4000);
		gaana_elements.mail.sendKeys("rameshaghilan@gmail.com");
		Thread.sleep(10000);
		gaana_elements.continuebtn.click();
		Thread.sleep(3000);
		
		gaana_elements.name.sendKeys("Gomathi");
		gaana_elements.pwd.sendKeys("abcd@123");
		Thread.sleep(3000);
		gaana_elements.gender.click();
		gaana_elements.term.click();
		Thread.sleep(10000);
		gaana_elements.contibtn.click();
		Thread.sleep(20000);
		gaana_elements.verifyot.click();
		
	}
	@Test(priority=0)
	public void login() throws InterruptedException
	{
		
		Thread.sleep(4000);
		gaana_elements.signup.click();
		//Thread.sleep(4000);
		gaana_elements.mail.sendKeys("rameshaghilan@gmail.com");
		//Thread.sleep(10000);
		gaana_elements.continuebtn.click();
		//Thread.sleep(4000);
		
		gaana_elements.pwd1.sendKeys("abcd@123");
		
		gaana_elements.logincontinue.click();
		Thread.sleep(4000);
		
	}
	@Test(priority=1)
	public void playlist() throws InterruptedException
	{
		gaana_elements.mymusic.click();
		Thread.sleep(3000);
		gaana_elements.palylist.click();
		Thread.sleep(4000);
		gaana_elements.play.click();
		Thread.sleep(3000);
		gaana_elements.pause.click();
		Thread.sleep(3000);
	}
	@AfterSuite
	public void end()
	{
		d.quit();
	}

}
