package com.caratlane.test;

import org.testng.annotations.Test;

import com.caratlane.page.HomePage;

import generic.BaseTest;

public class USCurrencyVerify extends BaseTest
{
	@Test
	void USCurrency()
	{
		HomePage hp=new HomePage(driver);
		hp.checkUSCurrency(driver);
		
	}

}
