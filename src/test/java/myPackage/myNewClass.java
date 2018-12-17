package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class myNewClass {

	public WebDriver driver;

	@BeforeMethod
	public void BeforeMethodData() {
		String webSite = "https://google.com/";

		driver = new ChromeDriver();

		driver.get(webSite);

		System.out.println("Opening - " + webSite + " WebSite!!!!");
	}

	@Test
	public void TestMethod() {
		System.out.println("This is a Test Method");

	}

	@AfterMethod
	public void AfterMethodData() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
