package Taks_own;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _1st_Task {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		 
		//To maximize the window
		driver.manage().window().maximize();
		
		
		//First name text box
		driver.findElement(By.id("fname")).sendKeys("raj kumar");
		
		
		 //select the Male radio button 
		driver.findElement(By.xpath("//input[@id='male']")).click(); //exact attribute&value use this
		
		
		  // diplay the Choose an option
     WebElement text =driver.findElement(By.xpath("//label[text()='Choose an option:']"));
     System.out.println(text.isDisplayed());
		
		Thread.sleep(3000);
		 
		
		//Lets you select only one option
		driver.findElement(By.xpath("//select[@id='option']")).click();
		
		
		 //Choose applicable options:
		driver.findElement(By.xpath("//input[@name='option2']")).click();
		
		
		  //Start typing and it till automatically guess answer text box
		driver.findElement(By.xpath("//input[@list='datalists']")).sendKeys("Task1");   //.click();
		
		
		  //Select a date
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("02082024");//.click();
		
		
		  //Select your favorite color
		driver.findElement(By.xpath("//input[@id=\"favcolor\"]")).click();
		Thread.sleep(3000);
		
		
		//Scroll to see a range value:
	WebElement scbutton= driver.findElement(By.xpath("//input[@value='50']"));
	System.out.println(scbutton.isEnabled());
        
	Thread.sleep(3000);
	
	/*
	     //Select a file
		driver.findElement(By.xpath("//input[@type='file']")).click();
		Thread.sleep(3000);
		  //Select a quantity from a range
		driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("5");   */
	
	
	  //Long Message
	driver.findElement(By.xpath("//textarea[text()='The cat was playing in the garden.']")).clear();
	
	
	driver.findElement(By.xpath("//textarea[text()='The cat was playing in the garden.']")).sendKeys("Task finished");
	
	
	 //check the submit button enable or not
	WebElement button=driver.findElement(By.xpath("//button[text()=' Submit']"));
	 System.out.println(button.isEnabled());
		 
	 Thread.sleep(3000);
	 
	 
	      // close the browser
		driver.close();
		
		
	}

}
