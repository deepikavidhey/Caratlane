package com.caratlane.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.BasePage;

public class JhumkasPage extends BasePage
{
	@FindBy(xpath="//span[text()='Featured']")
	private WebElement dropdown;
	
	@FindBy(linkText="Price: Low to High")
	private WebElement lowToHigh;
	
	@FindBy(linkText="Price: High to Low")
	private WebElement highToLow;
	
	@FindBy(xpath="//div[@class='listing__price']")
	private List<WebElement> prices;
	
	@FindBy(id="__ta_notif_frame_1")
	private WebElement frame;
	
	@FindBy(xpath="//div[@class='close']")
	private WebElement frameclose;
	
	@FindBy(xpath="(//img[@alt='Trio Floret Jhumkas' and contains(@src,'JE02466-YGP900_1_lar.jpg')])[1]")
	private WebElement triojhumka;
		
	public JhumkasPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void clickFirstJumka(WebDriver driver)
	{
	triojhumka.click();
	sleep(5);
	}
	public void clickframe(WebDriver driver)
	{
		dropdown.click();
		sleep(2);
		lowToHigh.click();
		sleep(10);
		try
		{
		driver.switchTo().frame(frame);
		sleep(5);
		Reporter.log("Frame Exist",true);
		frameclose.click();
		Reporter.log("Frame closed",true);
		}
		catch(Exception e)
		{
			Reporter.log("No Frame Exist",true);
		}
		
	}
	
	public void lhClick(WebDriver driver)
	{
		dropdown.click();
		sleep(10);
		lowToHigh.click();
		sleep(5);		
	}
	public void verifyprice(WebDriver driver)
	{
		try
		{
		driver.switchTo().frame(frame);
		sleep(10);
		frameclose.click();
		}
		catch(Exception e)
		{
			Reporter.log("No Frame Exist",true);
		}
		ArrayList<String> list=new ArrayList<>(); 
		for(WebElement price:prices)
		{
			String str1=price.getText();
			String str=str1.replace(",","");
			String[] s=str.split(" ");
			for(int i=0;i<s.length-1;i++)
			{
				list.add(s[1]);
			}
			
		}
		
		for (int i = 0; i < list.size()-1; i++) 
		{			
				String k=list.get(i);
				String l=list.get(i+1);
				int a=Integer.parseInt(k);
				int b=Integer.parseInt(l);
				if(a<=b)
				{
					System.out.println("Page Verified-Sorted Low To High");
					break;
			
				}
				else
				{
					System.out.println("Failed to sort");
					break;
				}			
		
		}
	}
		public void hlClick(WebDriver driver)
		{
			dropdown.click();
			sleep(10);
			highToLow.click();
			sleep(5);
			try
			{
			driver.switchTo().frame(frame);
			sleep(10);
			frameclose.click();
			}
			catch(Exception e)
			{
				Reporter.log("No Frame Exist",true);
			}
		}
		public void verifyHLprice(WebDriver driver)
		{
			ArrayList<String> list=new ArrayList<>(); 
			for(WebElement price:prices)
			{
				String str1=price.getText();
				String str=str1.replace(",","");
				String[] s=str.split(" ");
				for(int i=0;i<s.length-1;i++)
				{
					list.add(s[1]);
				}
				
			}
			
			for (int i = 0; i < list.size()-1; i++) 
			{
				
					String k=list.get(i);
					String l=list.get(i+1);
					int a=Integer.parseInt(k);
					int b=Integer.parseInt(l);
					if(a>=b)
					{
						System.out.println("Page Verified-Sorted High To Low");
						break;
						
					}
					else
					{
						System.out.println("Failed to sort");
						break;
					}			
			
			}			
			
		}
}

