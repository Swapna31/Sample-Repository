package com.Internet.qa.pages;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Internet.qa.base.TestBase;

public class HomePage extends TestBase{
	BrokenImagesPage brokenImgPage;
	HomePage homepg;
	CheckBoxPage chkboxPage;

	@FindBy(xpath="//a")
	WebElement BrokenImgLink;
	@FindBy(xpath="//a[contains(text(),'Broken Images')]")
	WebElement BrokenImagesLnk;
	@FindBy(xpath="//a[contains(text(),'Dropdown')]")
	WebElement dropdownLnk;
	//a[contains(text(),'Sortable Data Tables')]
	@FindBy(xpath="//a[contains(text(),'Sortable Data Tables')]")
	WebElement sortabletableLnk;
	@FindBy(xpath="//a[contains(text(),'Checkboxes')]")
	WebElement CheckboxLnk;	
	@FindBy(xpath="//a[contains(text(),'Drag and Drop')]")
	WebElement DragnDropLnk;
	@FindBy(xpath="//a[contains(text(),'Hovers')]")
	WebElement HoversLnk;
	@FindBy(xpath="//a[contains(text(),'Dropdown')]")
	WebElement DropdownLnk;
	@FindBy(xpath="//a[contains(text(),'Sortable Data Tables')]")
	WebElement SortableTableLnk;
	

	public HomePage Initialisation()
	{
		return PageFactory.initElements(driver,this.getClass());
	}
public BrokenImagesPage ClickOnBrokenImgLnk()
{
	BrokenImagesLnk.click();
	return new BrokenImagesPage();
}
public CheckBoxPage ClickOnCheckBoxlnk()
{

	CheckboxLnk.click();
	return new CheckBoxPage();
}
public DragnDropPage ClickondragndropLnk()
{
	DragnDropLnk.click();
	return new DragnDropPage();
}
public MouseHoverpage ClickOnHoversLnk()
{
	HoversLnk.click();
	return new MouseHoverpage();
}
public DropdownPage ClickOnDropDownLnk()
{
	DropdownLnk.click();
	return new DropdownPage();
}
public SortableTablePage ClickOnSortabletableLnk()
{
	SortableTableLnk.click();
	return new SortableTablePage();
}

}
