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

public class JCAdminTambahBlogImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminBlogPage JCAdminBlog; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminTambahBlogImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_BLOG);
		JCAdminBlog = new JCAdminBlogPage();
	}
	@Given("Admin login dan masuk ke halaman blog")
	public void admin_login_dan_masuk_ke_halaman_blog() {
	    JCAdminBlog.goToBlog();
	}

	@When("Admin menekan tombol tambah blog baru")
	public void admin_menekan_tombol_tambah_blog_baru() {
	    JCAdminBlog.tekanTambahBlog();
	}


	@When("Admin mengisi field blog baru")
	public void admin_mengisi_field_blog_baru() {
	    JCAdminBlog.tambahBlogBaru();
	    Utils.delay(4, strDelay);
	}

	@When("Admin memilih opsi set to home yes")
	public void admin_memilih_opsi_set_to_home_yes() {
		JCAdminBlog.klikSimpanBlog();
	}

	@Then("admin klik tombol simpan")
	public void admin_klik_tombol_simpan() {
		assertTrue(JCAdminBlog.getTxtSuccess().contains("berhasil"));
	}
	
	


}
