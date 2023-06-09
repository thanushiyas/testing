package com.example.day8;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task001_d8 {

	public static void  main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions ac=new Actions(driver);
		ac.clickAndHold(drag).release(drop).build().perform();
		
		
	}
}
