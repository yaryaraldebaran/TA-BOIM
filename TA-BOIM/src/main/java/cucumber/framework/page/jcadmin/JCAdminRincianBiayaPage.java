package cucumber.framework.page.jcadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

public class JCAdminRincianBiayaPage extends JCAdminLoginPage {
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;

	public JCAdminRincianBiayaPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		super.LoginPage("ucen1315@gmail.com", "a");
	}
	@FindBy(linkText = "Home")
	private WebElement btnHome;
	@FindBy(linkText = "Rincian Biaya")
	private WebElement btnRincianBiaya;
	@FindBy(linkText = "Tambah")
	private WebElement btnTambahRincianBiaya;
	
	//form tambah biaya
	@FindBy(id = "nama")
	private WebElement nama;
	@FindBy(id = "harga")
	private WebElement harga;
	@FindBy(id = "diskonid")
	private WebElement diskon;
	@FindBy(name = "keunggulan1")
	private WebElement keunggulan1;
	@FindBy(name = "keunggulan2")
	private WebElement keunggulan2;
	@FindBy(name = "keunggulan3")
	private WebElement keunggulan3;
	@FindBy(name = "keunggulan4")
	private WebElement keunggulan4;
	@FindBy(id ="exampleFormControlSelect9")
	private WebElement optPublish;
	@FindBy(name ="mysubmit")
	private WebElement btnSubmit;
	
	//validator data tambah
	@FindBy(xpath = "//alert[@class='alert alert-success']")
	private WebElement alertSuccessTambah;
	
	public void goToHome() {
		this.btnHome.click();
	}
	public void goToRincianBiaya() {
		this.btnRincianBiaya.click();
	}
	public void tambahDataRincianBiayaPublish(String status) {

		this.nama.sendKeys("Pemrograman Testing dari cucumber"+status);
		this.harga.sendKeys("200000");
		this.diskon.sendKeys("20");
		this.keunggulan1.sendKeys("bisa sampai mahir");
		this.keunggulan2.sendKeys("keunggulan keempat");
		this.keunggulan3.sendKeys("keunggulan ketiga");
		this.keunggulan4.sendKeys("keunggulan");
		Select selColor = new Select(this.optPublish);
		selColor.selectByVisibleText(status);
		
	}
	public void userTambahDataValid() {
		
		
	}
	public void goToTambahRB() {
		this.btnTambahRincianBiaya.click();
	}
	public void clickSimpan() {
		//scroll + click simpan
		Utils.delay(2, strDelay);
		try {
			Robot rbt = new Robot();
			rbt.keyPress(KeyEvent.VK_TAB);
			rbt.keyRelease(KeyEvent.VK_TAB);
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.delay(4, strDelay);
	}
	public String getTxtSuccess() {
		//"Data berhasil di tambah"
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(alertSuccessTambah)).getText();
	}
		
}
