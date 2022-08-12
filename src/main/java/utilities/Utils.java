package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;
import io.cucumber.java.Scenario;

public class Utils extends Base {
	public static Scenario verify;

	public static void hoverMouseOverElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public static String getTextFromUI(WebElement element) {
		String TextFromUI = element.getText();
		return TextFromUI;

	}

	
	public static String getData(String key) {
		String testDataPath = ".\\src\\test\\resources\\input\\testData.properties";
		Properties property = null;
		try {
			FileReader reader = new FileReader(testDataPath);
			property = new Properties();
			property.load(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return property.getProperty(key);
	}

	public static void clickOnRadioButton(WebElement element) {
		try {
			if (element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
				element.click();
			} else {
				System.out.println("One of the conditions did not return expected velue");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean checkStatusOfRadioButton(WebElement element) {
		try {
			if (element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
				System.out.println("Radio button isDisplayed, isEnabled, and notSelected");
			} else {
				System.out.println("Checking status of Radio button/check box failed!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	//methods for screenshot

	public static void takeScreenShot(String screenshotName) throws IOException {
		String path = ".\\output\\screenshots\\";
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(path + screenshotName + ".png"));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("takeScreenshot: => Exception was throw during execution");
		}
		
	}
	public static void takeScreenshotForStep() {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		verify.attach(screenshot, "image/png", "Step Screenshot");
	}

	
	// JSExecutor methods start
	// if the .click() does not work, then we get the help JSExecuter
	public static void clickWithJSE(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
		// How we can give border to an element on webpage
	public static void highlightelementRedBorder(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='2px solid red'", element);
	}
	// How we can highlight an element background
	public static void highlightelementBackground(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.background='yellow'", element);
		
	}
	// What if we want to do both/above with same method?
	// give border and highlith
	public static void highlightelementBorderAndBackground(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}
	//scrolling down the page with JSE
	public static void scrolldownPage(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");
		//scrolling all the way down with JSE
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	//sendkeys with JSExecutor
	public static void sendKeys(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='" + value + "'", element);
	}
	//This method will select the value from static Dropdown by visible value
	public static void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	//This method will select value from static dropdown by index
	public static void selectByIndex(WebElement element, int index ) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	//This method will select value from static dropdown by value
	public static void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	public static void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	//This method will switch webdriver from parent window to child
	public static void switchToWindow() {
		Set<String> WindowsHandles = driver.getWindowHandles();
		Iterator <String> it = WindowsHandles.iterator();
		String window = it.next();
		driver.switchTo().window(window);
	}
	//This method will return text of element
	public static String getText(WebElement ele) {
		String ElementText = ele.getText();
		return ElementText;
	}
	//This method will drag and drop using Actions class
	public static void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(sourceElement, targetElement);
	}
	public static void hardWait(int timeUnit) {
		try {
			Thread.sleep(timeUnit);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void waitUntilElementIsClickable(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
public static void waitUntilElementIsVisibleUsingFluetWait(WebElement element) {
		
		try {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(60, TimeUnit.SECONDS)
					.pollingEvery(1, TimeUnit.SECONDS)
					.withMessage("This element was not visible after 20 seconds!");
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


