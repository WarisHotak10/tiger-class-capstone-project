package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import page.objects.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base {
	RetailPageObject retailpageobject = new RetailPageObject();
	
	

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = retailpageobject.getTestEnvironmentText();
		Assert.assertEquals(expectedText, actualText);
		logger.info(" test environment was verified ");
		Utils.takeScreenshotForStep();
		Utils.hardWait(2000);

	}

	@And("User click  on My Account")
	public void user_click_on_my_account() {
		retailpageobject.clickOnLoginButton();
		logger.info("my account button clicked successfully");
		Utils.hardWait(2000);
	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailpageobject.clickOnLoginButton();
		logger.info("login button clicked successfully");
		Utils.hardWait(2000);
	}

	@And("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
		retailpageobject.enterEmailField("tigerclass5@tekschool.com");
		retailpageobject.enterPasswordField("5555");
		logger.info("email and password successfully entered");
		Utils.hardWait(2000);
	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		retailpageobject.clickOnLoginLink();
		logger.info("login link clicked successfully");
		Utils.hardWait(2000);
	}

	@Then("User should be logged in to My Account dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		String expectedText = "My Account";
		String actualText = retailpageobject.getTextAfterLogin();
		Assert.assertEquals(expectedText, actualText);
		logger.info("my account dashboard was verified");
		Utils.takeScreenshotForStep();
		Utils.hardWait(2000);

	}
	
	

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailpageobject.clickOnRegister();
		logger.info("user clicked successfully on registerlink");
		Utils.hardWait(2000);
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailpageobject.enterCompanyNameField(data.get(0).get("company"));
		retailpageobject.enterWebsiteField(data.get(0).get("website"));
		retailpageobject.enterTaxidField(data.get(0).get("taxID"));
		retailpageobject.paymentField(data.get(0).get("paymentMethod"));
		retailpageobject.chequePayNameField(data.get(0).get("Cheque Payee Name"));
		logger.info("registration entered successfully");
		Utils.hardWait(2000);
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailpageobject.clickOnCheckBox();
		logger.info("user clicked successfully on checkBox");
		Utils.hardWait(2000);
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button1() {
		retailpageobject.clickOnContinuebttn();
		logger.info("user clicked successfully on continue button");
		Utils.hardWait(2000);
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		String expectedMessage = "Success: Your account has been successfully updated.";
		String actualMessage = retailpageobject.getSuccessMessage();
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("user varified successMessage");
		Utils.takeScreenshotForStep();
		Utils.hardWait(2000);
	}
	
	

	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link() {
		retailpageobject.clickOnEditInformationLink();
		logger.info("user clicked successfully on edit information link");
		Utils.hardWait(2000);
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailpageobject.clickOnBankTransferLink();
		logger.info("user clicked successfully on bank transfer radio button");
		Utils.hardWait(2000);
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailpageobject.enterBankNameField(data.get(0).get("bankName"));
		retailpageobject.enterAbaNumberField(data.get(0).get("abaNumber"));
		retailpageobject.enterSwiftCodeField(data.get(0).get("swiftCode"));
		retailpageobject.enterBankAccountNameField(data.get(0).get("accountName"));
		retailpageobject.enterBankAccountNumberField(data.get(0).get("accountNumber"));
		logger.info("user filled bank information successfully");
		Utils.hardWait(2000);
	}
	
	
	@When("User click on Edit your account information link") 
    public void User_click_on_Edit_your_account_information_link() {
		retailpageobject.clickOneditAccount();
		logger.info("user clicked successfully on edit your account information link");
		Utils.hardWait(2000);
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		retailpageobject.clearFirstNameField();
		retailpageobject.clearLastNameField();
		retailpageobject.clearEmailAddressField();
		retailpageobject.clearPhoneNumberField();
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailpageobject.editFirstNameField(data.get(0).get("firstname"));
		retailpageobject.editLastNameField(data.get(0).get("lastName"));
		retailpageobject.editEmailAddressField(data.get(0).get("email"));
		retailpageobject.editPhoneNumberField(data.get(0).get("telephone"));
		logger.info("user modified account information");
		Utils.hardWait(2000);
	}

	@When("User click on continue button")
	public void user_click_on_continue_button() {
		retailpageobject.clickOnContinueButtonLink();
		
		logger.info("user clicked successfully on continue button");
		
		Utils.hardWait(2000);
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		String expectedText = "Success: Your account has been successfully updated.";
		String actualText = retailpageobject.getEditSuccessMessage();
		Assert.assertEquals(expectedText, actualText);
		logger.info("user verified success message");
		Utils.takeScreenshotForStep();
		Utils.hardWait(2000);
	}

}
