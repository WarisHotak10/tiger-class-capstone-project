package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class LaptopNoteBooksPageObject extends Base {
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

//	first scenario
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooksLink;
	@FindBy(xpath = "//div[@class='dropdown-menu']//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooksLink;
	@FindBy(xpath = "//h4//a[text()='MacBook']")
	private WebElement macBookItem;
//	@FindBy(xpath = "//div[@id='cart']//button[@type='button']")
//	private WebElement addToCartButton;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartItem;
	@FindBy(xpath = "//div[@id='cart']//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement cartOption;
	@FindBy(xpath = "//tr//td//button[@title='Remove']")
	private WebElement redXbutton;
	@FindBy(xpath = "//button//span[@id='cart-total']")
	private WebElement zeroItem;
	// second scenario
	@FindBy(xpath = "(//button[@type='button'])[15]")
	private WebElement macbookProductCompare;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement productComparisonOnMacBook;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement productComparisonOnMacBookAir;
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement productComparisonLink;
	@FindBy(xpath = "//table[@class='table table-bordered']")
	private WebElement productComparisonChart;
	// third Scenario
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement heartIconOnSonyVaioLaptop;
	@FindBy(xpath = "(//div[@class='alert alert-success alert-dismissible'])/text()[1]")
	private WebElement youMust;
	@FindBy(xpath = "//a[text()='login']")
	private WebElement loginInTheMessage;
	@FindBy(xpath = "(//div[@class='alert alert-success alert-dismissible'])/text()[2]")
	private WebElement or;
	@FindBy(xpath = "//a[text()='create an account']")
	private WebElement createAnAccountInTheMessage;
	@FindBy(xpath = "(//div[@class='alert alert-success alert-dismissible'])/text()[3]")
	private WebElement toSave;
	@FindBy(xpath = "(//a[text()='Sony VAIO'])[1]")
	private WebElement SonyVAIOInTheMessage;
	@FindBy(xpath = "(//div[@class='alert alert-success alert-dismissible'])/text()[4]")
	private WebElement toYour;
	@FindBy(xpath = "(//a[text()='wish list'])[1]")
	private WebElement wishListInTheMessage;
	@FindBy(xpath = "(//div[@class='alert alert-success alert-dismissible'])/text()[5]")
	private WebElement exclamationMark;

	public void clickOnLaptopsAndNotebooksLink() {
		Utils.clickWithJSE(laptopsAndNotebooksLink);
	}

	public void clickOnShowAllLaptopsAndNotebooksLink() {
		Utils.clickWithJSE(showAllLaptopsAndNotebooksLink);
	}

	public void clickOnMacBookItem() {
		Utils.clickWithJSE(macBookItem);
	}	 

	public boolean isOneItemShowedToTheCart() {
		if (cartItem.isDisplayed()) {
			return true;

		} else {
			return false;
		}

	}

	public void clickOnCartOption() {
		Utils.clickWithJSE(cartOption);
	}

	public void clickOnRedXbutton() {
		Utils.clickWithJSE(redXbutton);
	}

	public boolean isZeroItemInTheCart() {
		if (zeroItem.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnProductComparisonOnMacBook() {
		productComparisonOnMacBook.click();
	}

	public void clickOnProductComparisonOnMacBookAir() {
		productComparisonOnMacBookAir.click();
	}

	public void clickOnProductComparisonLink() {
		productComparisonLink.click();
	}

	public boolean isUserSeesProductComparisonChart() {
		if (productComparisonChart.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnHeartIconOnSonyVaioLaptop() {
		heartIconOnSonyVaioLaptop.click();
	}

	public String getLoginOrCreatAccountMessage() {
		String actualResult = "You must " + loginInTheMessage.getText() + " or " + createAnAccountInTheMessage.getText()
				+ " to save " + SonyVAIOInTheMessage.getText() + " to your " + wishListInTheMessage.getText() + "!";
		return actualResult;
	}

	@FindBy(xpath = "//h4//a[text()='MacBook Pro']")
	private WebElement macBookProItem;
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement priceTag;

	public void clickOnmacBookProItem() {
		macBookProItem.click();
	}

	public String getPriceTag() {
		String actualPrice = priceTag.getText();
		return actualPrice;
	}
}
