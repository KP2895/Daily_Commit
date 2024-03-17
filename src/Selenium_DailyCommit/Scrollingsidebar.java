package Selenium_DailyCommit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingsidebar {

	public static void main(String[] args) throws InterruptedException {


			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			
			Thread.sleep(2000);
			js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,500)");
			
			List<WebElement> count=driver.findElements(By.xpath("//div[@class='tableFixHead'] /table/tbody/tr/td[4]"));
			System.out.println("Total count of amount : "+count.size());
			
			int sum=0;
			for (int i=1;i< count.size()+1;i++) {
				
				System.out.println(driver.findElement(By.xpath("//div[@class='tableFixHead'] /table/tbody/tr["+i+"]/td[4]")).getText());
			
			sum=sum+ Integer.parseInt(driver.findElement(By.xpath("//div[@class='tableFixHead'] /table/tbody/tr["+i+"]/td[4]")).getText());
				
				
				
			}
			System.out.println("Calculated Sum of amount  :"+sum);
			
			System.out.println("sum of amount from table : "+driver.findElement(By.xpath("//div[text()=\" Total Amount Collected: 296 \"]")).getText().split(": ")[1]);
//			Thread.sleep(2000);
//			driver.close();
			
		

	}

}
