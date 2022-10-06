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
import java.time.LocalDate;
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

public class JCAdminBlogPage  extends JCAdminLoginPage
{
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminBlogPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		super.LoginPage("ucen1315@gmail.com", "a");
		
	}
	String lokasiGambar = "src/main/resources/gambarboim/catit.png"; 
	File gambar1 = new File(lokasiGambar);
	String jamMenit = Integer.toString(LocalDateTime.now().getHour())+":"+Integer.toString(LocalDateTime.now().getMinute())+":"+Integer.toString(LocalDateTime.now().getMinute());
	@FindBy(linkText = "Blog")
	private WebElement btnBlog;
	@FindBy (linkText = "Tambah")
	private WebElement btnTambah;
	@FindBy(name="uploadedFile")
	private WebElement uploadField;
	@FindBy(name = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/figure[1]/a[1]/img[1]")
	private WebElement blogPertama;
	//FIELD TAMBAH BLOG
	@FindBy(id ="judul")
	private WebElement judulBlog;
	@FindBy(id ="exampleFormControlSelect9")
	private WebElement optPublish;
	@FindBy(id ="set_top")
	private WebElement optSetHome;
	@FindBy(name ="body_preview")
	private WebElement fieldBodyPreview;
	@FindBy(xpath ="/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[3]/div[3]")
	private WebElement contentBlog;
	@FindBy(xpath ="/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")
	private WebElement btnSubmitAdd;
	
	//validator
	@FindBy(xpath="//form[@id='frmregister']/alert")
	private WebElement validatorAdd;

	public void klikTambahBlog() {
		this.btnBlog.click();
		this.btnTambah.click();
	}
	public void tambahBlogBaru(String kode,String pub,String toHome) {
	    uploadGambar(gambar1);
	    System.out.println("publish adalah "+pub+" dan to home adala "+toHome);
		this.judulBlog.click();
		clearField();
		this.judulBlog.sendKeys("Ini judul pada "+jamMenit);
		editPublish(pub);
		editOptSettop(toHome);
		this.fieldBodyPreview.click();
		clearField();
		this.fieldBodyPreview.sendKeys("ini adalah isi konten body untuk body preview "+jamMenit);
		Utils.scrollFullMouse(100);
		this.contentBlog.click();
		clearField();
		isiFieldBody("ini adalah isi content boyd untuk artikel blog pada jam "+jamMenit);
		Utils.fullScroll();	
	}
	public void klikSimpan() {
		this.btnSubmitAdd.click();
	}
	
	public void editPublish(String setPub) {
		Utils.delay(4, strDelay);
		Select selPublish = new Select(this.optPublish);
		Utils.delay(3, strDelay);
		if (setPub.contains("no")){
			selPublish.selectByValue("0");
		}else {
			selPublish.selectByValue("1");
		}
	}
	public void editOptSettop(String setTopStat) {
		Select selSettop = new Select(this.optSetHome);
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
			rbtclr.mouseMove(463, 463);
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
			System.out.println("error upload file");
		}
	}
	public static void zoomOut(int x) {
		Robot rbt;
		try {
			rbt = new Robot();
			for (int i = 0; i < x; i++) {
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
	public String getTxtAddVld(int delays) {
        return new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(validatorAdd)).getText();
    }
    public void goToBlog() {
        this.btnBlog.click();      
    }
    public void clickBlogPertama() {
        this.blogPertama.click();
    }
    public void editJudul() {
        this.judulBlog.click();
        clearField();
        Utils.delay(1, strDelay);
        this.judulBlog.sendKeys("judul hasil edit");
        this.btnSubmitAdd.click();   
    }
}