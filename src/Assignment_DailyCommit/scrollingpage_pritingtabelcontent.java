package Assignment_DailyCommit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingpage_pritingtabelcontent {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		//from table print 2nd row from table 1
		
			
		List<WebElement> list= driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[3]/td"));
		System.out.println("count of list elements:"+list.size());
		System.out.println(list.get(0).getText());
		
		for (int i=0;i<list.size();i++) {
			
			System.out.println(driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[3]/td")).get(i).getText());
		}
		
		//FOR Getting count of colum and rows
		
		
		System.out.println("Count of columns :"+driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr")).size());
		
		System.out.println("Count of rows :"+driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[2]/td")).size());
		
		
		
		
		
		

	}

}
