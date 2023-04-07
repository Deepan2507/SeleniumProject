package org.automation;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		WebElement findElement = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		findElement.click();
		WebElement findElement2 = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(findElement2).perform();
		Thread.sleep(2000);
		WebElement findElement3 = driver.findElement(By.xpath("//a[text()='Gaming']"));
		Actions ac1 = new Actions(driver);
		ac1.moveToElement(findElement3).perform();
		Thread.sleep(2000);
		WebElement findElement4 = driver.findElement(By.xpath("//a[text()='Gaming Keyboards']"));
		Actions ac2 = new Actions(driver);
		ac2.moveToElement(findElement4).perform();
		findElement4.click();
		Thread.sleep(3000);
		WebElement findElement5 = driver.findElement(By.xpath("//a[text()='HP K300 Wired USB Gaming Keyboard']"));
		findElement5.click();
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for(String win:windowHandles) {
			if(!win.equals(windowHandle)) {
				driver.switchTo().window(win);		
			}
		}
		
		WebElement findElement6 = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		findElement6.click(); 
		
//		TakesScreenshot image = (TakesScreenshot) driver;
//		File screenshotAs = image.getScreenshotAs(OutputType.FILE);
//		System.out.println("screenshotAs");
//		File file = new File("C:\\New.png");
//		FileUtils.copyFile(screenshotAs, file);
		
		
	}
}

















