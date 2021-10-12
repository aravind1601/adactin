package org.test;



import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitClass {
	public static WebDriver driver;
	
	@BeforeClass
	public static void lanchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Before
	public void stTime() {
		Date d=new Date();
		System.out.println(d);
		}
	@Test
	public void test1() {
		driver.get("https://www.google.com/gmail/about/");
		WebElement signIn = driver.findElement(By.xpath("(//a[@data-category='cta'])[2]"));
		signIn.click();
		WebElement text = driver.findElement(By.xpath("(//div[@jscontroller='pxq3x'])[1]"));
		text.sendKeys();
        WebElement nxtBtn = driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]"));
        nxtBtn.click();
        }
	@Test
	public void test2() {
		driver.get("https://www.google.com/gmail/about/");
		WebElement signIn = driver.findElement(By.xpath("(//a[@data-category='cta'])[2]"));
		signIn.click();
		WebElement text = driver.findElement(By.xpath("(//div[@jscontroller='pxq3x'])[1]"));
        text.sendKeys("priya020493@gmil.com");
        WebElement nxtBtn = driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]"));
        nxtBtn.click();
		

	}
	@Test
	public void test3() {
		driver.get("https://www.google.com/gmail/about/");
		WebElement signIn = driver.findElement(By.xpath("(//a[@data-category='cta'])[2]"));
		signIn.click();
		WebElement text = driver.findElement(By.xpath("(//div[@jscontroller='pxq3x'])[1]"));
		text.sendKeys("priya");
        WebElement nxtBtn = driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]"));
        nxtBtn.click();
	}
	@After
	public void enTime() {
		Date d=new Date();
		System.out.println(d);
		

	}
	@AfterClass
	public static void closeBrowser() {
		driver.close();

	}
}


	
	
		
	

