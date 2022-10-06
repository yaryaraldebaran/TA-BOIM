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

public class JCAdminBenefitEditImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminBenefitPage JCAdminBnft; 
	private JCAdminLoginPage logn;
	String strDelay = Constants.GLOB_PARAM_DELAY;
	public JCAdminBenefitEditImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminBnft = new JCAdminBenefitPage ();
//		Utils.zoomOut(3);
	}
	/*
	 * AWAL BACKGROUND
	 */
	@When("Admin login dan masuk ke halaman benefit untuk mengedit benefit")
	public void admin_login_dan_masuk_ke_halaman_benefit_untuk_mengedit_benefit() {
	    JCAdminBnft.lihatBenefit();
	}

	@When("Admin menekan tombol edit data benefit pertama")
	public void admin_menekan_tombol_edit_data_benefit_pertama() {
	    JCAdminBnft.klikBenefitPertama("kedua");
	}
	 /*
     * AKHIR BACKGROUND
     */

	/*
	 * AWAL EDIT JUDUL, 
	 */
	@When("^(.*) Admin mengedit (.*) benefit menjadi (.*) dan (.*) menjadi (.*) dan publish menjadi (.*)$")
	public void kode_case_admin_mengedit_judulke_benefit_menjadi_judul_dan_deskripsi_ke_menjadi_deskripsi(String kodeCase,String judulKe,String judul, 
            String deskripsiKe, String deskripsi, String publishOpt) {
	    System.out.println(judulKe+"|"+judul+"|"+deskripsiKe+"|"+deskripsi);
	    if(!judulKe.isEmpty()) {
	        JCAdminBnft.editJudul(judulKe, judul);
	        
	    }else if(!deskripsiKe.isEmpty()) {
	        JCAdminBnft.editDeskripsi(deskripsiKe, deskripsi);
	    }else if (!publishOpt.isEmpty()) {
	        JCAdminBnft.editPublish(publishOpt);
	    }
	}

	@When("^(.*) Admin klik simpan edit (.*) benefit$")
	public void kode_case_admin_klik_simpan_edit_judulke_benefit(String kode, String judulKe) {
	    JCAdminBnft.klikSimpanEditBenefit();
	}

	@Then("^(.*) Admin telah mengedit (.*) benefit$")
	public void kode_case_admin_telah_mengedit_judulke_benefit(String kode, String judulKe) {
	    System.out.println("admin");
	}
	/*
     * AKHIR EDIT JUDUL, 
     */
	
	
	/*
	 * AWAL EDIT PUBLISH
	 */
//	@When("^(.*) Admin mengedit publish status benefit menjadi (.*) dan publish menjadi (.*)$")
//	public void kode_case_admin_mengedit_publish_status_benefit_menjadi_publish_status(String kode, String publishOps) {
//	    JCAdminBnft.editPublish(publishOps);
//	}
//
//	@When("^(.*) Admin klik simpan edit bagian untuk publish benefit$")
//	public void kode_case_admin_klik_simpan_edit_publish_benefit(String kode) {
//	    JCAdminBnft.klikSimpanEditBenefit();
//	}
//
//	@Then("^(.*) Admin telah mengedit publish benefit dengan (.*)$")
//	public void kode_case_admin_telah_mengedit_publish_benefit(String kode,String publishStat) {
//	    System.out.println("then");
//	}
	
	
}
