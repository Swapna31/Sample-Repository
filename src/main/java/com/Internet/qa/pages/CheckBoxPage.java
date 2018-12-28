package com.Internet.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Internet.qa.base.*;
//This class defines Checkbox page locators
public class CheckBoxPage extends TestBase{
	//CheckBoxes heading 
	@FindBy(xpath="//h3[contains(text(),'Checkboxes')]")
	WebElement ChkBoxesHeading;
	//Checkbox1 locator
	@FindBy(xpath="//input[@type='checkbox'][1]")	
	WebElement ChkBox1;
	@FindBy(xpath="//input[@type='checkbox'][2]")	
	WebElement ChkBox2;
	@FindBy(xpath="//input[@type='checkbox']")	
	WebElement ChkBoxlst;
	//h3[contains(text(),'Checkboxes')]
	
public void SelChkBox1()
{
	ChkBox1.click();
}
public void ChkBox1IsDisplayed()
{
	ChkBox1.isDisplayed();
}
public void SelChkBox2()
{
	ChkBox1.click();
}
public void ChkBox2IsDisplayed()
{
	ChkBox1.isDisplayed();
	}
public boolean HeadingDisplayed()
{
	return ChkBoxesHeading.isDisplayed();
	
}
public boolean IsSelectedChkBox1()
{
	return ChkBox1.isSelected();
	
}
public boolean IsSelectedChkBox2()
{
	return ChkBox2.isSelected();
}
	
}
