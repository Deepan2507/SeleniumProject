package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		//WebElement findElement = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		//Actions ac = new Actions(driver);
		//ac.moveToElement(findElement).perform();
		//WebElement findElement2 = driver.findElement(By.xpath("(//*[@class='nav-action-inner'])[1]"));
		//findElement2.click();
		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		findElement.sendKeys("Iphone 14");
		WebElement findElement2 = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		findElement2.click();
}
}