package com.caratlane.test;

import org.testng.annotations.Test;

import com.caratlane.page.HomePage;
import com.caratlane.page.RingsPage;

import generic.BaseTest;
import junit.framework.Assert;

public class DiamondRings extends BaseTest
{
	@Test
	void verifyDiamondRings()
	{
		HomePage hp=new HomePage(driver);
		hp.clickRings(driver);
	
		RingsPage rp=new  RingsPage(driver);
		rp.checkForDiamondRings(driver);
		
	}


}
