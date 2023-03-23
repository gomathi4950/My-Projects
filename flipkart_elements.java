package pom_pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class flipkart_elements {
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[6]/a")
	public static WebElement create;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	public static WebElement mobileno;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	public static WebElement continuebtn;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/input")
	public static WebElement otp;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/input")
	public static WebElement setpwd;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[5]/button[1]")
	public static WebElement signupbtn;

	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	public static WebElement enterpwd;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	public static WebElement loginbtn;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	public static WebElement search;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[1]/div[1]/div/div/img")
	public static WebElement prod1;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
	public static WebElement addtocart;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div/div/form/button")
	
	public static WebElement placeorder;
	@FindBy(xpath="//*[@id=\"to-payment\"]/button")
	
	public static WebElement contibtn;
}

