package com.example.testingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task004_d5 {
	
	public static void main(String[] args)throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		   js.executeScript("window.scrollBy(0, 2000)","");
		   Thread.sleep(3000);
		WebElement cloth=driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
		cloth.click();
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
