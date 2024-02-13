package Taks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _3_Task {
public static void main(String[] args) throws Throwable {
	
WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new ChromeDriver();
		
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
	    // Implicity wait
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	  //Explict wait
	WebDriverWait wait= new WebDriverWait(driver, 15);
	 
	   //1.Alret messahe displayed
	driver.findElement(By.id("alert")).click();  // after 5 seconds popup display
	
	wait.until(ExpectedConditions.alertIsPresent());
	
	driver.switchTo().alert().accept();
	   
	   //2
   WebElement text= driver.findElement(By.id("populate-text"));
   System.out.println(text.isEnabled());
    
	
	
	
	
}
}
