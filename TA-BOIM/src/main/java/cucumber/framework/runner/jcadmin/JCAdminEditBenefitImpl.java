package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminBenefitPage;
import cucumber.framework.page.jcadmin.JCAdminBlogPage;
import cucumber.framework.page.jcadmin.JCAdminRincianBiayaPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCAdminEditBenefitImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminBenefitPage JCAdminBnft; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCAdminEditBenefitImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_BLOG);
		JCAdminBnft = new JCAdminBenefitPage ();
	}
	/*
	 * BACKGROUND
	 */
	@Given("Admin login dan masuk ke halaman benefit untuk mengedit benefit")
	public void admin_login_dan_masuk_ke_halaman_benefit_untuk_mengedit_benefit() {
		JCAdminBnft.lihatBenefit();
	}

	@When("Admin menekan tombol edit data benefit pertama")
	public void admin_menekan_tombol_edit_benefit_pertama() {
	    JCAdminBnft.klikBenefitPertama();
	}
	//AKHIR BACKGROUND
	
	/*
	 * EDIT JUDUL 1 BENEFIT
	 */
	@When("Admin mengedit judul1 benefit")
	public void admin_mengedit_benefit() {
	    JCAdminBnft.editJudul1BenefitPertama();
	}

	@When("Admin klik simpan edit judul1 benefit")
	public void admin_klik_simpan_edit_benefit() {
	    JCAdminBnft.klikSimpanEditBenefit();
	}

	@Then("Admin telah mengedit judul1 benefit")
	public void admin_telah_mengedit_benefit() {
	    System.out.println("ini adalah then");
	}
	//AKHIR JUDUL 1 BENEFIT
	
	
	@When("Admin mengedit deskripsi1 benefit")
	public void admin_mengedit_deskripsi1_benefit() {
	   JCAdminBnft.editDeskripsi1BenefitPertama();
	}

	@When("Admin klik simpan edit deskripsi1 benefit")
	public void admin_klik_simpan_edit_deskripsi1_benefit() {
	    JCAdminBnft.klikSimpanEditBenefit();
	}

	@Then("Admin telah mengedit deskripsi1 benefit")
	public void admin_telah_mengedit_deskripsi1_benefit() {
	    System.out.println("ini edit benefit");
	}
	
}
