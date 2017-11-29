package com.caratlane.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class ProductDetailsPage extends BasePage
{
	@FindBy(xpath="//button[text()='Block']")
	private WebElement blockmsg;
	
	@FindBy(xpath="(//a[text()='Buy Now'])[1]")
	private WebElement buynow;
	
	@FindBy(xpath="//a[@class='pd__container__rgt__price__wishlist']")
	private WebElement wishlist;
		
	public ProductDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
		
	public void clickBuyNow(WebDriver driver)
		{
		blockmsg.click();
		verifyElement(driver,25,wishlist);
		
			wishlist.click();
			sleep(5);
				
		}
				
}
