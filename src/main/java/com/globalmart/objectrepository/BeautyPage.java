package com.globalmart.objectrepository;

import org.openqa.selenium.WebDriver;

import com.globalmart.genericpages.ApplicationGenericMethods;

public class BeautyPage extends ApplicationGenericMethods 
{
	private WebDriver driver;

	public BeautyPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	}


