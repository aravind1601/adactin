package org.test;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Demo extends BaseClass{
	public static void main(String[] args) throws AWTException {
		WebDriver driver = lanchBrowser();
		lanchUrl("https://adactinhotelapp.com/");
		browserMaximize();
		waitMethod();
		WebElement user = driver.findElement(By.id("username"));
		userText(user,"aravindp");
	    Attribute(user,"id");
		WebElement pass = driver.findElement(By.id("password"));
		userText(pass,"aaru@123");
		WebElement login = driver.findElement(By.id("login"));
		btnClick(login);
		WebElement location = driver.findElement(By.name("location"));
		dropDownText(location,"London");
		printText(location);
		WebElement hotel = driver.findElement(By.name("hotels"));
		dropDownIndex(hotel,4);
		WebElement room = driver.findElement(By.name("room_type"));
		dropDownText(room,"Double");
		WebElement rmNo = driver.findElement(By.name("room_nos"));
		dropDownIndex(rmNo,2);
		WebElement adultRm = driver.findElement(By.name("adult_room"));
		dropDownIndex(adultRm,3);
		WebElement childRm = driver.findElement(By.name("child_room"));
		dropDownIndex(childRm,1);
		WebElement searchBtn = driver.findElement(By.id("Submit"));
		btnClick(searchBtn);
		WebElement selectBt = driver.findElement(By.id("radiobutton_0"));
		btnClick(selectBt);
		
		LoginPojo l=new LoginPojo();
		btnClick(l.getContinueBtn());
		userText(l.getNameText(),"Aravind M");
		userText(l.getLastText(),"Aravind M");
		userText(l.getAddressText(),"no.123,main road,cuddalore-607301");
		userText(l.getCardNoText(),"3456789234560145");
		dropDownIndex(l.getCardTypeText(),2);
		dropDownIndex(l.getSelectMth(),6);
		dropDownIndex(l.getSelectYear(),4);
		userText(l.getCvvNo(),"345");
		btnClick(l.getBtn());
		
		WebElement btn = driver.findElement(By.name("my_itinerary"));
		btnClick(btn);
		WebElement clkBtn = driver.findElement(By.name("ids[]"));
		btnClick(clkBtn);
		WebElement cancelBtn = driver.findElement(By.name("cancelall"));
		btnClick(cancelBtn);
		switchToAlert();
		WebElement seachId = driver.findElement(By.name("ids[]"));
		btnClick(seachId);
		selectTab();
        copyText();
		WebElement enterId = driver.findElement(By.name("order_id_text"));
		btnClick(enterId);
		pasteText();
		selectTab();
		enterBtn();
		WebElement logoutBtn = driver.findElement(By.name("logout"));
		pageScroll("arguments[0].click()",logoutBtn);
		
		
		
		
		
		
		
	
	}
	

}
