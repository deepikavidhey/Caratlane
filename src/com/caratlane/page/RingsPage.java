package com.caratlane.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.BasePage;
import junit.framework.Assert;

public class RingsPage extends BasePage 
{

	@FindBy(xpath="(//a[text()='Gold Rings'])[2]")
	private WebElement goldRings;
	
	@FindBy(xpath="//div[contains(@class,'listing__top__content listing__top__content')]")
	private WebElement pageListHeading;
		
	@FindBy(xpath="(//a[text()='Diamond Rings'])[1]")
	private WebElement diamondRings;
	
	@FindBy(xpath="(//a[text()='Platinum Rings'])[2]")
	private WebElement platinumRings;
	
	@FindBy(xpath="(//a[text()='Gemstone Rings'])[2]")
	private WebElement gemstoneRings;
	
	@FindBy(xpath="(//a[text()='Solitaire Rings'])[2]")
	private WebElement solitaireRings;
	
	@FindBy(xpath="(//a[text()='Rings For Women'])[1]")
	private WebElement ringsForWomen;
	
	@FindBy(xpath="(//a[text()='Engagement Rings'])[2]")
	private WebElement engagementRings;	
	
	@FindBy(xpath="(//a[text()='22 Kt Yellow Gold Rings'])[1]")
	private WebElement twentytwokaratYellowGoldRings;
	
	@FindBy(xpath="(//a[text()='Rings For Men'])[1]")
	private WebElement ringsForMen;
		
	@FindBy(xpath="(//a[text()='Anniversary Rings'])[1]")
	private WebElement anniversaryRings;
	
	public RingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void checkForGoldRings(WebDriver driver)
	{
		goldRings.click();
		sleep(5);		
		String str=pageListHeading.getText();
		if(str.contains("Gold Rings"))
			{
			Reporter.log("Gold Rings Displayed",true);
			}
		else
			Reporter.log("Failed to display gold rings",true);

	}
	

	public void checkForDiamondRings(WebDriver driver)
	{
			
		diamondRings.click();
		sleep(5);	
		
		String str=pageListHeading.getText();
		
		if(str.contains("Diamond Rings"))
			{
			Reporter.log("Diamond Rings Displayed",true);
			
			}
		else
			Reporter.log("Failed to display Diamond Rings",true);
		
	}
	public void checkForPlatinumRings(WebDriver driver)
	{
		platinumRings.click();
		sleep(5);		
		String str=pageListHeading.getText();
		if(str.contains("Platinum Rings"))
			{
			Reporter.log("Platinum Rings Displayed",true);
			}
		else
			Reporter.log("Failed to display Platinum Rings",true);

	}
	
	public void checkForGemstoneRings(WebDriver driver)
	{
		gemstoneRings.click();
		sleep(5);		
		String str=pageListHeading.getText();
		if(str.contains("Gemstone Rings"))
			{
			Reporter.log("Gemstone Rings Displayed",true);
			}
		else
			Reporter.log("Failed to display Gemstone Rings",true);

	}
	public void checkForSolitaireRings(WebDriver driver)
	{
		solitaireRings.click();
		sleep(5);		
		String str=pageListHeading.getText();
		if(str.contains("Solitaire Rings"))
			{
			Reporter.log("Solitaire Rings Displayed",true);
			}
		else
			Reporter.log("Failed to display Solitaire Rings",true);

	}
	
	public void checkForRingsForWomen(WebDriver driver)
	{
		ringsForWomen.click();
		sleep(5);		
		String str=pageListHeading.getText();
		if(str.contains("Rings For Women"))
			{
			Reporter.log("Rings For Women Displayed",true);
			}
		else
			Reporter.log("Failed to display Rings For Women",true);

	}
	public void checkForEngagementRings(WebDriver driver)
	{
		engagementRings.click();
		sleep(5);		
		String str=pageListHeading.getText();
		if(str.contains("Engagement Rings"))
			{
			Reporter.log("Engagement Rings Displayed",true);
			}
		else
			Reporter.log("Failed to display Engagement Rings",true);

	}
	public void checkFor22KtYellowGoldRings(WebDriver driver)
	{
		twentytwokaratYellowGoldRings.click();
		sleep(5);		
		String str=pageListHeading.getText();
		if(str.contains("22 Kt Yellow Gold Rings"))
			{
			Reporter.log("22 Kt Yellow Gold Rings Displayed",true);
			}
		else
			Reporter.log("Failed to display 22 Kt Yellow Gold Rings",true);

	}
	public void checkForRingsForMen(WebDriver driver)
	{
		ringsForMen.click();
		sleep(5);		
		String str=pageListHeading.getText();
		if(str.contains("Rings For Men"))
			{
			Reporter.log("Rings For Men Displayed",true);
			}
		else
			Reporter.log("Failed to display Rings For Mens",true);

	}
	public void checkForAnniversaryRings(WebDriver driver)
	{
		anniversaryRings.click();
		sleep(5);		
		String str=pageListHeading.getText();
		if(str.contains("Anniversary Rings"))
			{
			Reporter.log("Anniversary Rings Displayed",true);
			}
		else
			Reporter.log("Failed to display	Anniversary Rings",true);

	}

	
}
