package Selenium_DailyCommit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrameDemo {


		WebDriver driver=null;
	
		void SetProperty() {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			 driver =new ChromeDriver();
			
		} 
		
		void IframeHandling() {
			
			SetProperty();
			
			driver.get("https://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			
			Actions sc=new Actions(driver);
			
			WebElement sw=driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
			driver.switchTo().frame(sw);
			
			WebElement drag=driver.findElement(By.cssSelector("div#draggable"));
			WebElement drop=driver.findElement(By.cssSelector("div#droppable"));
			sc.dragAndDrop(drag, drop).build().perform();
			
			//to switch to main frame=>
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//a[text()='Button']")).click();
			
			driver.close();

			
			
			
			
			
			
		}
		
		
		
		
	
	
	public static void main(String[] args) {
		iFrameDemo fr=new iFrameDemo();
		fr.IframeHandling();
		
		

	}

}
