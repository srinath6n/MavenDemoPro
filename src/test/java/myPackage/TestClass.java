package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {

	public WebDriver driver;

	@BeforeMethod
	public void BeforeMethodData() {
		String webSite = "https://www.youtube.com/";

		driver = new ChromeDriver();

		driver.get(webSite);

		System.out.println("Opening - " + webSite + " WebSite!!!!");
	}

	@Test
	public void TestMethod() {
		
		String sendkeys = "The Rock";

		driver.findElement(By.xpath("//input[@id='search']")).click();

		driver.findElement(By.xpath("//input[@id='search']")).sendKeys(sendkeys);
		System.out.println("Value Input on search button as " + sendkeys);

		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		System.out.println("I Clicked and TimedOut in next 2 Sec!!!");

	}

	@AfterMethod
	public void AfterMethodData() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
