package cucumber.framework.page.jcadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalDate;

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
	//tanggal untuk record trail
	String tanggalBulan = Integer.toString(LocalDate.now().getDayOfMonth())+"_"+Integer.toString(LocalDate.now().getMonthValue());
	
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
	@FindBy(xpath ="//input[@name='mysubmit']")
	private WebElement btnSubmitAdd;
	@FindBy(xpath ="//tbody/tr[1]/td[11]/a[1]/i[1]")
	private WebElement editPertama;
	
	//edit form elemen
	@FindBy(xpath ="//input[@name='mysubmit']")
	private WebElement btnSubmitEdit;
	String namaBaru = "Testing dari cucumber"+tanggalBulan;
	//validator data tambah
	//pake webdriverwait
	@FindBy(xpath = "//alert[@class='alert alert-success']")
	private WebElement alertSuccessTambah;
	//tanya pak paul
	@FindBy(xpath = "")
	private WebElement publishBefore;
	@FindBy(xpath = "")
	private WebElement publishAfter;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]")
	private WebElement vldEditNama;
	@FindBy(xpath="//td[normalize-space()='Pemrograman cucumber']")
	private WebElement vldEditHarga;
	@FindBy(xpath="//alert[@class='alert alert-success']")
	private WebElement vldEditDiskon;
	@FindBy(xpath="//alert[@class='alert alert-success']")
	private WebElement vldEditKeunggulan1;
	
	public void goToHome() {
		this.btnHome.click();
	}
	public void goToRincianBiaya() {
		this.btnRincianBiaya.click();
	}
	//MENAMBAH DATA 
	public void tambahDataRincianBiayaPublish(String status) {
		
		this.nama.sendKeys(namaBaru+" "+status);
		this.harga.sendKeys("200000");
		this.diskon.sendKeys("20");
		this.keunggulan1.sendKeys("bisa sampai mahir");
		this.keunggulan2.sendKeys("keunggulan keempat");
		this.keunggulan3.sendKeys("keunggulan ketiga");
		this.keunggulan4.sendKeys("keunggulan");
		Select selPublish = new Select(this.optPublish);
		selPublish.selectByVisibleText(status);
		Utils.delay(2, strDelay);
		Utils.fullScroll(this.driver);
	}

	
	
	
	
	// MENGEDIT DATA
	public void editNamaProgram(String namaProgram) {
		
		this.nama.click();
		Utils.delay(3, strDelay);
		clearField();
		Utils.delay(3, strDelay);
		this.nama.sendKeys(namaProgram);
		Utils.fullScroll(driver);
	}
	public void editHargaAwal(String hargaAwal) {
		this.harga.click();
		Utils.delay(2, strDelay);
		clearField();
		this.harga.sendKeys(hargaAwal);
		Utils.delay(3, strDelay);
		Utils.fullScroll(driver);
	}
	public void editDiskon(String diskonBaru) {
		this.diskon.click();
		Utils.delay(2, strDelay);
		clearField();
		this.diskon.sendKeys(diskonBaru);
		Utils.delay(3, strDelay);
		Utils.fullScroll(this.driver);
	}
	public void editKeunggulan1(String keunggulan1Baru) {
		this.keunggulan1.click();
		Utils.delay(2, strDelay);
		clearField();
		this.keunggulan1.sendKeys(keunggulan1Baru);
		Utils.delay(3, strDelay);
		Utils.fullScroll(this.driver);
	}
	public void editClickDataPertama() {
		this.editPertama.click();
	}
	
	public void goToTambahRB() {
		this.btnTambahRincianBiaya.click();
	}
	public String getTxtSuccess() {
		//"Data berhasil di tambah"
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(alertSuccessTambah)).getText();
	}
	public String getEditNameSuccess() {
		//"Data berhasil di tambah"
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(vldEditNama)).getText();
	}
	public Boolean compEditNama() {
		//ambil output
		//compare output dengan nama baru
		return getEditNameSuccess().contains("baru");
	}
	
	//UTILITAS
	public void simpanTambah() {
		Utils.delay(2, strDelay);
		this.btnSubmitAdd.click();
	}
	public void simpanEdit() {
		Utils.delay(1, strDelay);
		this.btnSubmitEdit.click();
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
	public String driverWaitTxt(WebDriver driver, int delays, WebElement element) {
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(element)).getText();
	}
	public void clearField() {
		try {
			Robot rbtclr = new Robot();
			rbtclr.keyPress(KeyEvent.VK_CONTROL);
			rbtclr.keyPress(KeyEvent.VK_A);
			rbtclr.keyRelease(KeyEvent.VK_CONTROL);
			rbtclr.keyRelease(KeyEvent.VK_A);
			rbtclr.keyPress(KeyEvent.VK_BACK_SPACE);
			rbtclr.keyRelease(KeyEvent.VK_BACK_SPACE);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
