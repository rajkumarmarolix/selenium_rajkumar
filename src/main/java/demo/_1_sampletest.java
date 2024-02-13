package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _1_sampletest {
 public static void main(String[] args) {
	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 
	// WebDriverManager.chromedriver().setup();   //we use any one systemsetproperty or webdriver manager to access the web page on particular browser
	                                           
	 
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.in");
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 }
}
