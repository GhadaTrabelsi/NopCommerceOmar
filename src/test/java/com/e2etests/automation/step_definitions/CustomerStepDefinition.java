package com.e2etests.automation.step_definitions;


import org.openqa.selenium.JavascriptExecutor;

import com.e2etests.automation.page_objects.CustomerPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.RandomValue;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Setup;
import com.e2etests.automation.utils.Validations;
import com.e2etests.automation.utils.Wait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerStepDefinition {
	 CustomerPage customerPage;
	 SeleniumUtils seleniumUtils;
	 ConfigFileReader configFileReader;
	 Validations validations;
	 Wait wait;
	 RandomValue random;

	public CustomerStepDefinition() {

		this.customerPage = new CustomerPage();
		this.seleniumUtils = new SeleniumUtils();
		this.configFileReader = new ConfigFileReader();
		this.validations = new Validations();
		this.wait = new Wait(Setup.getDriver());
		this.random = new RandomValue();

	}

	@Given("Je m acceder a l espace customer")
	public void jeMAccederALEspaceCustomer() throws InterruptedException {
		seleniumUtils.click(CustomerPage.navCustomers);
		// Thread.sleep(2000);
		// wait.waitUntilClickable(Setup.getDriver(), customerPage.btncustomers)
		seleniumUtils.waitForElementToBeClickable(CustomerPage.btncustomers);
		seleniumUtils.click(CustomerPage.btncustomers);
	}

	@Given("Je clique sur le botton add new")
	public void jeCliqueSurLeBottonAddNew() {

		seleniumUtils.click(CustomerPage.btnAddnew);

	}

	@Given("Je saisie l email")
	public void jeSaisieLEmail() {
		seleniumUtils.writeText(CustomerPage.Email, configFileReader.getProperties("customer.email"));
	}

	@Given("Je saisie le password")
	public void jeSaisieLePassword() {
		seleniumUtils.writeText(CustomerPage.Password, configFileReader.getProperties("customer.password"));
	}

	@Given("Je select le role")
	public void jeSelectLeRole() {
		// ((JavascriptExecutor)
		// Setup.getDriver()).executeScript("window.scrollBy(0,700)", "");
		// seleniumUtils.multiselectByvalue(customerPage.selectRole,
		// configFileReader.getProperties("customer.roleGest"));

		// seleniumUtils.click(customerPage.selectRole);
		// seleniumUtils.multiselectByvalue(customerPage.selectGest,null);

	}

	@Given("Je clique sur le buton save")
	public void jeCliqueSurLeButonSave() {
		seleniumUtils.click(CustomerPage.btnsave);
	}

	@Then("un message  d ajout s affiche")
	public void unMessageDAjoutSAffiche() {

		validations.assertTrue(CustomerPage.assertMessageAjout,
				configFileReader.getProperties("customer.ajoutMessageAssert"));

	}

	@When("Je saisie l email a chercher")
	public void jesaisielemailachercher() {
		seleniumUtils.writeText(CustomerPage.email, configFileReader.getProperties("customer.email"));

	}

	@When("Je clique sur le boutton searsh")
	public void jeCliqueSurLeBouttonSearsh() {
		seleniumUtils.click(CustomerPage.btnsearch);
		((JavascriptExecutor)Setup.getDriver()).executeScript("window.scrollBy(0,700)", "");
	}

	@Then("le costomer s affiche dans le tableu")
	public void leCostomerSAfficheDansLeTableu() {
		
    validations.assertEquals(CustomerPage.elementTableau,configFileReader.getProperties("customer.email"));
		

	}

	@When("Je saisie un email non existant")
	public void jeSaisieUnEmailNonExistant() {
		seleniumUtils.writeText(CustomerPage.email, RandomValue.getSaltString());

	}

	@Then("un tableau s affiche vide")
	public void unTableauSAfficheVide() throws InterruptedException {
		Thread.sleep(2000);
    validations.assertTrue(CustomerPage.tableauVide, configFileReader.getProperties("customer.msg"));
	}

	@When("Je clique sur le boutton edit")
	public void jeCliqueSurLeBouttonEdit() {

	}

	@When("Je modifer les informations souhaiter")
	public void jeModiferLesInformationsSouhaiter() {

	}

	@When("Je clique sur le boutton save")
	public void jeCliqueSurLeBouttonSave() {

	}

	@Then("un message de mise a jour sera afiicher")
	public void unMessageDeMiseAJourSeraAfiicher() {

	}

	@When("Je clique sur le boutton delete")
	public void jeCliqueSurLeBouttonDelete() {

	}

	@When("Je clique sur alert delete")
	public void jeCliqueSurAlertDelete() {

	}

	@Then("un message delete customer s affiche")
	public void unMessageDeleteCustomerSAffiche() {

	}

}
