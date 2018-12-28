package com.Internet.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
	
	@FindBy(id="dropdown")
	WebElement dropdown;
	
	public void dropdownSelMethod()
	{//Select s=new Select(driver.findElement(By.id("dropdown")));
	//s.selectByValue("Option 1");
	Select sdropdown=new Select(dropdown);
	sdropdown.selectByIndex(1);
	}
}
