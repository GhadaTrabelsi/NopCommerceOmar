package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class CustomerPage {

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Customers')]")
	public static WebElement navCustomers;

	@FindBy(how = How.CSS, using = "li[class='nav-item has-treeview menu-is-opening menu-open'] li:nth-child(1)")
	public static WebElement btncustomers;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	public static WebElement btnAddnew;

	@FindBy(how = How.ID, using = "Email")
	public static WebElement Email;
	
	@FindBy(how = How.ID, using = "Password")
	public static WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[1]/div[1]/div[2]/div[10]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]")
	public static WebElement selectRole;
	
	@FindBy(how = How.ID, using = "select2-SelectedCustomerRoleIds-result-gut3-3")
	public static WebElement selectRegister;
	
	@FindBy(how = How.ID, using = "select2-SelectedCustomerRoleIds-result-j11t-4")
	public static WebElement selectGest;
	
	@FindBy(how = How.NAME, using = "save")
	public static WebElement btnsave;
	
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissable']")
	public static WebElement assertMessageAjout;
	
	
	@FindBy(how = How.ID, using = "SearchEmail")
	public static WebElement email ;

	@FindBy(how = How.ID, using = "search-customers")
	public static WebElement btnsearch ;

	
	@FindBy(how = How.XPATH, using = "//td[normalize-space()='omar12344g4.ben.lellahom@gmail.com']")
	public static WebElement elementTableau ;
	

	@FindBy(how = How.ID, using = "customers-grid_info")
	public static WebElement tableauVide ;
	

	public CustomerPage() {
		PageFactory.initElements(Setup.driver, this);
	}

	

	
}
