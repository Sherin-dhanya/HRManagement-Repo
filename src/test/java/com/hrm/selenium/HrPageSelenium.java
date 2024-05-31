package com.hrm.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrPageSelenium {
	static WebDriver driver;
@Test
	public void CheckAddPage() throws Exception {
		driver=new ChromeDriver();
		driver.get("http://localhost:3000/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("HR Login")).click();
		Thread.sleep(2000);
		driver.close();
}	

//@Test
//public void openBrowser() throws Exception {
//	driver=new ChromeDriver();
//	driver.get("http://localhost:3000/");
//	driver.manage().window().maximize();
//	Thread.sleep(2000);
//	driver.findElement(By.linkText("TRAIN DETAILS")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.id("search")).sendKeys("bangalore");
//	Thread.sleep(2000);
//	driver.close();
//}
}
