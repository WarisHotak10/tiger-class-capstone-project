package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Utils;
import core.Base;

public class RetailPageObject extends Base {
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmenttext;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;
	@FindBy(xpath = "//ul//a[text()='Login']")
	private WebElement loginButton;
	@FindBy(id = "input-email")
	private WebElement emailAddressField;
	@FindBy(id = "input-password")
	private WebElement passField;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginlink;
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccPage;

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement register;
	@FindBy(id = "input-company")
	private WebElement company;
	@FindBy(id = "input-website")
	private WebElement website;
	@FindBy(id = "input-tax")
	private WebElement taxid;
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement paymentMathod;
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement chequePayName;
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement checkBox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continuebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;

	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editInformationLink;
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransferRadioButton;
	@FindBy(xpath = "//input[@name='bank_name']")
	private WebElement enterBankName;
	@FindBy(xpath = "//input[@name='bank_branch_number']")
	private WebElement AbaNumber;
	@FindBy(xpath = "//input[@name='bank_swift_code']")
	private WebElement swiftCode;
	@FindBy(xpath = "//input[@name='bank_account_name']")
	private WebElement bankAccountName;
	@FindBy(xpath = "//input[@name='bank_account_number']")
	private WebElement bankAccountNumber;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueLink;
	@FindBy(linkText = "Success: Your account has been successfully updated.")
	private WebElement successMessageLink;
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editAccountLink;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement editFirstName;
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement editLastName;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement editEmailAddress;
	@FindBy(xpath = "//input[@name='telephone']")
	private WebElement editPhoneNumber;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButtonLink;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement editSuccessMessage;

	public String getTestEnvironmentText() {
		String textfromUI = testEnvironmenttext.getText();
		return textfromUI;
	}

	public void clickOnMyAccountButton() {
		
		Utils.clickWithJSE(myAccountButton);
		
	}

	public void clickOnLoginButton() {
		Utils.clickWithJSE(loginButton);
	}

	public void enterEmailField(String email) {
		emailAddressField.sendKeys(email);
	}

	public void enterPasswordField(String Password) {
		passField.sendKeys(Password);
	}

	public void clickOnLoginLink() {
		Utils.clickWithJSE(loginlink);
	}

	public String getTextAfterLogin() {
		String textFromUIAfterLogin = myAccPage.getText();
		return textFromUIAfterLogin;
	}

	public void clickOnRegister() {
		Utils.clickWithJSE(register);
	}

	public void enterCompanyNameField(String companyName) {
		company.sendKeys(companyName);
	}

	public void enterWebsiteField(String enterwebsite) {
		website.sendKeys(enterwebsite);
	}

	public void enterTaxidField(String id) {
		taxid.sendKeys(id);
	}

	public void paymentField(String pay) {
		paymentMathod.sendKeys(pay);
	}
	public void chequePayNameField(String chequepayname) {
		chequePayName.sendKeys(chequepayname);
	}

	public void clickOnCheckBox() {
		Utils.clickWithJSE(checkBox);
	}

	public void clickOnContinuebttn() {
		Utils.clickWithJSE(continuebutton);
	}

	public String getSuccessMessage() {
		String text = successMessage.getText();
		return text;
	}

	public void clickOnEditInformationLink() {
		Utils.clickWithJSE(editInformationLink);
	}

	public void clickOnBankTransferLink() {
		Utils.clickWithJSE(bankTransferRadioButton);
	}

	public void enterBankNameField(String bankname) {
		enterBankName.sendKeys(bankname);
	}

	public void enterAbaNumberField(String abanumber) {
		AbaNumber.sendKeys(abanumber);
	}

	public void enterSwiftCodeField(String swiftcode) {
		swiftCode.sendKeys(swiftcode);
	}

	public void enterBankAccountNameField(String bankaccountname) {
		bankAccountName.sendKeys(bankaccountname);
	}

	public void enterBankAccountNumberField(String bankaccountnumber) {
		bankAccountNumber.sendKeys(bankaccountnumber);
	}

	public void clickOnContinuebttnLink() {
		Utils.clickWithJSE(continueLink);
	}

	public String getSuccessMessageBttn() {
		String text = successMessageLink.getText();
		return text;
	}

	public void clickOneditAccount() {
		Utils.clickWithJSE(editAccountLink);
	}
	public void clearFirstNameField() {
		editFirstName.clear();
	}

	public void editFirstNameField(String editname) {
		editFirstName.sendKeys(editname);
	}
	public void clearLastNameField() {
		editLastName.clear();
	}

	public void editLastNameField(String editlastname) {
		editLastName.sendKeys(editlastname);
	}
	public void clearEmailAddressField() {
		editEmailAddress.clear();
	}

	public void editEmailAddressField(String editemailaddress) {
		editEmailAddress.sendKeys(editemailaddress);
	}
	public void clearPhoneNumberField() {
		editPhoneNumber.clear();
	}

	public void editPhoneNumberField(String editphonenumber) {
		editPhoneNumber.sendKeys(editphonenumber);
	}

	public void clickOnContinueButtonLink() {
		Utils.clickWithJSE(continueButtonLink);
	}

	public String getEditSuccessMessage() {
		String text = editSuccessMessage.getText();
		return text;
	}

}
