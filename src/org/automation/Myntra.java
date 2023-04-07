package org.automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra {
		public static void main(String[] args) throws IOException {
			
			ChromeOptions C = new ChromeOptions();
			C.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver(C);
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			
		TakesScreenshot image = (TakesScreenshot) driver;
		File screenshotAs = image.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		File file = new File ("D:\\new.png");
		FileUtils.copyFile(screenshotAs, file);
	}

		
} 














//
//TakesScreenshot image = (TakesScreenshot) driver;
//File screenshotAs = image.getScreenshotAs(OutputType.FILE);
//System.out.println(screenshotAs);
//File file = new File("D:\\new.png");
//FileUtils.copyFile(screenshotAs, file);







	
			
			
			
			
			
			
			
			
		
	
	
	