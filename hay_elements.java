package haywebsite;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class hay_elements {
	
	@FindBy(xpath=("//*[@id=\"shopify-section-header\"]/div[3]/div[3]/div/div/header/div[1]/div/div[2]/ul/li[1]/a"))
	public static WebElement home;
	
	@FindBy(id="dummy-chat-button")
	public static WebElement msg;
	
	@FindBy(xpath="/html/body/div/button")
	public static WebElement msgclose;

	@FindBy(xpath="/html/body/div/div/div/div[1]/div[2]/form/div/textarea")
	public static WebElement msgtxt;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/div[3]/div[3]/div/div/header/div[1]/div/div[2]/ul/li[2]/a")
	
	public static WebElement kurti;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/div[3]/div[3]/div/div/header/div[1]/div/div[2]/ul/li[2]/ul/li[1]/a")
	public static WebElement kurtinew;
	
	@FindBy(xpath="//*[@id=\"CollectionSection\"]/div[2]/div[16]/div[1]/a/div[1]/div[8]")
	public static WebElement kurti1;
	
	@FindBy(xpath="//*[@id=\"ProductSelect-8116625047863-option-0\"]/div[4]/label")
	public static WebElement kurtisize;
	
	@FindBy(id="AddToCart-8116625047863")
	public static WebElement add;
	
	@FindBy(xpath="//*[@id=\"CartDrawer\"]/form/div[1]/div/div[2]/button")

	public static WebElement cartclose;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/div[3]/div[3]/div/div/header/div[1]/div/div[2]/ul/li[5]/a")
	public static WebElement dup;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/div[3]/div[3]/div/div/header/div[1]/div/div[2]/ul/li[3]/a")
	public static WebElement bottom;
	
	@FindBy(xpath="//*[@id=\"CollectionSection\"]/div[2]/div[2]/div[1]/a/div[1]/div[3]")
	public static WebElement dup1;
	
	@FindBy(id="AddToCart-8101177950519")
	public static WebElement add1;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/div[3]/div[3]/div/div/header/div[1]/div/div[2]/ul/li[8]/a")
	public static WebElement storelc;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/div[3]/div[3]/div/div/header/div[1]/div/div[3]/div/div/a[3]")
	public static WebElement cartbtn;
	
	@FindBy(xpath="//*[@id=\"CartContainer\"]/div[2]/div[2]/button")
	public static WebElement chkout;
	
	
}
