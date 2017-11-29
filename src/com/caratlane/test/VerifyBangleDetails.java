package com.caratlane.test;

import org.testng.annotations.Test;

import com.caratlane.page.GoldBanglePage;
import com.caratlane.page.HomePage;

import generic.BaseTest;

public class VerifyBangleDetails extends BaseTest
{
	@Test
	void VerifyGoldBangles()
	{
		HomePage hp=new HomePage(driver);
		hp.mouseHovernclickBangles(driver);
		
		GoldBanglePage gbp=new GoldBanglePage(driver);
		gbp.clickBangle(driver);
		
	}
	
}
