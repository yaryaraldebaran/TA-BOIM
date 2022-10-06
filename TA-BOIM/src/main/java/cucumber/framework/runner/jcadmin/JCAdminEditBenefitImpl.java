package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminBenefitPage;
import cucumber.framework.page.jcadmin.JCAdminBlogPage;
import cucumber.framework.page.jcadmin.JCAdminLoginPage;
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
	private JCAdminLoginPage logn;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	public JCAdminEditBenefitImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_BENEFIT);
		JCAdminBnft = new JCAdminBenefitPage ();
		logn = new JCAdminLoginPage();
		logn.LoginPage("ucen1315@gmail.com", "a");
	}	
	/*
	 * EDIT JUDUL 1 BENEFIT
	 */
	@When("RI004P Admin mengedit judul1 benefit")
	public void admin_mengedit_benefit() {
		JCAdminBnft.lihatBenefit();
		Utils.zoomOut(4);
		Utils.delay(1, strDelay);
	    JCAdminBnft.klikBenefitPertama();
	    JCAdminBnft.editJudul1BenefitPertama("Ini judul satu baru");
	}

	@When("RI004P Admin klik simpan edit judul1 benefit")
	public void admin_klik_simpan_edit_benefit() {
	    JCAdminBnft.klikSimpanEditBenefit();
	}

	@Then("RI004P Admin telah mengedit judul1 benefit")
	public void admin_telah_mengedit_benefit() {
		System.out.println("then");
	}
	//AKHIR JUDUL 1 BENEFIT
	
	/*
	 * EDIT JUDUL 2 BENEFIT
	 */
	@When("RI006P Admin mengedit judul2 benefit")
	public void admin_mengedit_benefitDua() {
		JCAdminBnft.lihatBenefit();
		Utils.zoomOut(4);
		Utils.delay(1, strDelay);
	    JCAdminBnft.klikBenefitPertama();
	    JCAdminBnft.editJudul2BenefitPertama("Ini judul dua baru");
	}

	@When("RI006P Admin klik simpan edit judul2 benefit")
	public void admin_klik_simpan_edit_benefitDua() {
	    JCAdminBnft.klikSimpanEditBenefit();
	}

	@Then("RI006P Admin telah mengedit judul2 benefit")
	public void admin_telah_mengedit_benefitDua() {
		System.out.println("then");
	}
	//AKHIR JUDUL 2 BENEFIT
	
	
	@When("RI005P Admin mengedit deskripsi1 benefit")
	public void admin_mengedit_deskripsi1_benefit() {
		JCAdminBnft.lihatBenefit();
		Utils.zoomOut(4);
		Utils.delay(1, strDelay);
	    JCAdminBnft.klikBenefitPertama();
	   JCAdminBnft.editDeskripsi1BenefitPertama();
	}

	@When("RI005P Admin klik simpan edit deskripsi1 benefit")
	public void admin_klik_simpan_edit_deskripsi1_benefit() {
	    JCAdminBnft.klikSimpanEditBenefit();
	}

	@Then("RI005P Admin telah mengedit deskripsi1 benefit")
	public void admin_telah_mengedit_deskripsi1_benefit() {
	    System.out.println("ini edit benefit");
	}
	
}
