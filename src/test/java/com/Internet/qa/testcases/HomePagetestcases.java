package com.Internet.qa.testcases;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Internet.qa.base.TestBase;
import com.Internet.qa.pages.HomePage;

public class HomePagetestcases extends TestBase
{HomePage homepg;
	
@BeforeMethod
public void browserinitialisation()
	{
		SetUp();
		HomePage homepg=new HomePage();
	}
/*	@Test
	public void LinksinaPage()
	    {
	        java.util.List myList1 = new ArrayList();
	        myList1 = Getlinks1(driver, "//a");
	        System.out.println(myList1);
	    }

	    public void brokenLinksTest()
	    {
	        ChkBrokenLinks(TestBase.driver, "//a");
	    }

	    public void GetLinksCntBroken()
	    {
	        Getlinks1(TestBase.driver, "//a");
	    }

	    public void ChkBrokenImagesTest()
	    {
	        driver.findElement(By.xpath("//a[contains(text(),'Broken Images')]")).click();
	        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	        CntImagebroken();
	    }

	    public void DropdownTest()
	    {
	       driver.findElement(By.xpath("//a[contains(text(),'Dropdown')]")).click();
	      driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
	      dropdownSelMethod();
	    }

	    public void SortableWebTable()
	    {
	      driver.findElement(By.xpath("//a[contains(text(),'Sortable Data Tables')]")).click();
	        WebTableWithIDAttr();
	    }

	    public void NumberOfRowsinWebTableTest()
	    {
	     driver.findElement(By.xpath("//a[contains(text(),'Sortable Data Tables')]")).click();
	 
	     
	     NumberOfRowsInWebTable1();
	    }

	    public void teardown()
	    {
	        TestBase.driver.quit();
	    }
	}*/

@Test(priority=1)
	public void clickOnBrokenImagesLnk()
	{
	homepg=PageFactory.initElements(driver,HomePage.class);
		homepg.ClickOnBrokenImgLnk();                 
	}
@Test(priority=2)
public void ClickOnChkboxLnkTest()
{homepg=PageFactory.initElements(driver,HomePage.class);
homepg.ClickOnCheckBoxlnk();
	}
@Test(priority=3)
public void ClickOnDragnDropLnkTest()
{
	homepg=PageFactory.initElements(driver,HomePage.class);
	homepg.ClickondragndropLnk();
}
@Test(priority=4)
public void ClickOnDropdownLnkTest()
{
	homepg=PageFactory.initElements(driver,HomePage.class);
	homepg.ClickOnDropDownLnk();
}
@Test(priority=5)
public void ClickOnSortableTableLnkTest()
{
	homepg=PageFactory.initElements(driver,HomePage.class);
	homepg.ClickOnSortabletableLnk();
}
@Test(priority=6)
public void LinksinHomepage()
{
	      java.util.List myList1 = new ArrayList();
        myList1 = Getlinks1(driver,"//a");
        System.out.println(myList1);
    }
@Test(priority=7)
public void ChkbrokenLinksInHomepgTest()
{
    ChkBrokenLinks(TestBase.driver, "//a");
}
@Test(priority=8)
public void GetLinksCntBrokenInHomepgTest()
{
    Getlinks1(TestBase.driver, "//a");
}
@AfterMethod
public void closeBrowser()
{TearDown();
}

}