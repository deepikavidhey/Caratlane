package com.caratlane.test;

import org.testng.annotations.Test;

import com.caratlane.page.HomePage;
//import com.caratlane.page.RingsPage;
import com.caratlane.page.JhumkasPage;

import generic.BaseTest;

public class HandleFrame extends BaseTest
{
	@Test
	void handlingFrame()
	{
		HomePage hp=new HomePage(driver);
		hp.mouseHovernclick(driver);

		JhumkasPage jp=new JhumkasPage(driver);
		jp.clickframe(driver);
		
	}
}


