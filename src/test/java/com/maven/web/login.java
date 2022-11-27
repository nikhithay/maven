package com.maven.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	
	
	
	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\JarFiles\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
	}

}

	