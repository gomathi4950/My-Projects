package pom_pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class gaana_elements {

	@FindBy(xpath="//*[@id=\"app\"]/header/div/div[3]/button[3]")
	public static WebElement signup;
	@FindBy(id="login_id")
	public static WebElement mail;
	@FindBy(xpath="//*[@id=\"app\"]/section/div/div[1]/form/button")

	public static WebElement continuebtn;
	@FindBy(xpath="//*[@id=\"app\"]/section/div/div[1]/form/div[1]/input")
	public static WebElement name;
	@FindBy(xpath="//*[@id=\"app\"]/section/div/div[1]/form/div[2]/input")
	public static WebElement pwd;
	@FindBy(xpath="//*[@id=\"app\"]/section/div/div[1]/form/div[3]/label[2]/span")
	public static WebElement gender;
	@FindBy(xpath="//*[@id=\"app\"]/section/div/div[1]/form/div[4]/label/span")
	public static WebElement term;
	@FindBy(xpath="//*[@id=\"app\"]/section/div/div[1]/form/button")
	public static WebElement contibtn;
	@FindBy(xpath="//*[@id=\"app\"]/section/div/div[1]/div/form/button")
	public static WebElement verifyot;
	@FindBy(xpath="//*[@id=\"login_pw\"]")
	public static WebElement pwd1;
	@FindBy(xpath="//*[@id=\"app\"]/section/div/div[1]/div[2]/form/button")
	public static WebElement logincontinue;
	@FindBy(xpath="//*[@id=\"app\"]/main/section/div/a[8]")
	public static WebElement mymusic;
	@FindBy(xpath="//*[@id=\"app\"]/main/div[2]/div/section[1]/div[2]/ul/li/a/span")
	public static WebElement palylist;
	@FindBy(xpath="//*[@id=\"playBtn1\"]")
	public static WebElement play;
	@FindBy(xpath="//*[@id=\"playBtn1\"]")
	public static WebElement pause;
}


