package org.demo;

import java.awt.Point;
import java.sql.Driver;
import java.sql.DriverAction;
import java.util.Scanner;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo {
		
		public static void main (String[] args) throws InterruptedException {
			
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Browser Name");
			String browser = sc.nextLine();
			
			if (browser.equals("firebox")) {
				
				//System.setProperty("webdriver.gecko.driver", "");
				
				WebDriver driver = new FirefoxDriver();
				driver.get("https://firebox.com/");
				String title = driver.getTitle();
				System.out.println(title);
				
				driver.close();
			}
				else if (browser.equals("chrome")) {
					
					//System.setProperty("webdriver.chrome.driver", "");
					WebDriver driver =  new ChromeDriver();
					driver.get("https://www.google.com/");
					String title1 = driver.getTitle();
					System.out.println(title1);
					String currentUrl = driver.getCurrentUrl();
					System.out.println(currentUrl);
//					String pageSource = driver.getPageSource();
//					System.out.println(pageSource);
					driver.manage().deleteAllCookies();
					Dimension D = new Dimension(1000, 1000);
					driver.manage().window().setSize(D);
					driver.navigate().refresh();
					Thread.sleep(5000);
					driver.close();
				} 
				else {
					System.out.println("Invalid Browser");
				}	
			
	}
		

	}

