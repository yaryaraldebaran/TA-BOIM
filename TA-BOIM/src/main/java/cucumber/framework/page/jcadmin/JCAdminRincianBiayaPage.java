package cucumber.framework.page.jcadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Locale;

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
	@FindBy(xpath ="//select[@name='st']")
	private WebElement optLihat;
	//form tambah biaya
	@FindBy(id = "nama")
	private WebElement nama;
	@FindBy(id = "harga")
	private WebElement harga;
	@FindBy(id = "diskonid")
	private WebElement diskon;
	@FindBy(name = "keunggulan1")
	private WebElement keunggulan1;
	@FindBy(xpath = "//input[@name='keunggulan2']")
	private WebElement keunggulan2;
	@FindBy(xpath = "//input[@name='keunggulan3']")
	private WebElement keunggulan3;
	@FindBy(xpath = "//input[@name='keunggulan4']")
	private WebElement keunggulan4;
	@FindBy(xpath = "//input[@name='keunggulan5']")
	private WebElement keunggulan5;
	@FindBy(id ="exampleFormControlSelect9")
	private WebElement optPublish;
	@FindBy(xpath ="//input[@name='mysubmit']")
	private WebElement btnSubmitAdd;
	@FindBy(xpath ="//tbody/tr[1]/td[11]/a[1]/i[1]")
	private WebElement editPertama;
	
	//edit form elemen
	@FindBy(xpath ="//input[@name='mysubmit']")
	private WebElement btnSubmitEdit;
	String namaTambah = "Testing dari cucumber"+tanggalBulan;
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
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	private WebElement vldEditHarga;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")
	private WebElement vldEditDiskon;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]")
	private WebElement vldEditKeunggulan1;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]")
	private WebElement vldEditKeunggulan2;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]")
	private WebElement vldEditKeunggulan3;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]")
	private WebElement vldEditKeunggulan4;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[9]")
	private WebElement vldEditKeunggulan5;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	private WebElement hargaN1;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	private WebElement hargaN2;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]")
	private WebElement hargaN3;
	////////////////////////////
	@FindBy(xpath="")
	private WebElement nama1;
	@FindBy(xpath="")
	private WebElement nama2;
	@FindBy(xpath="")
	private WebElement nama3;
////////////////////////////
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
	private WebElement hargaD1;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]")
	private WebElement hargaD2;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]")
	private WebElement hargaD3;
