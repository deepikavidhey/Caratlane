package com.caratlane.test;

import org.testng.annotations.Test;

import com.caratlane.page.HomePage;
import com.caratlane.page.RingsPage;

import generic.BaseTest;

public class Karat22YellowGoldRings extends BaseTest
{
	@Test
	void verify22ktYellowGoldRings()
	{
		HomePage hp=new HomePage(driver);
		hp.clickRings(driver);
	
		RingsPage rp=new  RingsPage(driver);
		rp.checkFor22KtYellowGoldRings(driver);
		
	}

}