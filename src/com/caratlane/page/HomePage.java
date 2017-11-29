package com.caratlane.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.BasePage;

public class HomePage extends BasePage
{
	//WebDriver driver;
	@FindBy(xpath="//span[@class='country_image_small']")
	private WebElement flag;
	
	@FindBy(id="identified_country")
	private WebElement country;
	
	@FindBy(id="currency_code")
	private WebElement currency;	
	
	@FindBy(xpath="//div[@ id='en_US' and @class='country_box']")
	private WebElement usFlag;
	
	@FindBy(xpath="//div[@ id='en_GB' and @class='country_box']")
	private WebElement ukFlag;
	
	@FindBy(xpath="//div[@ id='en_CA' and @class='country_box']")
	private WebElement canadaFlag;
	
	@FindBy(xpath="//div[@ id='en_AU' and @class='country_box']")
	private WebElement ausFlag;
	
	@FindBy(xpath="//span[text()='JEWELLERY']")
	private WebElement jewelery;
	
	@FindBy(linkText="Jhumkas")
	private WebElement jhumkas;
	
	@FindBy(xpath="//span[text()='GOLD JEWELLERY']")
	private WebElement goldJewellery;

	@FindBy(xpath="//a[text()='Gold Bangles']")
	private WebElement goldBangles;
	
	@FindBy(xpath="//img[contains(@src,'//cdn12.caratlane.com/media/static/images/V4/Oct_2017/Sitemerchandising/Hp2/Ring-rc1-1600')]")
	private WebElement rings;
	
	@FindBy(xpath="//div[@class='modalContent__image']")
	private WebElement frame;
	
	@FindBy(xpath="//div[@class='close']")
	private WebElement frameclose;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void mouseHovernclick(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(jewelery).perform();
		jhumkas.click();
		sleep(10);
	}
	public void mouseHovernclickBangles(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(goldJewellery).perform();
		goldBangles.click();
		sleep(10);
	}
	public void clickRings(WebDriver driver)
	{
		rings.click();
		sleep(10);
		
	}
	
	public void checkIndianCurrency(WebDriver driver)
	{
		flag.click();
		sleep(2);
		String country1=country.getText();
		String currency1=currency.getText();
		if(country1.contains("India") && currency1.contains("INR"))
		{
			Reporter.log("Verified currency "+currency1+" for "+country1,true);
		}
		else
			Reporter.log("Invalid Currency",true);
	}
	
	public void checkUSCurrency(WebDriver driver)
	{
		flag.click();
		sleep(2);
		usFlag.click();
		sleep(2);
		flag.click();
		sleep(3);
		try
		{
		driver.switchTo().frame(frame);
		sleep(2);	
		frameclose.click();			
		}
		catch(Exception e)
		{		
			String country2=country.getText();
			String currency2=currency.getText();
			if(country2.contains("United States") && currency2.contains("USD"))
			{
				Reporter.log("Verified currency "+currency2+" for "+country2,true);
			}
			else
				Reporter.log("Invalid Currency",true);
		}		
	}
	
	public void checkUKCurrency(WebDriver driver)
	{
		flag.click();
		sleep(2);
		ukFlag.click();
		sleep(2);
		flag.click();
		sleep(3);
		try
		{
		driver.switchTo().frame(frame);
		sleep(2);	
		frameclose.click();			
		}
		catch(Exception e)
		{		
		}	
			String country2=country.getText();
			String currency2=currency.getText();
			if(country2.contains("United Kingdom") && currency2.contains("GBP"))
			{
				Reporter.log("Verified currency "+currency2+" for "+country2,true);
			}
			else
				Reporter.log("Invalid Currency",true);
				
	}
	
	public void checkCanadianCurrency(WebDriver driver)
	{
		flag.click();
		sleep(2);
		canadaFlag.click();
		sleep(2);
		flag.click();
		sleep(3);
		try
		{
		driver.switchTo().frame(frame);
		sleep(2);	
		frameclose.click();			
		}
		catch(Exception e)
		{		
		}	
			String country2=country.getText();
			String currency2=currency.getText();
			if(country2.contains("Canada") && currency2.contains("CAD"))
			{
				Reporter.log("Verified currency "+currency2+" for "+country2,true);
			}
			else
				Reporter.log("Invalid Currency",true);
				
	}
	public void checkAustrelianCurrency(WebDriver driver)
	{
		flag.click();
		sleep(2);
		ausFlag.click();
		sleep(2);
		flag.click();
		sleep(3);
		try
		{
		driver.switchTo().frame(frame);
		sleep(2);	
		frameclose.click();			
		}
		catch(Exception e)
		{		
		}	
			String country2=country.getText();
			String currency2=currency.getText();
			if(country2.contains("Australia") && currency2.contains("AUD"))
			{
				Reporter.log("Verified currency "+currency2+" for "+country2,true);
			}
			else
				Reporter.log("Invalid Currency",true);
				
	}
	
}
