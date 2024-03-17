package Selenium_DailyCommit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshot {

	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		 
		TakesScreenshot srcshot= (TakesScreenshot) driver;
		File src=srcshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("F:\\Screenshots\\j.png"));
		
		 
		
	}

}
