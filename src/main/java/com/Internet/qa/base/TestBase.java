package com.Internet.qa.base;

import java.awt.List;
	import java.io.IOException;
	import java.net.HttpURLConnection;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.NoSuchElementException;
	import java.util.concurrent.TimeUnit;

	import org.apache.http.HttpResponse;
	import org.apache.http.client.HttpClient;
	import org.apache.http.client.methods.HttpGet;
	import org.apache.http.impl.client.HttpClientBuilder;
	//import org.apache.http.impl.client.CloseableHttpClient;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class TestBase {
	private static final String String = null;
	public static WebDriver driver;
	String homepage="http://the-internet.herokuapp.com/";
	String url="";
	HttpURLConnection huc=null;
	int responsecode=200;
	public void SetUp()
	{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Swapna Tirumala\\eclipse-workspace\\Automationtestcases\\src\\main\\java\\resources\\geckodriver.exe");
	
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
	public FirefoxDriver getdriver()
	{return getdriver();
	}
	public void TearDown()
	{
		driver.quit();
	}
	public java.util.List<String> Getlinks1(WebDriver driver,String xpath)
		{ 
		java.util.List<WebElement> myList = new ArrayList<WebElement>();
		java.util.List<String> myList2 = new ArrayList<String>();
		myList=driver.findElements(By.xpath(xpath));
		
		//To click on last link of the page
		//myList.get(myList.size() - 1).click();
		//loop thru the list(all links) and get the link names
		for(int i=0;i<myList.size();i++)
		{
			/*if(i==myList.size()-1)
			{
				myList.get(i).click();
			}*/
		String s=myList.get(i).getText();
		myList2.add(s);
		}
		return myList2;
		}
	public void ChkBrokenLinks(WebDriver driver,String xpath)
	{
	java.util.List<WebElement> myList3 = new ArrayList<WebElement>();

	myList3=driver.findElements(By.xpath(xpath));
	Iterator<WebElement> it=myList3.iterator();
		while(it.hasNext())
		{
		url=it.next().getAttribute("href");	
		if(url==null||url.isEmpty())
		{System.out.println("the url isnot configured");
		continue;
		}
		if(!url.startsWith(homepage))
		{System.out.println(url + "It is another domain");
		continue;
		}
		try {
			huc = (HttpURLConnection)(new URL(url).openConnection());
			huc.setRequestMethod("HEAD");
			huc.connect();
			responsecode=huc.getResponseCode();
			if(responsecode>=400)
			{
				System.out.println(url + "url is a broken link");
			}
			else
			{
				System.out.println(url + "url is a valid link");
			}
				}
		
		 catch(MalformedURLException e)
		{
			e.printStackTrace();
		}
		 catch(IOException e)
		{
			e.printStackTrace();
		}
	}
		
	}	
	public int CntImagebroken()
	{
		int InvalidImgCnt=0;

		try {

		java.util.List<WebElement> brokenImgList=new ArrayList<WebElement>();	
		
		brokenImgList=driver.findElements(By.tagName("\\img"));
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
		
	public void dropdownSelMethod()
	{//Select s=new Select(driver.findElement(By.id("dropdown")));
	//s.selectByValue("Option 1");
	WebElement dropdown=driver.findElement(By.id("dropdown"));
	Select sdropdown=new Select(dropdown);
	sdropdown.selectByIndex(1);
	}
	public void WebTableWithIDAttr()
	{
		//WebElement wtable=driver.findElement(By.id("table2"));
		driver.findElement(By.xpath("//span[@class='last-name']")).click();
		//table[@id='table2']//tbody//tr[2]//td[1]
		//table[@id='table2']//tbody//tr[3]//td[1]
		//table[@id='table2']//tbody//tr[4]//td[1]
		//table[@id='table2']//tbody//tr[5]//td[1]
		
	String beforepath="//table[@id='table2']//tbody//tr[";

	String afterpath="]//td[1]";

	//xpath=beforepath + i + afterpath;
	for(int i=1;i<5;i++) {
		String xpath=beforepath + i + afterpath;
		String slastName=driver.findElement(By.xpath(beforepath + i + afterpath)).getText();
		System.out.println(slastName);
		if(slastName.equals("Smith"))
		{
		driver.findElement(By.xpath("//table[@id='table2']//td[contains(text(),'Smith')]/following-sibling::td[5]//a[1]")).click();
		System.out.print(driver.getCurrentUrl());
		}
	}
	}
	public ArrayList<java.lang.String> NumberOfRowsInWebTable1()
	{ArrayList<java.lang.String> lrowText=new ArrayList<String>();

		java.util.List<WebElement> rows= new ArrayList<WebElement>();
		rows=driver.findElements(By.xpath("//table[@id='table2']//tr"));
		rows.size();
		try {
		for(int i=2;i<rows.size();i++)
		{
			//for(int j=1;j<=5;j++)
			//{
			String beforepath="//table[@id='table2']//tr[";
					String  afterpath="]";
		String rowText=driver.findElement(By.xpath(beforepath + i + afterpath)).getText();
		lrowText.add(rowText);
		System.out.println(lrowText);
		}
		}
		catch(NoSuchElementException e)
		{e.printStackTrace();
	}
	return lrowText;
	}
	public void ChkBoxSelect()
	{
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isDisplayed();	
	}

	}



































		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


