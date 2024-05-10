package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class AuthentificationPage {

	@FindBy(how = How.ID, using = "Email")
	public static WebElement Email;
	
	@FindBy(how = How.ID, using = "Password")
	public static WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public static WebElement btnSumit;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='message-error validation-summary-errors']")
	public static WebElement messageErreur ;
	
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Dashboard')]")
	public static WebElement messageValide ;

	
	public AuthentificationPage() {
		PageFactory.initElements(Setup.driver, this);
	}

}
