package com.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	WebElement element = driver.findElement(By.name("q"));
	element.sendKeys("IBM");
	//Thread.sleep(1000);
	WebElement matchingResult= driver.findElement(By.xpath(".//div[@class='aajZCb']/ul"));
	List<WebElement> listResult= matchingResult.findElements(By.xpath("//li/div/div[@class='sbtc']"));
	System.out.println(listResult);
	//if you want to print matching results   
	     for(WebElement results: listResult)
	       {
	         String value= results.getText();
	        // System.out.println(value);
	       }     
	

}}