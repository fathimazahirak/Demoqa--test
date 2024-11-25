package org.Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqalogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		String at = driver.getTitle();
		String tt= "DemoQa";
				
		if (at.equalsIgnoreCase(tt))
		{
			System.out.println("Test Successful");
			
		}
		 
		else
		{
			System.out.println("Test is failure");
		}
		
		driver.findElement(By.xpath("//img[@alt='Selenium Online Training']")).click();
		
		driver.close();
		
	}

}
