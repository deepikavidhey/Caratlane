package com.caratlane.test;

//import org.testng.Reporter;
import org.testng.annotations.Test;

import com.caratlane.page.HomePage;
import com.caratlane.page.JhumkasPage;

import generic.BaseTest;

public class ASortLowToHigh extends BaseTest
{
	@Test
	void sortJhumkasLowToHigh()
	{		
			HomePage hp=new HomePage(driver);
			hp.mouseHovernclick(driver);

			JhumkasPage jp=new JhumkasPage(driver);
			jp.lhClick(driver);
			jp.verifyprice(driver);
			

	}

}
