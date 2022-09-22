package cucumber.framework.page.nopc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.framework.connection.DriverSingleton;

public class DashboardPage {

	private WebDriver driver;
	
	public DashboardPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[normalize-space()='Dashboard']")
	private WebElement menuDashboard;
	
	@FindBy(xpath = "//h1[normalize-space()='Dashboard']")
	private WebElement txtDashboardPage;
	
	public void goToMenuDashboard() {
		menuDashboard.click();
	}
	
	public String getTxtDashboardPage() {
		return txtDashboardPage.getText();
	}
	
}
