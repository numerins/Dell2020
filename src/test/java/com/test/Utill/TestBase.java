package com.test.Utill;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static WebElement element;
	public static EventFiringWebDriver e_driver;
	//public static WebEventListner eventListener;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\java\\com\\test\\confige\\config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//webDriver//chromedriver.exe");
			driver = new ChromeDriver();
			  
			  driver.manage().window().maximize(); driver.manage().deleteAllCookies();
			  driver.manage().timeouts().pageLoadTimeout(TestUtill.page_Load_Timeout,
			  TimeUnit.SECONDS);
			  driver.manage().timeouts().implicitlyWait(TestUtill.implicitly_Wait,
			  TimeUnit.SECONDS);
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\numer\\eclipse-workspace\\Dell2020.com\\src\\test\\java\\com\\test\\confige");
			driver = new FirefoxDriver();
		} 

	}

	public static void getDriver(String url) {
		//driver.get(Url);
		driver.get(prop.getProperty("url"));
	}

}

