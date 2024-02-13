package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _4_WebElement_Methods {
	
 public static void main(String[] args) throws Throwable {
	 WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  
	 driver.manage().window().maximize();
	  
	  driver.get("https://trytestingthis.netlify.app/");
	  
WebElement	radiobutton = driver.findElement(By.id("male"));
	 radiobutton.click();
	 System.out.println(radiobutton.isSelected());
	 
	 Thread.sleep(2000);
	  
	 // use for text is displayed or not, we get true/false values
 /* WebElement text=driver.findElement(By.xpath("//h1[text()='Your Website to practice Automation Testing']"));
	 System.out.println(text.isDisplayed()); */
	  
	 
	// use for text is displayed ,we get text
String text=driver.findElement(By.xpath("//h1[text()='Your Website to practice Automation Testing']")).getText();
 System.out.println(text);
 
 WebElement button=driver.findElement(By.xpath("//button[text()=' Submit']"));
 System.out.println(button.isEnabled());
 
 WebElement f =driver.findElement(By.id("fname"));  //.sendKeys("raj kumar");
  f.sendKeys("rk");
  
 Thread.sleep(3000);
 
	 driver.close();
}
}
