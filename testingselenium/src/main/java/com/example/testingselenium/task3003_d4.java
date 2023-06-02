package com.example.testingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3003_d4 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement fe=driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
		String txt=fe.getText();
		System.out.println(txt);
		
	}

}
