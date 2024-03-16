package Selenium_DailyCommit;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class limitingWebDriverScope {

	//1.To find all links in page and there names=>
	
	WebDriver driver = null;

	void SetProperties() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//	driver.manage().window().maximize();
	}
	
	void limitingscope() {
		SetProperties();
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Number of links on Page:"+links.size());
		
//		for (WebElement link : links) {
//			
//			System.out.println(link.getText());
//			
//		}
		
		
		//2.To find all links in footer section of page and there names=>
		
		WebElement footerdriver=driver.findElement(By.cssSelector("div[id='gf-BIG']"));
	
		System.out.println("Number of links in footer of page:"+footerdriver.findElements(By.tagName("a")).size());
		
		List<WebElement> ftlinks=footerdriver.findElements(By.tagName("a"));
		
//		for (WebElement ftlink : ftlinks)
//		{
//			System.out.println(ftlink.getText());
//		}
		
		
		//2.To find all links in 1ST Column of footer section of page and there names=>
		
		WebElement Columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/ul[1]"));
		
		List <WebElement> Columnlinks=Columndriver.findElements(By.tagName("a"));
		System.out.println("Number of links in 1st column of footer :"+Columnlinks.size());
		
		
		
		for (int i=1;i<Columnlinks.size();i++) {
			
			String ctr_enter=Keys.chord(Keys.CONTROL,Keys.ENTER);
			Columndriver.findElements(By.tagName("a")).get(i).sendKeys(ctr_enter);
		
		}
		
		Set<String> str= driver.getWindowHandles();
		Iterator<String> it=str.iterator();
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		
		
		
		
		
		
	//	driver.quit();
		
		
		
	}

	
	
	public static void main(String[] args) {
		
		limitingWebDriverScope scope=new limitingWebDriverScope();
		scope.limitingscope();
	}

}
