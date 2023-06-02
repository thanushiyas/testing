package com.example.testingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3002_d4 
{
  public static void main(String[] args) throws InterruptedException{
	    
	  
	  WebDriverManager.chromedriver().setup();
	WebDriver driver=new EdgeDriver();
	  driver.get("https://demo.opencart.com/");
	  driver.manage().window().maximize();
	  
	  WebElement search = driver.findElement(By.name("search"));
	  search.sendKeys("mobiles");
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,4000)","");
	  Thread.sleep(3000);
	  
	  WebElement returns = driver.findElement(By.linkText("Returns"));
      returns.click();
      Thread.sleep(3000);
      driver.navigate().back();
      
	  WebElement giftcertificate = driver.findElement(By.linkText("Gift Certificates"));
	  giftcertificate.click();
	  Thread.sleep(1000);
	  
	  driver.quit();
  }
}
