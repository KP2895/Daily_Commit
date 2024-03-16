package Selenium_DailyCommit;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Navigating from one window to anather and print & copy email id form 2nd window nad paste in 
//1st window email txt box

public class childWindowHandling {

	WebDriver driver=null;
	void SetProperty() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		 driver =new ChromeDriver();
		
	} 
	
	void WindowHandling() {
		
		SetProperty();
		
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		Set<String> windows=  driver.getWindowHandles();
		
		Iterator<String> it=  windows.iterator();
		String parent =it.next();
		String child=it.next();	
	
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		WebElement wb=driver.findElement(By.cssSelector("p[class='im-para red']"));
		
//		String[] Email1=wb.getText().split("@");
//		String[] Email2=Email1[1].split(" ");
//		String [] Email3=Email2[0].split(".");
//		//String Email=Email3[0];
//		
		
		
//		System.out.println("EmailId:"+Email);
//		
		driver.switchTo().window(parent);
		driver.findElement(By.cssSelector("input[id=username]")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector("input[id=password]")).sendKeys("learning");
		
		
		
		WebElement w1=driver.findElement(By.cssSelector("select[class='form-control']"));
		Select sc=new Select(w1);
		sc.selectByValue("consult");
		
		driver.findElement(By.cssSelector("input[id=\"terms\"]")).click();
		driver.findElement(By.cssSelector("input[id=\"signInBtn\"]")).click();
		
		
	
	}
	
	
	
	public static void main(String[] args) {
		

		childWindowHandling handling=new childWindowHandling();
		handling.WindowHandling();
		
	}

}
