package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _6_Alrets {
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
	    Alert a1=driver.switchTo().alert();
	    
	    Thread.sleep(3000);
	    
	    a1.accept();     // to handles alerts use this accept-ok, dismiss-cancel
	  //  a1.dismiss();
	}

}
