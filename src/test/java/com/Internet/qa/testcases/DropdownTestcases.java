package com.Internet.qa.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Internet.qa.base.TestBase;
import com.Internet.qa.pages.DropdownPage;
import com.Internet.qa.pages.HomePage;

public class DropdownTestcases extends TestBase {
DropdownPage dropdownpg;
HomePage homepg;
	@BeforeMethod
	public void binitialisation()
	{SetUp();
	DropdownPage dropdownpg =new DropdownPage();
	HomePage homepg=new HomePage();
	homepg=PageFactory.initElements(driver,HomePage.class);
	homepg.ClickOnDropDownLnk();
	}

@Test
public void Dropdowntest()
{dropdownpg=PageFactory.initElements(driver,DropdownPage.class);
dropdownpg.dropdownSelMethod();
}
@AfterMethod
public void CloseBrowser()
{
	TearDown();
}
}