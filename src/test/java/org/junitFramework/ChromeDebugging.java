package org.junitFramework;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDebugging {
	public static void main(String[] args) {
	
	// Below code for getting the debugger address for browser
	WebDriverManager.chromedriver().setup();
//	ChromeDriver ok=new ChromeDriver();
//	Capabilities cp = ok.getCapabilities();
//	Map<String, Object> asMap = cp.asMap();
//	System.out.println(asMap);    
	
		
	
	ChromeOptions co=new ChromeOptions();
	co.setExperimentalOption("debuggerAddress","localhost:56629");
	WebDriver wb=new ChromeDriver(co);
	wb.get("http://www.w3schools.com/");
	
	
}}
