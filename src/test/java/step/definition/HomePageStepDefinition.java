package step.definition;

import core.Base;
import io.cucumber.java.en.*;
import org.junit.Assert;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base {
	HomePageObject homePageObject = new HomePageObject();
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePageObject.clickOnCurrency();
		logger.info("User successfully clicked on Currency");
		Utils.hardWait(2000);
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
	   homePageObject.clickOnEuroFromDrobdown();
	   logger.info("User successfully clicked on Euro from dropdown");
	   Utils.hardWait(2000);
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homePageObject.isCurrencyValueChangeToEuro();
		logger.info("Currency successfully changed to Euro");
		Utils.hardWait(2000);
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePageObject.clickOnShoppingCart();
		logger.info("User successfully clicked on shopping cart");
		Utils.hardWait(2000);
	}

	@Then("{string} message should display")
	public void message_should_display(String string) {
	    String expectedText = "Your shopping cart is empty!";
	    String actualText = homePageObject.getShoppingCartMessage();
	    Assert.assertEquals(expectedText, actualText);
	    
	}

}
