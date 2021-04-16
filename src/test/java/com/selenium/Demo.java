package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pankaj_1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		
			WebDriver driver=new ChromeDriver() ;
			driver.get("https://www.noon.com/uae-en/");
		  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[3]/div/div[1]/div/div/div/div/div/div[1]/div/h3"));
		List<WebElement> list=driver.findElements(By.tagName("img"));
		
		
		System.out.println(list);
		
		for(WebElement e:list){
			System.out.println(e.getText());
		}
		
		
		
		System.out.println("End");
		
		
		}
		

}
