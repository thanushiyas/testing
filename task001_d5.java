package com.example.testingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task001_d5 {
         public static void main(String[] args)throws InterruptedException
         {
        	 WebDriverManager.chromedriver().setup();
        	 WebDriver driver=new EdgeDriver();
        	 driver.get("https://j2store.net/free/");
        	 driver.manage().window().maximize();
        	 String s=driver.getTitle();
        	 System.out.println(s);
        	 String str="Home";
        	 if(str.equals(s))
        	 {
        		 System.out.println("True");
        	 }
        	 else
        	 {
        		 System.out.println("False");
        	 }
        	 JavascriptExecutor js = (JavascriptExecutor) driver;
             js.executeScript("window.scrollBy(0,1000)", "");
             driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
             driver.get("https://j2store.net/free/index.php/shop");
             String p=driver.getTitle();
             System.out.println(p);
             String r="Shop";
             if(r.equals(p))
             {
            	 System.out.println("true");
             }
             else
             {
            	 System.out.println("false");
             }
             
             driver.quit();
        	 
         }
}
