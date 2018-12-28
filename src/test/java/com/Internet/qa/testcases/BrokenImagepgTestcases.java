package com.Internet.qa.testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Internet.qa.pages.BrokenImagesPage;
import com.Internet.qa.pages.HomePage;
import com.Internet.qa.base.TestBase; 


public class BrokenImagepgTestcases extends TestBase{
	BrokenImagepgTestcases brokenImgTc;
	BrokenImagesPage brokenImgpg;
	HomePage homepg;
	
@BeforeMethod
public void initialiseBrowser()
{SetUp();
BrokenImagesPage brokenImgpg=new BrokenImagesPage();
HomePage homepg=new HomePage();
homepg=PageFactory.initElements(driver,HomePage.class);
homepg.ClickOnBrokenImgLnk();
}


@Test
public void getAllThebrokenImgTest()
{
	brokenImgpg=PageFactory.initElements(driver,BrokenImagesPage.class);

	System.out.println("TheBroken images count in the webpage is " + " " + brokenImgpg.CntImagebroken());
	
}
@AfterMethod
public void CloseBrowser()
{
	TearDown();
}
}