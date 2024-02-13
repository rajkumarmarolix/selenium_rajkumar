package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _2_Webdriver_Methods {
 public static void main(String[] args) {
	 
	 // WebDriverManager
	 WebDriverManager.chromedriver().setup();
	  // obj of browser
	 WebDriver driver = new ChromeDriver();
	 
	 //maximize the window
	 driver.manage().window().maximize();
	 
	 //url of web page url
	 driver.get("https://www.amazon.in");
	 
	 //print url of web page
   String url  =  driver.getCurrentUrl();
   System.out.println(url);
	 
    //print Title of web page
  //String title= driver.getTitle();
  //System.out.println(title);
  System.out.println(driver.getTitle());
 
    //print the page source
 //System.out.println(driver.getPageSource()); 
   
  //to handle the windowhandle
 String wh=driver.getWindowHandle();
 System.out.println(wh);

   // close the web page
  driver.close();
	
	 



}
}
