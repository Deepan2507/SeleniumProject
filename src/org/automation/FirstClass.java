package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://wwW.facebook.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("Deepan");
		String attribute = findElement.getAttribute("value");
		System.out.println(attribute);
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys("12345");
		String attribute2 = findElement2.getAttribute("value");
		System.out.println(attribute2);
		findElement.getText();
		WebElement findElement3 = driver.findElement(By.name("login"));
		findElement3.click();
		WebElement findElement4 = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		findElement4.click();
		
		

	}

}
