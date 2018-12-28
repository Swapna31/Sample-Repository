package com.Internet.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Internet.qa.base.TestBase;

public class MouseHoverpage extends TestBase
{
		@FindBy(xpath="//img[@src='/img/avatar-blank.jpg'][1]")
		WebElement Img1;

		@FindBy(xpath="//div[@class='example']/div[@class='figure'][2]/img[@src='/img/avatar-blank.jpg']")
		WebElement Img2;
		@FindBy(xpath="//div[@class='example']/div[@class='figure'][3]/img[@src='/img/avatar-blank.jpg']")
		WebElement Img3;
		@FindBy(xpath="//h5[contains(text(),'name: user1')]")
		WebElement DataImg1Hover;
		@FindBy(xpath="//a[@href='/users/1']")
		WebElement viewProfileonHoverImg1;
		@FindBy(xpath="//a[@href='/users/2']")
		WebElement viewProfileonHoverImg2;
		@FindBy(xpath="//a[@href='/users/3']")
		WebElement viewProfileonHoverImg3;
		@FindBy(xpath="//h1[contains(text(),'Not Found')]")
		WebElement NotfoundTxt;


	public void MouseHoverClickOnViewProfileImg1()
	{
	Actions a=new Actions(driver);
	a.moveToElement(Img1).moveToElement(viewProfileonHoverImg1).click().build().perform();
	}

	public void MouseHoverClickOnViewProfileImg2()
	{
	Actions a=new Actions(driver);
	a.moveToElement(Img2).moveToElement(viewProfileonHoverImg2).click().build().perform();
	}
	public void MouseHoverClickOnViewProfileImg3()
	{
	Actions a=new Actions(driver);
	a.moveToElement(Img3).moveToElement(viewProfileonHoverImg3).click().build().perform();
	}

	public void VerifyTxtInProfile1Page()
	{
		Assert.assertTrue(NotfoundTxt.isDisplayed());
	}

}
