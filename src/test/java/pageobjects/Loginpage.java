package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Loginpage {

	public WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}

	By loginPageHeading = By.xpath("//p[text()='WIM Login']");
	By userName = By.id("userName");
	By passWord = By.id("password");
	By loginButton = By.cssSelector("button[type='submit']");
	By homepageText=By.xpath("//a[text()='Avery WIM']");

	public void ensureLoginpage() {
		boolean loginPageText = driver.findElement(loginPageHeading).isDisplayed();
		Assert.assertTrue(loginPageText, "Login page is not loaded");
	}

	public void enterUsername(String username) {
		driver.findElement(userName).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passWord).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}

	public void ensureHomepage() {
		Assert.assertTrue(driver.findElement(homepageText).isDisplayed(), "Login is unsuccessfull");
	}

}
