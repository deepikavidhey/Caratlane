package com.caratlane.test;

import org.testng.annotations.Test;

import com.caratlane.page.HomePage;
import com.caratlane.page.JhumkasPage;

import generic.BaseTest;

public class ASortHighToLow extends BaseTest
{

	@Test
	void sortJhumkasHighToLow()
	{		
			HomePage hp=new HomePage(driver);
			hp.mouseHovernclick(driver);

			JhumkasPage jp=new JhumkasPage(driver);
			jp.hlClick(driver);
			jp.verifyHLprice(driver);
			

	}
}
