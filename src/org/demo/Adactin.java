package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Adactin {
	
	public static void main(String[] args) {
		
		ChromeOptions C = new ChromeOptions();
		C.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(C);
		driver.get("https://adactinhotelapp.com/");
	
		}
}
