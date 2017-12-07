package com.caratlane.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.caratlane.page.HomePage;

import generic.BaseTest;

public class VerifyCanadianCurrency extends BaseTest
{
	@Test
	void canadianCurrency()
	{
	HomePage hp=new HomePage(driver);
	hp.checkCanadianCurrency(driver);
	}
}