////////////////////////////
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")
	private WebElement diskon1;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]")
	private WebElement diskon2;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]")
	private WebElement diskon3;
	public void goToHome() {
		this.btnHome.click();
	}
	public void goToRincianBiaya() {
		this.btnRincianBiaya.click();
	}
	//MELIHAT DATA BERDASARKAN NAMA PROGRAM
	public void lihatNamaProgram() {
		Select selLihat = new Select(this.optLihat);
		selLihat.selectByVisibleText("Nama Program");
	}
	//MELIHAT DATA BERDASARKAN HARGA NORMAL
	public void lihatHargaNormal() {
		Select selLihat = new Select(this.optLihat);
		selLihat.selectByVisibleText("Harga-Normal");
	}
	
	
	
	public void lihatDiskon() {
		Select selLihat = new Select(this.optLihat);
		selLihat.selectByVisibleText("Diskon %");
	}
	public void lihatHargaDiskon() {
		Select selLihat = new Select(this.optLihat);
		selLihat.selectByVisibleText("Harga-Diskon");
	}
	
	
	//MENAMBAH DATA 
	public void tambahDataRincianBiayaPublish(String status) {
		this.nama.sendKeys(namaTambah+" "+status);
		this.harga.sendKeys("200000");
		this.diskon.sendKeys("20");
		this.keunggulan1.sendKeys("bisa sampai mahir");
		this.keunggulan2.sendKeys("keunggulan keempat");
		this.keunggulan3.sendKeys("keunggulan ketiga");
		this.keunggulan4.sendKeys("keunggulan");
		Select selPublish = new Select(this.optPublish);
		selPublish.selectByVisibleText(status);
		Utils.delay(2, strDelay);
		Utils.fullScroll();
	}

	
	
	
	
	// MENGEDIT DATA
	public void editNamaProgram(String namaProgram) {
		
		this.nama.click();
		Utils.delay(3, strDelay);
		clearField();
		Utils.delay(3, strDelay);
		this.nama.sendKeys(namaProgram);
		Utils.fullScroll();
	}
	public void editHargaAwal(String hargaAwal) {
		this.harga.click();
		Utils.delay(2, strDelay);
		clearField();
		this.harga.sendKeys(hargaAwal);
		Utils.delay(3, strDelay);
		Utils.fullScroll();
	}
	public void editDiskon(String diskonBaru) {
		this.diskon.click();
		Utils.delay(2, strDelay);
		clearField();
		this.diskon.sendKeys(diskonBaru);
		Utils.delay(3, strDelay);
		Utils.fullScroll();
	}
	public void editKeunggulan1(String keunggulan1Baru) {
		this.keunggulan1.click();
		Utils.delay(2, strDelay);
		clearField();
		this.keunggulan1.sendKeys(keunggulan1Baru);
		Utils.delay(3, strDelay);
		Utils.fullScroll();
	}
	public void editKeunggulan2(String keunggulan2Baru) {
		Utils.fullScroll();
		this.keunggulan2.click();
		Utils.delay(2, strDelay);
		clearField();
		this.keunggulan2.sendKeys(keunggulan2Baru);
		Utils.delay(3, strDelay);
		Utils.fullScroll();
	}
	public void editKeunggulan3(String keunggulan3Baru) {
		Utils.fullScroll();
		this.keunggulan3.click();
		Utils.delay(2, strDelay);
		clearField();
		this.keunggulan3.sendKeys(keunggulan3Baru);
		Utils.delay(3, strDelay);
		Utils.fullScroll();
	}
	public void editKeunggulan4(String keunggulan4Baru) {
		Utils.fullScroll();
		this.keunggulan4.click();
		Utils.delay(2, strDelay);
		clearField();
		this.keunggulan4.sendKeys(keunggulan4Baru);
		Utils.delay(3, strDelay);
		Utils.fullScroll();
	}
	public void editKeunggulan5(String keunggulan5Baru) {
		Utils.fullScroll();
		this.keunggulan5.click();
		Utils.delay(2, strDelay);
		clearField();
		this.keunggulan5.sendKeys(keunggulan5Baru);
		Utils.delay(3, strDelay);
		Utils.fullScroll();
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
	
	
	//VALIDATOR EDIT
	public String getEditNameSuccess() {
		//"Data berhasil di tambah"
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(vldEditNama)).getText();
	}
	public String getEditHargaSuccess() {
		//HARGA BERHASIL DIEDIT
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(vldEditHarga)).getText();
	}
	public String getEditDiskonSuccess() {
		//DISKON BERHASIL DIEDIT
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(vldEditDiskon)).getText();
	}

	public String getEditKeunggulan1Success() {
		//KEUNGGULAN1 BERHASIL DIEDIT
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(vldEditKeunggulan1)).getText();
	}
	public String getEditKeunggulan2Success() {
		//KEUNGGULAN1 BERHASIL DIEDIT
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(vldEditKeunggulan2)).getText();
	}
	public String getEditKeunggulan3Success() {
		//KEUNGGULAN1 BERHASIL DIEDIT
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(vldEditKeunggulan3)).getText();
	}
	public String getEditKeunggulan4Success() {
		//KEUNGGULAN1 BERHASIL DIEDIT
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(vldEditKeunggulan4)).getText();
	}
	public String getEditKeunggulan5Success() {
		//KEUNGGULAN1 BERHASIL DIEDIT
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(vldEditKeunggulan5)).getText();
	}
	public Boolean compEditNama(String namaBaru) {
		return getEditNameSuccess().contains(namaBaru);
	}
	public Boolean compEditHarga(String hargaBaru) {
		Utils.delay(3, hargaBaru);
		System.out.println("ini dari compEditHarga  "+formatRupiahStr(hargaBaru));
		String hargaBaruStr = formatRupiahStr(hargaBaru);
		return getEditHargaSuccess().contains(hargaBaruStr);
	}
	public Boolean compEditDiskon(String diskonBaru) {
		return getEditDiskonSuccess().contains(diskonBaru);
	}
	public Boolean compEditKeunggulan1(String keunggulan1Baru) {
		return getEditKeunggulan1Success().contains(keunggulan1Baru);
	}
	public boolean compEditKeunggulan2(String keunggulan2Baru) {
		return getEditKeunggulan2Success().contains(keunggulan2Baru);
	}
	public boolean compEditKeunggulan3(String keunggulan3Baru) {
		return getEditKeunggulan3Success().contains(keunggulan3Baru);
	}
	public boolean compEditKeunggulan4(String keunggulan4Baru) {
		return getEditKeunggulan4Success().contains(keunggulan4Baru);
	}
	public boolean compEditKeunggulan5(String keunggulan5Baru) {
		return getEditKeunggulan5Success().contains(keunggulan5Baru);
	}
	
	//VALIDATOR LIHAT
	public String getHarga1() {
		//"Data berhasil di tambah"
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(hargaN1)).getText();
	}
	public String getHarga2() {
		//"Data berhasil di tambah"
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(hargaN2)).getText();
	}
	public String getHarga3() {
		//"Data berhasil di tambah"
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(hargaN3)).getText();
	}
	public String getDiskon1() {
		//"Data berhasil di tambah"
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(diskon1)).getText();
	}
	public String getDiskon2() {
		//"Data berhasil di tambah"
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(diskon2)).getText();
	}
	public String getDiskon3() {
		//"Data berhasil di tambah"
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(diskon3)).getText();
	}
	public String getHargaDiskon1() {
		//"Data berhasil di tambah"
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(hargaD1)).getText();
	}
	public String getHargaDiskon2() {
		//"Data berhasil di tambah"
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(hargaD2)).getText();
	}
	public String getHargaDiskon3() {
		//"Data berhasil di tambah"
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(hargaD3)).getText();
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
	public String formatRupiahStr(String intToStr) {
		Integer num = Integer.parseInt(intToStr);
	    NumberFormat idFormatter = NumberFormat.getInstance(new Locale("id", "ID"));
	    String numStr=idFormatter.format(num);
		return numStr;
	}





}
