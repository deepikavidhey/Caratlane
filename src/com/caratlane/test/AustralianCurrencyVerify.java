package com.caratlane.test;

import org.testng.annotations.Test;

import com.caratlane.page.HomePage;

import generic.BaseTest;

public class AustralianCurrencyVerify extends BaseTest
{
	@Test
	void australianCurrency()
	{
	HomePage hp=new HomePage(driver);
	hp.checkAustrelianCurrency(driver);
	}
}