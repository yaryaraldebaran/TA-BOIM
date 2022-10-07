package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminBlogPage;
import cucumber.framework.page.jcadmin.JCAdminRincianBiayaPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminBlogEditImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminBlogPage JCAdminBlog; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminBlogEditImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminBlog = new JCAdminBlogPage();
	}
	/*
	 * BACKGROUND
	 */
	@Given("Admin login dan masuk ke halaman blog untuk mengedit")
	public void admin_login_dan_masuk_ke_halaman_blog_untuk_mengedit() {
	    JCAdminBlog.goToBlog();
	}
	@When("Admin menekan tombol edit blog pertama")
	public void admin_menekan_tombol_edit_blog_pertama() {
		Utils.delay(2, strDelay);
	    JCAdminBlog.clickBlogPertama();
	}
	//AKHIR BACKGROUND
	@When("^(.*) Admin edit (.*) menjadi (.*), (.*), (.*), (.*), blog$")
	public void editBlog(String kode,String nama, String publish,
	        String setHome, String conPrev, String content) {
//	    System.out.println(publish.isEmpty());
	    System.out.println("publish blank? "+publish.isBlank()+" dengan "+publish);
	    System.out.println("opt Home blank? "+setHome.isBlank()+" dengan "+setHome);
	    System.out.println("conprev blank? "+conPrev.isBlank()+" dengan "+conPrev);
	    
	    if(!publish.isBlank()) {
	        JCAdminBlog.editPublish(publish);
	    }else if (!setHome.isBlank()) {
	        JCAdminBlog.editOptSettop(setHome);
	    }else if (!conPrev.isBlank()) {
	        JCAdminBlog.editConPrev(conPrev);
	    }else if(!content.isBlank()) {
	        JCAdminBlog.editContent(content);
	    }
	    Utils.delay(3, strDelay);
	}
	@When("^(.*) Admin klik simpan edit pada blog$")
	public void adminKlikSimpanEdit(String kode) {
	    Utils.delay(2, strDelay);
	    JCAdminBlog.klikSimpan();
	    Utils.delay(5, strDelay);
	}
	@Then("^(.*) Admin telah mengedit$")
	public void admin_telah_mengedit(String kode) {
	    System.out.println("admin telah mengedit");
	}
}
