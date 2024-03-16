package Selenium_DailyCommit;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender {

	public static void main(String[] args) {
		
		//pick date form date picker =>//28/6/27 and print content
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("div[class=react-date-picker__inputGroup]")).click();
	//	driver.findElement(By.cssSelector("(//div/div/button[@type='button'])[7]")).click();
		
			
			driver.findElement(By.cssSelector("[class='react-calendar__navigation__label']")).click();	
			driver.findElement(By.cssSelector("[class='react-calendar__navigation__label']")).click();
			
			
			driver.findElement(By.xpath("//button[text()='2027']")).click();
			
			driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(6).click();
			
			driver.findElement(By.cssSelector("abbr[aria-label='July 28, 2027']")).click();
			
			List<WebElement> dates=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
			
			//System.out.println(dates.get(1).getText());
			
			
			for (int i=0;i<dates.size();i++) {
				
				System.out.print(dates.get(i).getAttribute("value")+"/");
			}
			
			 	
			
		
		//28/6/27
		
		
		

	}

}
