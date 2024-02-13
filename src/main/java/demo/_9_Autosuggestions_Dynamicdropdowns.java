package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _9_Autosuggestions_Dynamicdropdowns {
 public static void main(String[] args) {
	
	 WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		 
		//To maximize the window
		driver.manage().window().maximize();
		
		// Implicity wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		   //one element use findelement
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		
		// more one element use findelements
List<WebElement>option=	driver.findElements(By.xpath("//div[@class='wM6W7d']//b"));
		System.out.println(option.size());
		
		for(WebElement suggestions:option) {
	       System.out.println(suggestions.getText());
	       
	       if(suggestions.getText().contains("download")) {
	    	   suggestions.click();
	    	   
	       }
		}
		
		driver.close();
		
}
}
