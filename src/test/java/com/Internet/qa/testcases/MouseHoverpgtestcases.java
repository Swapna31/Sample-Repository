package com.Internet.qa.testcases;


	import com.Internet.qa.pages.HomePage;
import com.Internet.qa.pages.MouseHoverpage;
import com.Internet.qa.pages.MouseHoverpage;
	import com.Internet.qa.base.TestBase;
	import java.io.PrintStream;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class MouseHoverpgtestcases extends TestBase
	{

	    MouseHoverpage mousehvpg;
	    HomePage homepg;
	    MouseHoverpgtestcases mousehvTc;

	  @BeforeMethod
	  public void Browserinitialisation()
	    {
		  SetUp();
	        homepg = PageFactory.initElements(driver,HomePage.class);
	        homepg.ClickOnHoversLnk();
	        homepg = new HomePage();
	        mousehvpg = new MouseHoverpage();
	      //  MouseHoverpgtestcases mousehvTc = new MouseHoverpgtestcases();
	    }
@Test(priority=1)
	    public void ClickOnProfileafterHover1()
	    {
	        mousehvpg = PageFactory.initElements(driver,MouseHoverpage.class);
	        mousehvpg.MouseHoverClickOnViewProfileImg1();
	        System.out.print(driver.getCurrentUrl());
	        mousehvpg.VerifyTxtInProfile1Page();
	    }
@Test(priority=2)
	    public void ClickOnProfileafterHover2()
	    {
	        mousehvpg = PageFactory.initElements(driver,MouseHoverpage.class);
	        mousehvpg.MouseHoverClickOnViewProfileImg2();
	        driver.manage().timeouts().pageLoadTimeout(10L, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
	        System.out.print(driver.getCurrentUrl());
	        mousehvpg.VerifyTxtInProfile1Page();
	    }
@Test(priority=3)
	    public void ClickOnProfileafterHover3()
	    {
	        mousehvpg = PageFactory.initElements(driver,MouseHoverpage.class);
	        mousehvpg.MouseHoverClickOnViewProfileImg3();
	        driver.manage().timeouts().pageLoadTimeout(10L, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
	        System.out.print(driver.getCurrentUrl());
	        mousehvpg.VerifyTxtInProfile1Page();
	    }
@AfterMethod
	    public void CloseBrowser()
	    {
	        TearDown();
	    }
	}


