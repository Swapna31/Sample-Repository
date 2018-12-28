package com.Internet.qa.testcases;

import com.Internet.qa.pages.DragnDropPage;
	import com.Internet.qa.pages.HomePage;
	import com.Internet.qa.base.*;
	import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class DragnDroppageTestcases extends TestBase
	{

	    DragnDropPage dragdroppg;
	    HomePage homepg;
	    DragnDroppageTestcases dragndroptc;
	    
@BeforeMethod
    public void driverInitialisation()
	    {
	        SetUp();
	        homepg = new HomePage();
	        DragnDropPage dragdroppg = new DragnDropPage();
	        HomePage homepg=new   HomePage();
	        homepg = (HomePage)PageFactory.initElements(driver,HomePage.class);
	        homepg.ClickondragndropLnk();
	    }
@Test
	    public void dragdropTest()
	    {
	         dragdroppg = PageFactory.initElements(driver,DragnDropPage.class);
	         dragdroppg.dragANDdrop();
	    }
@AfterMethod
public void closeBrowser()
{
	TearDown();
}
	}


