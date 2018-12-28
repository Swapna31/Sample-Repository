package com.Internet.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Internet.qa.base.*;

public class DragnDropPage extends TestBase{
	//TestBase tb=new TestBase();
	DragnDropPage dragdroppg;
@FindBy(id="column-a")
WebElement FromelementA;
@FindBy(id="column-b")
WebElement ToelementB;

public DragnDropPage InitialisationElements()
{
	return PageFactory.initElements(driver,this.getClass());
}

public void dragANDdrop()
{
		//Actions a=new Actions(driver);
		//a.dragAndDrop(FromelementA,ToelementB).build().perform();
	//WebElement from=driver.findElement(By.id("column-a"));
	//WebElement To=driver.findElement(By.id("column-b"));
	/*Actions a=new Actions(tb1.driver);
	a.dragAndDrop(from,To).perform();*/
	
//	WebElement w= wait.until(ExpectedConditions.presenceOfElementLocated(By.id(column-a))
	 Actions builder = new Actions(driver);
	    builder.keyDown(Keys.CONTROL)
	        .click(FromelementA)
	        .dragAndDrop(FromelementA,ToelementB)
	        .keyUp(Keys.CONTROL);

	        org.openqa.selenium.interactions.Action selected = builder.build();

	        selected.perform();
	
}
}

