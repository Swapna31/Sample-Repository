package com.Internet.qa.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Internet.qa.base.TestBase;
import com.Internet.qa.pages.CheckBoxPage;
import com.Internet.qa.pages.HomePage;

public class Checkboxpagetestcases extends TestBase
{
		   
	    CheckBoxPage chkpage;
	    HomePage homepg;
@BeforeMethod
	    public void dinitialisation()
	    {
	        SetUp();
	        homepg = new HomePage();
	        homepg=PageFactory.initElements(driver,HomePage.class);
	        homepg.ClickOnCheckBoxlnk();
	    }
@Test
	    public void SelChBox()
	    {     chkpage = PageFactory.initElements(TestBase.driver,CheckBoxPage.class);
	        if(!chkpage.IsSelectedChkBox1())
	        {
	            chkpage.SelChkBox1();
	        }
	        Assert.assertTrue(chkpage.IsSelectedChkBox1());
	        if(!chkpage.IsSelectedChkBox2())
	        {
	            chkpage.SelChkBox2();
	        }
	        Assert.assertTrue(chkpage.IsSelectedChkBox2());
	    }
@AfterMethod
	    public void browserClose()
	    {
	       TearDown();
	    }
	
}
