package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.*;

import page.objects.DesktopPageObject;
import utilities.Utils;

public class DesktopPageStepDefinition extends Base{
	DesktopPageObject desktoppageobject = new DesktopPageObject();

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktoppageobject.clickOnDesktopTab();
		logger.info("User clicked successfully on Desktop tab");
		Utils.hardWait(2000);
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktoppageobject.clickOnShowAllDesktopTab();
		logger.info("User clicked successfully on Show all desktops");
		Utils.hardWait(2000);
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	    List<WebElement> desktopElement = desktoppageobject.desktopItems();
	    for(WebElement element : desktopElement) {
	    	Assert.assertTrue(element.isDisplayed());
	    	logger.info(element.getAttribute("title") + "is present");
	    	Utils.hardWait(2000);
	    }
	    	    
	}

	@When("User click  ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktoppageobject.clickOnHpLp3065Link();
		logger.info("User clicked successfully on HP LP3065 item");
		Utils.hardWait(2000);
	}

	@When("User select quantity {int}")
	public void user_select_quantity(int quantity) {
		desktoppageobject.clearQuantity();
		desktoppageobject.selectQuantityInput(quantity);
		logger.info("User selected quantity 1" );
		Utils.hardWait(2000);
	    
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktoppageobject.clickOnAddToCartButton();
		logger.info("User clicked successfully on add to cart button");
		Utils.hardWait(2000);
	}

	@When("User click  ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktoppageobject.clickOnCanonEOSLink();
		logger.info("User clicked successfully on Canon EOS");
		Utils.hardWait(2000);
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktoppageobject.selectDropDownMenu();
		logger.info("User selected successfully Red from drop down");
		Utils.hardWait(2000);
	}

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktoppageobject.clickOnAddToCartCanonEOSCameraLink();
		logger.info("User clicked successfully on canon EOS for Second time");
		Utils.hardWait(2000);
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktoppageobject.clickOnReviewLink();
		logger.info("User clicked successfully on review link");
		Utils.hardWait(2000);
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String,String>> dataReview = dataTable.asMaps(String.class,String.class);
	    desktoppageobject.enterYourName(dataReview.get(0).get("yourname"));
	    desktoppageobject.writeYourReviewOnProduct(dataReview.get(0).get("yourReview"));
	    desktoppageobject.selectRating(dataReview.get(0).get("Rating"));
	    logger.info("User filled review information successfully");
	    Utils.hardWait(2000);
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktoppageobject.clickOnContinueButton();
		logger.info("User clicked successfully on continue button");
		Utils.hardWait(2000);
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		String expectedText = "Thank you for your review. It has been submitted to the webmaster for approval.";
		String actualText = desktoppageobject.getSuccessMessage();
		Assert.assertEquals(expectedText, actualText);
		logger.info("User verified success message");
		Utils.takeScreenshotForStep();
		Utils.hardWait(2000);
	}
}
