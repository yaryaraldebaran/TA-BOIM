package cucumber.framework.page.jcadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
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

public class JCAdminBenefitPage extends JCAdminLoginPage 
{
	
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	JavascriptExecutor js;
	public JCAdminBenefitPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver; 
		super.LoginPage("ucen1315@gmail.com", "a");
	}
	@FindBy(xpath ="//tbody/tr[1]/td[10]/a[1]/i[1]")
	private WebElement btnBenefitPertama;
	@FindBy(xpath ="/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/nav[1]/div[2]/ul[1]/div[1]/div[2]/div[1]/div[1]/div[1]/li[4]/ul[1]/li[3]/a[1]")
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
	@FindBy(xpath ="//input[@name='mysubmit']")
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
		Utils.fullScroll();
		this.submitBenefit.click();
	}
	public void klikBenefitPertama() {
		System.out.println("ini dari klik data pertama");
//		this.btnBenefitPertama.click();
//		js.executeScript("document.getElementByXpath('/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]/i[1]').click();");
		try {
			Robot rbt = new Robot();
			rbt.mouseMove(1473, 430);
			rbt.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			rbt.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void editJudul(String jud, String isiJud) {
		if (jud.equals("judul1")) {
			System.out.println("isi judul adalah "+isiJud);
		}else if (jud.equals("judul2")) {
			
		}else if (jud.equals("judul3")) {
			System.out.println("isi judul adalah "+isiJud);
		}else if (jud.equals("judul4")) {
			
		}
	}
	public void editJudul1BenefitPertama(String isJud) {
		this.judul1.click();
		Utils.clearField();
		Utils.delay(2, strDelay);
		this.judul1.sendKeys(isJud);
		Utils.delay(2, strDelay);
	}
	public void editJudul2BenefitPertama(String isJud) {
		Utils.zoomOut(4);
		this.judul2.click();
		Utils.clearField();
		Utils.delay(2, strDelay);
		this.judul2.sendKeys(isJud);
		Utils.delay(2, strDelay);
	}
	public void editJudul3BenefitPertama(String isJud) {
		this.judul3.click();
		Utils.clearField();
		Utils.delay(2, strDelay);
		this.judul3.sendKeys(isJud);
		Utils.delay(2, strDelay);
	}
	public void editJudul4BenefitPertama(String isJud) {
		this.judul4.click();
		Utils.clearField();
		Utils.delay(2, strDelay);
		this.judul4.sendKeys(isJud);
		Utils.delay(2, strDelay);
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
