package com.google.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class thirdJava {

    static WebDriver driver;
    static Wait<WebDriver> wait;

 

    public static void main(String[] args) {

    	
    System.setProperty("webdriver.gecko.driver","/home/qainfotech/Downloads/geckodriver");
          
        driver = new FirefoxDriver();

        wait = new WebDriverWait(driver, 30);

        driver.get("http://www.google.com/");

 

        boolean result;

        try {

            result = firstPageContainsQAANet();

        } catch(Exception e) {

            e.printStackTrace();

            result = false;

        } finally {

            driver.close();

        }

 

        System.out.println("Test " + (result? "passed." : "failed."));

        if (!result) {

            System.exit(1);

        }

    }

 

    private static boolean firstPageContainsQAANet() {

        //type search query

        driver.findElement(By.name("q")).sendKeys("qa automation\n");

 

        // click search

        driver.findElement(By.name("btnK")).click();

 

        // Wait for search to complete

     try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

 

        // Look for QAAutomation.net in the results

        return driver.findElement(By.tagName("body")).getText().contains("qaautomation.net");

    }

}