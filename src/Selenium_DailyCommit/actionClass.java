package Selenium_DailyCommit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {

	WebDriver driver = null;

	void SetProperties() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	void ChildMain() throws InterruptedException {

		SetProperties();
		
		
		WebElement eb1 = driver.findElement(By.cssSelector("div[aria-label='Two Wheelers']"));
		
		Actions act = new Actions(driver);
		
//		Action Class Uses =>
		
//		1. Mouse over to webelement =>
		
		act.moveToElement(eb1).build().perform();
		System.out.println(eb1.getText());

//		2.Right click
		
		WebElement eb2 = driver.findElement(By.cssSelector("div[class=\"H6-NpN _3N4_BX\"]"));
		act.moveToElement(eb2).contextClick().build().perform();
		System.out.println(eb2.getText());
		
//		3.Enter letters in capital 
		
		WebElement eb3=driver.findElement(By.cssSelector("input[name=\"q\"]"));
		act.moveToElement(eb3).click().keyDown(Keys.SHIFT).sendKeys("Redmi Phones").build().perform();
		
		
//		4.double click
		
		WebElement wb4=driver.findElement(By.cssSelector("div[class='_16ZfEv']"));
		act.moveToElement(wb4).doubleClick().build().perform();
		
	
		
		
//		5.Drag & drop
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
	Thread.sleep(2000);
			WebElement wb6 =driver.findElement(By.cssSelector("div[id='draggable']"));
			System.out.println(wb6.getText());
			
			WebElement wb7=driver.findElement(By.cssSelector("div[id='droppable']"));
			System.out.println(wb7.getText());
			
			act.dragAndDrop(wb6, wb7).build().perform();
			
			
			
		
	}

	public static void main(String[] args) throws InterruptedException  {

		actionClass ac = new actionClass();
		ac.ChildMain();
		
		System.out.println("Thank you.....");
	}

}
