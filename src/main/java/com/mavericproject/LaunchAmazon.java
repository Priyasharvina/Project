package com.mavericproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LaunchAmazon {
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("platformName", "android");
        cap.setCapability("deviceName", "priya");
        cap.setCapability("browserName", "chrome");
        cap.setCapability("chromedriverExecutable", "C:\\Users\\sugapriyama\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
        
        AndroidDriver driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"),cap);
        
        driver.get("https://www.amazon.com");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
        driver.findElement(AppiumBy.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop",Keys.ENTER);
        
        driver.findElement(AppiumBy.xpath("(//span[contains(text(),'HP Pavilion Laptop (2022 Model)')])[1]")).click();
        
        driver.findElement(AppiumBy.xpath("//span[(text()='Add to Cart')]")).click();
        
        driver.findElement(AppiumBy.xpath("(//input[(@class='a-button-input')])[12]")).click();
       
        
        
	}

}
