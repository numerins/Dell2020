package com.test.Utill;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtill {

	public static long page_Load_Timeout = 80;
	public static long implicitly_Wait = 80;

	public static void Takescreenshot(WebDriver driver,String screenshot) {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String CurrentDir = System.getProperty("user.dir");
		
		try {
			FileUtils.copyFile(scrFile,new File(CurrentDir+"/Screenshot/"+screenshot+".png"));
		
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}

