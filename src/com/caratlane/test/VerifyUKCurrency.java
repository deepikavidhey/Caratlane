package com.caratlane.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.caratlane.page.HomePage;

import generic.BaseTest;

public class VerifyUKCurrency extends BaseTest
{
	@Test
	void ukCurrency()
	{
		HomePage hp=new HomePage(driver);
		hp.checkUKCurrency(driver);
		
	}

}
