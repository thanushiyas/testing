package com.example.testingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task005_d5 {
	public static void main(String[] args)throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.smart-hospital.in/site/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a/span")).click();
		WebElement web=driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a/span"));
		String opd=web.getText();
		System.out.println(opd);
		String tagname=web.getTagName();
		System.out.println(tagname);
		WebElement search=driver.findElement(By.xpath("//*[@id=\"search-btn\"]"));
		System.out.println(search.getSize());
		System.out.println(search.getCssValue("color"));
		
		
		
		
		
		
		
	}

}
