package com.caratlane.test;

import org.testng.annotations.Test;

import com.caratlane.page.HomePage;
import com.caratlane.page.JhumkasPage;
import com.caratlane.page.ProductDetailsPage;

import generic.BaseTest;

public class VerifyBuyNow extends BaseTest
{

	@Test
	void addToCart()
	{		
			HomePage hp=new HomePage(driver);
			hp.mouseHovernclick(driver);

			JhumkasPage jp=new JhumkasPage(driver);
			jp.clickFirstJumka(driver);
			
			ProductDetailsPage pdp=new ProductDetailsPage(driver);
			pdp.clickBuyNow(driver);

	}
}