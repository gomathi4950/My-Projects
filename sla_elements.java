package pom_pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class sla_elements {
	
	//masterprogram
	
	@FindBy(xpath="//*[@id=\"menu-item-1921\"]")
	public static WebElement mc;
	
	@FindBy(xpath="//*[@id=\"menu-item-7299\"]/a/span")
	public static WebElement op1;
	
	//trainingcourse
	
	@FindBy(xpath="//*[@id=\"menu-item-1718\"]")
	public static WebElement tc;
	
	@FindBy(xpath="//*[@id=\"menu-item-1720\"]/a/span")
	public static WebElement tcop1;
	
	
	@FindBy(xpath="//*[@id=\"menu-item-2026\"]/a/span")
	public static WebElement tcop2;
	
	@FindBy(xpath="//*[@id=\"menu-item-1734\"]/a/span")
	public static WebElement tcop3;
	
	//morecourses
	
	@FindBy(xpath="//*[@id=\"menu-item-3262\"]/a/span")
	public static WebElement morecourses;
	
	@FindBy(xpath="//*[@id=\"menu-item-1741\"]/a/span")
	public static WebElement java;
	
	@FindBy(xpath="//*[@id=\"menu-item-1745\"]/a/span")
	public static WebElement javaoption;
	
	@FindBy(xpath="//*[@id=\"menu-item-1754\"]/a/span")
	public static WebElement softtest;
	
	@FindBy(xpath="//*[@id=\"menu-item-5583\"]/a/span")
	public static WebElement softtestoption;
	
	@FindBy(xpath="//*[@id=\"menu-item-1778\"]/a/span")
	public static WebElement digital;
	
	@FindBy(xpath="//*[@id=\"menu-item-1953\"]/a/span")
	public static WebElement digitaloption;
	
	//placement
	
	@FindBy(xpath="//*[@id=\"menu-item-1926\"]/a/span")
	public static WebElement placement;
	
	@FindBy(xpath="//*[@id=\"menu-item-1776\"]/a/span")
	public static WebElement placementop1;
	
	@FindBy(xpath="//*[@id=\"menu-item-1773\"]/a/span")
	public static WebElement placementop2;
	
	@FindBy(xpath="//*[@id=\"menu-item-1927\"]/a/span")
	public static WebElement placementop3;
	
	//company

	@FindBy(xpath="//*[@id=\"menu-item-1956\"]/a/span")
	public static WebElement company;
	
	@FindBy(xpath="//*[@id=\"menu-item-1740\"]/a/span")
	public static WebElement companyop1;
	
	@FindBy(xpath="//*[@id=\"menu-item-1962\"]/a/span")
	public static WebElement companyop2;
	
	@FindBy(xpath="//*[@id=\"menu-item-3363\"]/a/span")
	public static WebElement companyop3;
	
	//contact
	
	@FindBy(xpath="//*[@id=\"menu-item-1975\"]/a/span")
	public static WebElement contact;
}

