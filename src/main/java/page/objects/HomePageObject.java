package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class HomePageObject extends Base {
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

//	first scenario
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currency;
	@FindBy(xpath = "//button[text()='€ Euro']")
	private WebElement euroFromDropdown;
	@FindBy(xpath = "//div[@class='btn-group']//button//strong")
	private WebElement currencyValue;
// second scenario
	@FindBy(xpath = "//div[@id='cart']//button")
	private WebElement shoppingCart;
	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement shoppingCartMessage;
	
	public void clickOnCurrency() {
		Utils.clickWithJSE(currency);
	}
	public void clickOnEuroFromDrobdown() {
		Utils.clickWithJSE(euroFromDropdown);
	}
	public boolean isCurrencyValueChangeToEuro() {
		if(currencyValue.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	public void clickOnShoppingCart() {
		Utils.clickWithJSE(shoppingCart);
	}
	public String getShoppingCartMessage() {
		String text = shoppingCartMessage.getText();
		return text;
	}
	
	
	
}





