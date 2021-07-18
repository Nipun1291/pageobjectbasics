package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountsPage;

public class TopMenu {
	
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void gotoHome()
	{
		
	}
	public void gotoLeads()
	{
		
	}
	public void gotoFeeds()
	{
		
	}
	public AccountsPage gotoAccounts()
	{
		Page.click("accountstab_CSS");
		
		return new AccountsPage();
	}
	public void gotoContacts()
	{
		
	}
	public void signOut()
	{
	
	}
	
	


















}
