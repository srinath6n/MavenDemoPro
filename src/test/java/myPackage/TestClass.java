package myPackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import definitions.CvtAttrib;

@Listeners(myListener.UListener.class)			

public class TestClass {

	public WebDriver driver;
	
	@BeforeMethod
	public void BeforeMethodData() throws FileNotFoundException, IOException, ParseException {
		
		driver = new ChromeDriver();
		
		driver.get(CvtAttrib.SData("webSite"));

		System.out.println("Opening - " + CvtAttrib.SData("webSite") + " WebSite!!!!");
	}

	@Test
	public void TestMethod() throws FileNotFoundException, IOException, ParseException {
		
		driver.findElement(By.xpath(CvtAttrib.SData("clickApp"))).click();

		driver.findElement(By.xpath(CvtAttrib.SData("clickApp"))).sendKeys(CvtAttrib.SData("sendkeys"));
		System.out.println("Value Input on search button as " + CvtAttrib.SData("sendkeys"));

		driver.findElement(By.xpath(CvtAttrib.SData("searchIcon"))).click();
		System.out.println("I Clicked and TimedOut in next 2 Sec!!!");

	}
	
	@Test
	public void TesttoFail()
	{
		System.out.println("This method to test fail");					
	    Assert.assertTrue(true);
	}

	@AfterMethod
	public void AfterMethodData() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}