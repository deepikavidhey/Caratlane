package com.caratlane.page;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.JavascriptExecutor;
/*import org.openqa.selenium.Alert;*/
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class GoldBanglePage extends BasePage
{
	@FindBy(xpath="(//a[@href='/jewellery/isabelle-gold-bangle-ub00058-2y0000.html'])[1]")
	private WebElement isabelleBangle;	

	@FindBy(id="__ta_notif_frame_1")
	private WebElement frame;
	
	@FindBy(xpath="//div[@class='close']")
	private WebElement frameclose;
	
	public GoldBanglePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickBangle(WebDriver driver)
	{
		sleep(5);
		isabelleBangle.click();
		sleep(5);	
		String s=driver.getTitle();
		verifyTitle(driver,10,s);
	}
}		

	


