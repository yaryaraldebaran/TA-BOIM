package cucumber.framework.page.jcadmin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;

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
	
	
	public void tambahDataRincianBiaya() {
		
		this.btnRincianBiaya.click();
		this.btnTambahRincianBiaya.click();
		this.nama.sendKeys("Pemrograman bahasa sunda");
		this.harga.sendKeys("200000");
		this.diskon.sendKeys("20");
		this.keunggulan1.sendKeys("bisa sampai mahir");
	}
//	driver.get("https://dev.ptdika.com/web_jc_v2/index.php/admin");
//    driver.findElement(By.linkText("Home")).click();
//    driver.findElement(By.linkText("Rincian Biaya")).click();
//    driver.findElement(By.linkText("Tambah")).click();
//    driver.findElement(By.id("nama")).click();
//    driver.findElement(By.id("nama")).clear();
//    driver.findElement(By.id("nama")).sendKeys("Pemrograman Bahasa Lingua Franca");
//    driver.findElement(By.id("harga")).click();
//    driver.findElement(By.id("harga")).clear();
//    driver.findElement(By.id("harga")).sendKeys("500000");
//    driver.findElement(By.id("diskonid")).click();
//    driver.findElement(By.id("diskonid")).clear();
//    driver.findElement(By.id("diskonid")).sendKeys("19");
//    driver.findElement(By.id("diskonid")).clear();
//    driver.findElement(By.id("diskonid")).sendKeys("18");
//    driver.findElement(By.name("keunggulan1")).click();
//    driver.findElement(By.name("keunggulan1")).clear();
//    driver.findElement(By.name("keunggulan1")).sendKeys("Bisa Sampai Mahir");
//    driver.findElement(By.id("exampleFormControlSelect9")).click();
//    new Select(driver.findElement(By.id("exampleFormControlSelect9"))).selectByVisibleText("InActive");
//    driver.findElement(By.xpath("//option[@value='0']")).click();
//    driver.findElement(By.name("mysubmit")).click();
//    driver.findElement(By.xpath("//form[@id='frmregister']/alert")).click();
	
	
}
