package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _8_Dropdowns_Staticdropdown {
 public static void main(String[] args) throws Throwable {
	
	 WebDriverManager.edgedriver().setup();
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		 
		//To maximize the window
		driver.manage().window().maximize();
		
		// Implicity wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	WebElement option = driver.findElement(By.id("option"));
		 
	Select sel = new Select(option);   //select the dropdowns in 3 ways
	//sel.selectByVisibleText("Option 1");
	// sel.selectByValue("option 3");
	  sel.selectByIndex(2);
	
		
		driver.close();
		
		
		
		
		
		
		
		
}
}
