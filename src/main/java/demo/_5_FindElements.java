package demo;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _5_FindElements {
 public static void main(String[] args) {
	
	 WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  
	 driver.manage().window().maximize();
	  
	  driver.get("https://trytestingthis.netlify.app/");
	   
	  
	  // we use multiple webelements use List<WebElement> & findElements- multiples values 
List<WebElement>tags = driver.findElements(By.tagName("input"));
System.out.println(tags.size());

driver.close();




} 
}
