package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	
		Actions ac =new Actions(driver);
		WebElement drag = driver.findElement(By.id("credit2"));
		WebElement drop = driver.findElement(By.id("bank"));
		
		WebElement amount = driver.findElement(By.id("fourth"));
		WebElement amount1 = driver.findElement(By.id("amt7"));
		
		WebElement account = driver.findElement(By.id("credit1"));
		WebElement company = driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
		
		WebElement loan = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		WebElement amount2 = driver.findElement(By.id("amt8"));
		
		ac.dragAndDrop(drag, drop).perform();
		ac.dragAndDrop(amount, amount1).perform();
		ac.dragAndDrop(account, company).perform();
		ac.dragAndDrop(loan, amount2).perform();
		
	}
}
