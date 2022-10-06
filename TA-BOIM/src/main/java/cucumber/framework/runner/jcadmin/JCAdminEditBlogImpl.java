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

public class JCAdminEditBlogImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminBlogPage JCAdminBlog; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminEditBlogImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_BLOG);
		JCAdminBlog = new JCAdminBlogPage();
	}
	/*
	 * BACKGROUND
	 */
	@Given("Admin login dan masuk ke halaman blog untuk mengedit")
	public void admin_login_dan_masuk_ke_halaman_blog_untuk_mengedit() {
//	    JCAdminBlog.goToBlog();
	}
	@When("Admin menekan tombol edit blog pertama")
	public void admin_menekan_tombol_edit_blog_pertama() {
		Utils.delay(3, strDelay);
//	    JCAdminBlog.clickPertama();
	}
	//AKHIR BACKGROUND

	@When("Admin edit judul blog")
	public void admin_edit_judul_blog() {
//	    JCAdminBlog.editJudul();
	}

	@When("Admin klik simpan edit judul blog baru")
	public void admin_klik_simpan_edit_judul_blog_baru() {
//	    JCAdminBlog.klikSimpanEditJudul();
	}

	@Then("admin mengedit judul blog baru")
	public void admin_mengedit_judul_blog_baru() {
	    System.out.println("ini then edit judul");
	}
	//AKHIR EDIT JUDUL
	
	
	/*******************
	 * EDIT BODY PREVIEW
	 * *****************
	 */
	@When("Admin edit body preview blog")
	public void admin_edit_body_preview_blog() {
		System.out.println("ini dari edit body");
//	    JCAdminBlog.editBodyPreview();
	}

	@And("Admin klik simpan edit body preview blog baru")
	public void admin_klik_simpan_edit_body_preview_blog_baru() {
//		Utils.fullScroll();
//	    JCAdminBlog.klikSimpanEditBody();
	}

	@Then("admin telah mengedit body preview blog baru")
	public void admin_telah_mengedit_body_preview_blog_baru() {
	    System.out.println("ini dari then edit body preview");
	}

	/*
	 * EDIT PUBLISH BLOG
	 */
	@When("Admin edit PUBLISHOPT artikel blog")
	public void admin_edit_publishopt_artikel_blog() {
//		System.out.println(JCAdminBlog.getOptPub());
//	    JCAdminBlog.editPublish(JCAdminBlog.getOptPub());
	}

	@When("Admin klik simpan edit publishopt blog pertama")
	public void admin_klik_simpan_edit_publishopt_blog_pertama() {
//		JCAdminBlog.klikSimpanEditBody();
	}

	@Then("admin telah mengedit publishopt pada artikel blog baru")
	public void admin_telah_mengedit_publishopt_artikel_blog_baru() {
	    System.out.println("test then");
	}
}
