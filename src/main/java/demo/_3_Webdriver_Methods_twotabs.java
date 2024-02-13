package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _3_Webdriver_Methods_twotabs {
 public static void main(String[] args) throws InterruptedException {
	 
	 //webdriver manager
 WebDriverManager.chromedriver().setup();
	 
     //obj of driver
	 WebDriver driver = new ChromeDriver();
	 
	  // maximize
	 driver.manage().window().maximize();
	 
	 //web page url
	 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	 
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
	 
	 //use for wait 
    Thread.sleep(3000);
    
    //access particular page/icon/tab
 driver.findElement(By.id("newTabBtn")).click();
  
    // close the single tab
 // driver.close();
 
     // to close the two tads at once
	driver.quit();
	
	System.out.println("tabs are closed");
}
}
