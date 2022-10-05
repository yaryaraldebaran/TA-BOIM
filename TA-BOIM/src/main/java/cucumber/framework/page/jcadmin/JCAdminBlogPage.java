package cucumber.framework.page.jcadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

public class JCAdminBlogPage  extends JCAdminLoginPage{
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	public String gambar1 = "src\\main\\resources\\gambarboim\\catit.png";
	public JCAdminBlogPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		super.LoginPage("ucen1315@gmail.com", "a");
	}
	@FindBy(linkText = "Home")
	private WebElement btnHome;
	@FindBy (xpath = "//li[6]//a[1]")
	private WebElement btnBlog;
	@FindBy (linkText = "Tambah")
	private WebElement btnTambahBlog;
	@FindBy(xpath= "/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	private WebElement uploadXpathAbs;
	@FindBy(xpath="//input[@name='uploadedFile']")
	private WebElement uploadXpathRef;
	@FindBy(name="uploadedFile")
	private WebElement uploadXpathRef2;
	@FindBy(xpath ="//figure[1]//a[1]//img[1]")
	private WebElement blogPertama;
	
	@FindBy(id = "judul")
	private WebElement judulBlog;
	
	@FindBy(id = "exampleFormControlSelect9")
	private WebElement optPublish;
	public String getOptPub() {
		//"Data berhasil di tambah"
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(optPublish)).getText();
	}
	@FindBy(name = "set_top")
	private WebElement optSetTop;
	public String getOptSettop() {
		//"Data berhasil di tambah"
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(optSetTop)).getText();
	}
	
	@FindBy(xpath ="/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[5]/div[1]/textarea[1]")
	private WebElement bodyPreview;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[3]/div[1]")
	private WebElement fieldBody;
	@FindBy(xpath="//input[@name='mysubmit']")
	private WebElement btnEditSubmit;
	@FindBy(xpath = "//alert[@class='alert alert-success']")
	private WebElement alertSuccessTambah;
	public String getTxtSuccess() {
		//"Data berhasil di tambah"
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(alertSuccessTambah)).getText();
	}
	
	public void tambahBlogBaru() {
		String waktu = ""+LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute();
		this.btnBlog.click();
		this.btnTambahBlog.click();
		File newFile = new File(gambar1);
		uploadGambar(newFile);
		this.judulBlog.sendKeys("Judul blog dari cucumber "+waktu);
		this.bodyPreview.sendKeys("body preview dari cucumber "+waktu);
		zoomOut();
		Utils.delay(3, strDelay);
		this.fieldBody.click();
		Utils.delay(2, strDelay);
		isiFieldBody("ini adalah tulisan pertama blog juaracoding dari cucumber "+waktu);
		System.out.println("ini tambah baru");
	}
	public void goToBlog() {
		this.btnHome.click();
		this.btnBlog.click();
	}
	public void tekanTambahBlog() {
		this.btnTambahBlog.click();
	}
	
	/*
	 * EDIT JUDUL BLOG
	 */
	public void clickPertama() {
		this.blogPertama.click();
	}
	public void editJudul() {
		this.judulBlog.click();
		Utils.clearField();
		Utils.delay(3, strDelay);
		this.judulBlog.sendKeys("ini adalah judul blog pertama cucumber");
	}
	public void klikSimpanEditJudul() {
		this.btnEditSubmit.click();
	}
	
	/*
	 * EDIT BODY PREVIEW
	 */
	public void editBodyPreview() {
		Utils.setengahScroll("400");
		this.bodyPreview.click();
		Utils.delay(3, strDelay);
		clearField();
		Utils.delay(1, strDelay);
		this.bodyPreview.sendKeys("ini adalah body preview blog pertama cucumer");
		Utils.delay(3, strDelay);
	}
	public void klikSimpanEditBody() {
		Utils.scrollFullMouse(200);
		this.btnEditSubmit.click();
		Utils.delay(2, strDelay);
	}
	public void klikSimpanBlog() {
//		Utils.fullScroll();
		Utils.scrollFullMouse(8);
		this.btnEditSubmit.click();
		Utils.delay(2, strDelay);
	}
	/*
	 * EDIT PUBLISH 
	 */
	public void editPublish(String setPub) {
		zoomOut();
		Utils.delay(4, strDelay);
		Select selPublish = new Select(this.optPublish);
		Utils.delay(3, strDelay);
		selPublish.selectByValue("1");
//		if(setPub.equalsIgnoreCase("Active")) {
//			selPublish.selectByVisibleText("No Active");
//		}else {
//			selPublish.selectByVisibleText("Active");
//		}
		
		
	}
	public void editOptSettop(String setTopStat) {
		Select selSettop = new Select(this.optSetTop);
		Utils.delay(2, strDelay);
		if (setTopStat.equalsIgnoreCase("Yes")) {
			selSettop.selectByVisibleText("No");
		}else {
			selSettop.selectByVisibleText("Yes");
		}
		
	}
	//UTILITAS
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
	public void clickMouseUpload() {
		try {
			Robot rbtclr = new Robot();
			rbtclr.mouseMove(420, 492);
			Utils.delay(1, strDelay);
			rbtclr.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			rbtclr.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void uploadGambar(File myFile) {
		try {
			String lokasiFile = myFile.getAbsolutePath();
			System.out.println(lokasiFile);
			StringSelection strlok = new StringSelection(lokasiFile);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strlok, null);
			Robot rbtclr = new Robot();
			rbtclr.mouseMove(420, 492);
			Utils.delay(1, strDelay);
			rbtclr.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			rbtclr.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Utils.delay(1, strDelay);
			rbtclr.keyPress(KeyEvent.VK_CONTROL);
			rbtclr.keyPress(KeyEvent.VK_V);
			Utils.delay(1, strDelay);
		    // release Contol+V for pasting
			rbtclr.keyRelease(KeyEvent.VK_CONTROL);
			rbtclr.keyRelease(KeyEvent.VK_V);
			Utils.delay(1, strDelay);
		    // for pressing and releasing Enter
			rbtclr.keyPress(KeyEvent.VK_ENTER);
			rbtclr.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void zoomOut() {
		Robot rbt;
		try {
			rbt = new Robot();
			for (int i = 0; i < 5; i++) {
				rbt.keyPress(KeyEvent.VK_CONTROL);
				rbt.keyPress(KeyEvent.VK_SUBTRACT);
				rbt.keyRelease(KeyEvent.VK_SUBTRACT);
				rbt.keyRelease(KeyEvent.VK_CONTROL);
			}
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void isiFieldBody(String txtInput) {
		StringSelection stringSelection = new StringSelection(txtInput);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);

		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}