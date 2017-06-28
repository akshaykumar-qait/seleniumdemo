package com.google.google;


import java.util.*;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launcher {

   public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.gecko.driver","/home/qainfotech/Downloads/geckodriver");
        WebDriver driver  = new FirefoxDriver();
        
        
        try {
  			Thread.sleep(5000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
        driver.get("http://www.google.com");
        
        
       // driver.get("http://google.com");
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
        String appTitle = driver.getTitle();
        System.out.println("Application title is :: "+appTitle);
        
        
     
      driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("gmail\n");

      Thread.sleep(20000);
      
      driver.findElement(By.name("btnG")).click();

      
      try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
      

		List<WebElement> list = driver.findElements(By.cssSelector("h3.r"));
		System.out.println(list.size());
		
		
		for(int a =0;a<list.size();a++)
		{
		
			
			System.out.println(list.get(a).getText());
			
			
			System.out.println();

			System.out.println();

			System.out.println();
	
		
		}
		
		
		list.get(0).click();
		

		Thread.sleep(10000);	
		
	//	driver.findElement(By.className("CwaK9")).click();
		//Thread.sleep(5000);
		
		
		
		try
		{
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("akshay.1310017@kiet.edu\n");
		}
		catch(Exception ex)
		{
		
			
			
		ex.printStackTrace();
			
			driver.findElement(By.cssSelector("a.gmail-nav__nav-link__sign-in")).click();
			
			driver.findElement(By.cssSelector("#identifierId")).sendKeys("akshay.1310017@kiet.edu\n");
			
		}
		
		  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		  
		driver.findElement(By.name("password")).sendKeys("Iamthunderstar5\n");
		
		  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		driver.findElement(By.cssSelector("#passwordNext")).click();
	
		
		                  
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ArrayList<WebElement>  mylist = (ArrayList<WebElement>) driver.findElements(By.cssSelector("span.bog"));
		System.out.println(mylist.size());
		
		
		
		
		for(int b=1;b<mylist.size();b++)
		{
			System.out.println(mylist.get(b).getText());
			
			
		}
		mylist.get(0).click();
		Thread.sleep(5000);
		
		driver.close();
		
	
		
		
		
		}
}
