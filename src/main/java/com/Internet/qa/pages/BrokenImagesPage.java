package com.Internet.qa.pages;

import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Internet.qa.base.TestBase;

public class BrokenImagesPage extends TestBase {
	BrokenImagesPage bipg;
@FindBy(tagName="\\img")
WebElement ImagetagInaPage;
		
public void initialisation()
{
	BrokenImagesPage bipg=new BrokenImagesPage();
	PageFactory.initElements(bipg.driver,this);
}
public int CntImagebroken()
	{
		int InvalidImgCnt=0;

		try {

		java.util.List<WebElement> brokenImgList=new ArrayList<WebElement>();	
		
		brokenImgList=bipg.driver.findElements(By.tagName("\\img"));
		for(WebElement BrokenImg:brokenImgList)
		{
			if(BrokenImg!=null)
			{
				HttpClient client = HttpClientBuilder.create().build();
				HttpGet request = new HttpGet(BrokenImg.getAttribute("src"));
				HttpResponse response = client.execute(request);
				//HttpClient client=new HttpClientBuilder.create().builder();
				//HttpGet request=new HttpGet(BrokenImg.getAttribute("src"));
				//HttpResponse response=((HttpClient) client).execute(request);
				if((response.getStatusLine().getStatusCode())!=200)
				InvalidImgCnt++;
				}
		}
		System.out.println("Invalid Images are" + " " +InvalidImgCnt);
		}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	return InvalidImgCnt;
	}	
	
	
	}


