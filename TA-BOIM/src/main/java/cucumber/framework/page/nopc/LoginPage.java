package cucumber.framework.page.nopc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.framework.connection.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='Email']")
	//input[contains(@attr, 'value')]
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//li[normalize-space()='No customer account found']")
	private WebElement msgError;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement valLogin;
	
	//scenario
	public void login(String username, String password) {
		this.username.clear();
		this.username.sendKeys(username);
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
	}
	
	//Actual
	public String msgInvalid() {
		return msgError.getText();
	}
	
	public String getTxtEmpInfo() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		return valLogin.getText();
	}
	
}
