package com.caratlane.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class GiftsPage extends BasePage
{
	@FindBy(xpath="//a[contains(text(),'Under')]/..//input[@type='checkbox']")
	private WebElement checkbox;
	
	public GiftsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
	
	
	void clickCheck(WebDriver driver)
	{
		checkbox.click();
	}
	
	
}
