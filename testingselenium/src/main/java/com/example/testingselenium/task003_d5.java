package com.example.testingselenium;

	

	import java.util.List;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class task003_d5 {
 
		
		public static void main(String[] args) throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new EdgeDriver();
			driver.get("https://j2store.net/free/");
			driver.manage().window().maximize();
			
			WebElement cloth=driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
			cloth.click();
			
			List<WebElement> ListofElements=driver.findElements(By.cssSelector(".product-title"));
			for(WebElement i:ListofElements)
			{
				System.out.println(i.getText());
			}
			
		}

}
