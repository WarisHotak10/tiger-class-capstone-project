package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.Utils;

public class DesktopPageObject extends Base {
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Desktops']")
	private WebElement desktopLink;

	@FindBy(xpath = "//div[@class='dropdown-menu']//a[text()='Show All Desktops']")
	private WebElement showalldesktopLink;

	@FindBy(tagName = "img")
	private List<WebElement> allItems;

	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpLp3065Link;

	@FindBy(id = "input-quantity")
	private WebElement quantityInputLink;

	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartButton;

	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOSLink;

	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement dropDownMenu;

	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOSCameraLink;

	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement reviewLink;

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement yourNameField;

	@FindBy(xpath = "//textarea[@class='form-control']")
	private WebElement yourReviewField;

	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> ratingField;

	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;

	public void clickOnDesktopTab() {
		Utils.clickWithJSE(desktopLink);
	}

	public void clickOnShowAllDesktopTab() {
		Utils.clickWithJSE(showalldesktopLink);
	}

	public List<WebElement> desktopItems() {
		List<WebElement> itemsDesk = allItems;
		return itemsDesk;
	}

	public void clickOnHpLp3065Link() {
		Utils.clickWithJSE(hpLp3065Link);
	}

	public void clearQuantity() {
		quantityInputLink.clear();

	}

	public void selectQuantityInput(int quantity) {

		quantityInputLink.sendKeys("1");
	}

	public void clickOnAddToCartButton() {
		Utils.clickWithJSE(addToCartButton);
	}

	public void clickOnCanonEOSLink() {
		Utils.clickWithJSE(canonEOSLink);
	}

	public void selectDropDownMenu() {
		Select select = new Select(dropDownMenu);
		select.selectByValue("15");
	}

	public void clickOnAddToCartCanonEOSCameraLink() {
		Utils.clickWithJSE(canonEOSCameraLink);
	}

	public void clickOnReviewLink() {
		Utils.clickWithJSE(reviewLink);
	}

	public void selectRating(String ratingValue) {
		List<WebElement> ratingElement = ratingField;
		for (WebElement element : ratingElement) {
			if (element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				Utils.clickWithJSE(element);
				break;
			}
		}
	}

	public void clickOnContinueButton() {
		Utils.clickWithJSE(continueButton);
	}

	public void enterYourName(String nameValue) {
		yourNameField.sendKeys(nameValue);
	}

	public void writeYourReviewOnProduct(String reviewValue) {
		yourReviewField.sendKeys(reviewValue);
	}

	public String getSuccessMessage() {
		String text = successMessage.getText();
		return text;
	}

}
