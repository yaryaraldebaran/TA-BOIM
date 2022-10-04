package cucumber.framework.page.jcadmin;

import java.time.Duration;

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

public class JCAdminBenefitPage extends JCAdminLoginPage {
	
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;

	public JCAdminBenefitPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		super.LoginPage("ucen1315@gmail.com", "a");
	}
	@FindBy(xpath ="/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]")
	private WebElement btnBenefitPertama;
	@FindBy(xpath ="//a[normalize-space()='Benefit']")
	private WebElement btnBenefit;
	@FindBy(linkText = "Home")
	private WebElement btnHome;
	@FindBy(linkText = "Tambah")
	private WebElement btnTambahBenefit;
	@FindBy(xpath ="//input[@id='judul_1']")
	private WebElement judul1;
	@FindBy(xpath ="//input[@id='judul_2']")
	private WebElement judul2;
	@FindBy(xpath ="//input[@id='judul_3']")
	private WebElement judul3;
	@FindBy(xpath ="//input[@id='judul_4']")
	private WebElement judul4;
	@FindBy(xpath = "//textarea[@name='deskripsi_1']")
	private WebElement deskripsi1;
	@FindBy(xpath = "//textarea[@name='deskripsi_2']")
	private WebElement deskripsi2;
	@FindBy(xpath = "//textarea[@name='deskripsi_3']")
	private WebElement deskripsi3;
	@FindBy(xpath = "//textarea[@name='deskripsi_4']")
	private WebElement deskripsi4;
	@FindBy(id ="exampleFormControlSelect9")
	private WebElement optPublish;
	@FindBy(xpath = "//input[@name='mysubmit']")
	private WebElement submitBenefit;
	@FindBy(xpath ="/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")
	private WebElement submitEditBenefit;
	//FIELD TAMBAH BENEFIT
	
	
	public void lihatBenefit() {
		this.btnHome.click();
		this.btnBenefit.click();
	}
	public void klikTambahBenefit() {
		this.btnTambahBenefit.click();
	}
	public void tambahBenefit() {
		this.judul1.sendKeys("Ini benefit pertama cucumber");
		this.deskripsi1.sendKeys("ini adalah deskripsi pertama dari cucumber untuk benefit 1");
		this.judul2.sendKeys("Ini benefit kedua cucumber");
		this.deskripsi2.sendKeys("ini adalah deskripsi kedua dari cucumber untuk benefit 2");
		this.judul3.sendKeys("Ini benefit ketiga cucumber");
		this.deskripsi3.sendKeys("ini adalah deskripsi ketiga dari cucumber untuk benefit 3");
		this.judul4.sendKeys("Ini benefit keempat cucumber");
		this.deskripsi4.sendKeys("ini adalah deskripsi ketiga dari cucumber untuk benefit 4");
		Select selPublish = new Select(this.optPublish);
		Utils.delay(2, strDelay);
		selPublish.selectByVisibleText("Active");
		Utils.fullScroll();
	}
	public void klikSimpanBenefit() {
		this.submitBenefit.click();
	}
	public void klikBenefitPertama() {
		this.btnBenefitPertama.click();
	}
	public void editJudul1BenefitPertama() {
		this.judul1.click();
		Utils.clearField();
		this.judul1.sendKeys("Judul 1 revisi");
	}
	public void editDeskripsi1BenefitPertama() {
		this.deskripsi1.click();
		Utils.clearField();
		this.judul1.sendKeys("ini adalah deskripsi 1 hasil perubahan cucumber");
	}
	public void klikSimpanEditBenefit() {
		Utils.scrollFullMouse(100);
		this.submitEditBenefit.click();
		Utils.delay(3, strDelay);
	}
	
}
