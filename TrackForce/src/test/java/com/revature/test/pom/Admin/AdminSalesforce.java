package com.revature.test.pom.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminSalesforce {

	public static WebElement getPopulateDBButton(WebDriver driver){
		return driver.findElement(By.className("btn btn-danger"));
	}
}
