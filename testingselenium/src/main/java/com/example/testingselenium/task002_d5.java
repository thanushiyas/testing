package com.example.testingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task002_d5 {
 

	public static void main(String[] args)throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		
		String r = driver.getCurrentUrl();
		System.out.println(r);
		
		String h="https://j2store.net/free/";
		if(h.equals(r))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		driver.get("https://j2store.net/free/index.php/shop?filter_catid=11");
		String f=driver.getCurrentUrl();
		System.out.println(f);
		String y="https://j2store.net/free/index.php/shop?filter_catid=11";
		if(y.equals(f))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
	}
}
