package Selenium_DailyCommit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseProperties {
 
	WebDriver driver=null;
	
	 void SetProperty() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		 driver =new ChromeDriver();
		
	}
	public static void main(String[] args) {

		BaseProperties bs=new BaseProperties();
		bs.SetProperty();
		
		
		
		
		
	}

}
