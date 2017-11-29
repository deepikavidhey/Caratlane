package com.caratlane.test;

import org.testng.annotations.Test;

import com.caratlane.page.HomePage;
import com.caratlane.page.RingsPage;

import generic.BaseTest;

public class PlatinumRings extends BaseTest
{
	@Test
	void verifyPlatinumRings()
	{
		HomePage hp=new HomePage(driver);
		hp.clickRings(driver);
	
		RingsPage rp=new  RingsPage(driver);
		rp.checkForPlatinumRings(driver);
		
	}
}
