package com.mushishi.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
	public WebDriver driverName(String browser){
		if(browser.equalsIgnoreCase("fireFox")){
			System.setProperty("webdriver.firefox.marionette", "D:\\java\\geckodriver\\geckodriver-v0.14.0-win64\\geckodriver.exe");
			return new FirefoxDriver();
		}else{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\yanxianhuiclearbos\\PycharmProjects\\drivers\\chromedriver.exe");
			return new ChromeDriver();
		}
	}
}
