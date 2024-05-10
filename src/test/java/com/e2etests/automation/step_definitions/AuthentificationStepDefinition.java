package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.AuthentificationPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AuthentificationStepDefinition {

	 SeleniumUtils seleniumUtils;
	 ConfigFileReader configFileReader;
	 Validations validations;
	 AuthentificationPage authentificationPage;

	public AuthentificationStepDefinition() {
		this.seleniumUtils = new SeleniumUtils();
		this.configFileReader = new ConfigFileReader();
		this.validations = new Validations();
		this.authentificationPage = new AuthentificationPage();
	}

	@Given("Je me connect a l application nopcommerce")
	public void jeMeConnectALApplicationNopcommerce() {
		seleniumUtils.get(ConfigFileReader.getProperties("home.url"));
		seleniumUtils.writeText(AuthentificationPage.Email, ConfigFileReader.getProperties("home.mail"));
		seleniumUtils.writeText(AuthentificationPage.Password, ConfigFileReader.getProperties("home.password"));
		seleniumUtils.click(AuthentificationPage.btnSumit);

	}

	@Then("Je me rediriger vers le dashbord")
	public void jeMeRedirigerVersLeDashbord() {
		validations.assertEquals(AuthentificationPage.messageValide, ConfigFileReader.getProperties("home.msg"));
	}

	@Given("Je me connect a l application nopcommerce avec  incorrect coordoner")
	public void jeMeConnectALApplicationNopcommerceAvecIncorrectCoordoner() {
		seleniumUtils.get(ConfigFileReader.getProperties("home.url"));
		seleniumUtils.writeText(AuthentificationPage.Email, ConfigFileReader.getProperties("home.mailNp"));
		seleniumUtils.writeText(AuthentificationPage.Password, ConfigFileReader.getProperties("home.passwordNp"));
		seleniumUtils.click(AuthentificationPage.btnSumit);
	}

	@Then("un message d erreur s affiche")
	public void unMessageDErreurSAffiche() {

		validations.assertTrue(AuthentificationPage.messageErreur, ConfigFileReader.getProperties("home.msgErreur"));
		

	}

}
