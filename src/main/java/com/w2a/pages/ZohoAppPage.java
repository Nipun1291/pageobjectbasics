package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {

	
	public void gotoConnect()
	{
		driver.findElement(By.cssSelector("._logo-connect._logo-x96.zod-app-logo")).click();
		
	}
    public CRMHomePage gotoCRM()
    {
    	click("crmlink_CSS");
    	
    	return new CRMHomePage();
    	
    }
    public void goToInvoice()
    {
    	driver.findElement(By.cssSelector("._logo-invoice._logo-x96.zod-app-logo")).click();
    	
    }





}
