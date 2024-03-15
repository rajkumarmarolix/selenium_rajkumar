package Taks_own;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _2nd_Task {
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		  // Aceess the webpage
		driver.get("https://testautomationpractice.blogspot.com/");
		 
		 // To maximize the web page
		driver.manage().window().maximize();
		
		   //Name text box
		WebElement Ntext=driver.findElement(By.xpath("//input[@id='name']"));
		Ntext.sendKeys("raj");
		
		   //Email text box
	WebElement Etext= driver.findElement(By.id("email"));
	Etext.sendKeys("seleniumtask2@gmail.com");
		
		   //Phone no text box
	driver.findElement(By.xpath("//input[@class='form-control'][3]")).sendKeys("9981029348");
	
	Thread.sleep(3000);
	
	 //use for scrolling purpose
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,200)");
	
	      //Address
   WebElement Atext=driver.findElement(By.xpath("//textarea[@id='textarea']"));
   System.out.println(Atext.isEnabled());
   Atext.sendKeys("Hyd");
	
	      //Gender
	String text= driver.findElement(By.xpath("//label[text()='Gender:']")).getText();
	 System.out.println(text);
	 
	 driver.findElement(By.xpath("//input[@id='male']")).click();
	 
	      //Days
	 String text1= driver.findElement(By.xpath("//label[text()='Days:']")).getText();
	 System.out.println(text1);
	 
	 driver.findElement(By.xpath("//input[@id='sunday']")).click();
	 
	       //use for scrolling purpose
		jse.executeScript("window.scrollBy(0,100)");
		
		   //Country
		 driver.findElement(By.xpath("//select[@id='country']")).sendKeys("india");
		
		    //Colors
		//driver.findElement(By.xpath("//option[text()='Green']")).clear();
		
		   //Date
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02082024");
		
		  // close the webpage
		driver.close();
	
	}
	
}
