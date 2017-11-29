package com.caratlane.test;

import org.testng.annotations.Test;

import com.caratlane.page.HomePage;

import generic.BaseTest;

public class IndianCurrencyCheck extends BaseTest
{
	@Test
	void verifyIndianCurrency()
	{
		HomePage hp=new HomePage(driver);
		hp.checkIndianCurrency(driver);
		
	}

}
