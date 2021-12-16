package com.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_fun;

public class Shopping_cartpage extends Utility_fun{
	public Shopping_cartpage(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@type='text'])[2]")
	public WebElement Quantity;
	
	
	public void change_Quantity(int value)
	{
		clearTextField(Quantity);
		enter_keys(Quantity, "2");
		sendKeyss(driver, Keys.ENTER );
	}
}
