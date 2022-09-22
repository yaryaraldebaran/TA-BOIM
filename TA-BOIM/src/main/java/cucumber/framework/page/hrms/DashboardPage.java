package cucumber.framework.page.hrms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

public class DashboardPage {

	private String strDelay = Constants.GLOB_PARAM_DELAY;
	
	private WebDriver driver;
	
	public DashboardPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[normalize-space()='Dashboard']")
	private WebElement menuDashboard;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/h4")
	private WebElement txtDashboardPage;
	
	public void goToMenuDashboard() {
		menuDashboard.click();
		Utils.delay(10, strDelay);
	}
	
	public String getTxtDashboardPage() {
		return txtDashboardPage.getText();
	}
}