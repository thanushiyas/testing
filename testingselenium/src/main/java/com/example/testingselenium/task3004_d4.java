package com.example.testingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3004_d4 {

	public static void main(String[] args)throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("shubha");
		driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("shubha123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Thanushiya");
		driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("Thanushiya123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("help");
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2500)", "");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("200");
		Thread.sleep(2000);
		driver.quit();
	}
}
