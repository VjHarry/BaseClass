package org.junitFramework;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.concurrent.TimeUnit;
import org.codehaus.plexus.util.FileUtils;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {
	static WebDriver driver;
	@BeforeClass
	public static void BeforeClass() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/login.php/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
	}
	@AfterClass
	public static void AfterClass() throws Exception {
	
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src =tk.getScreenshotAs(OutputType.FILE);
		long time=System.currentTimeMillis();
		File des=new File("\\Users\\harit\\eclipse-workspace\\BaseClass\\ss\\fb"+time+".png");
		FileUtils.copyFile(src, des);
		System.out.println("Screenshot saved");		
		driver.quit();		
	}
	@Before
	public void Before() {
		System.out.println("Before test done");
	}
	@After
	public void After() {
	System.out.println("After test done");
	}
	@Test
	public void test2() {
	driver.findElement(By.id("email")).sendKeys("Vjharry");
	driver.findElement(By.id("pass")).sendKeys("haribose");
	driver.findElement(By.id("loginbutton")).click();
	
	String txt = driver.findElement(By.xpath("//div[@class=\"_9ay7\"]")).getText();
	System.out.println(txt);
	
	Assert.assertEquals("Assert pass", "The password that you've entered is incorrect. Forgotten password?", txt);
	System.out.println("Assert passed");
	}
}
