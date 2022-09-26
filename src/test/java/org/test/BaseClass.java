package org.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
	public static WebDriver driver;
  public static WebDriver launchbrowser(String browsername) {
	switch(browsername) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		break;
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		break;		
}
	return driver;
}
  
  
  
  
}

