package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _7_waits {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new ChromeDriver();
		
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
	    // Implicity wait
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	//WebDriverWait wait= new WebDriverWait(driver, 15);
	
	    //popup icon
	driver.findElement(By.id("alert")).click();  // after 5 seconds popup dusplay
	
	//wait.until(ExpectedConditions.alertIsPresent());
	
	driver.switchTo().alert().accept();
	
	//driver.close();
}
}
