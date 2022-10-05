package cucumber.framework.runner.jcadmin;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminRincianBiayaPage;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCSearchRincianBiayaImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminRincianBiayaPage JCAdminRB; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCSearchRincianBiayaImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminRB = new JCAdminRincianBiayaPage();
	}
	//INI MULAI BACKGROUND
	@When("Admin login dan membuka cari halaman rincian biaya untuk mencari rb")
	public void admin_login_dan_membuka_cari_halaman_rincian_biaya_untuk_mencari_rb() {
		JCAdminRB.goToHome();
	    JCAdminRB.goToRincianBiaya();
	}
	//INI AKHIR BACKGROUND	
	

	@When("RI018P Admin memilih opsi nama program")
	public void ri018p_admin_memilih_opsi_nama_program() {
	    JCAdminRB.lihatNamaProgram();
	    JCAdminRB.searchNamaProgram();
	    Utils.delay(3, strDelay);
	}

	
	
	@Then("RI018P Admin melihat hasil search cari nama program")
	public void ri018p_admin_melihat_hasil_search_cari_nama_program() {
	    assertTrue(JCAdminRB.getEditNameSuccess().contains("Pemrograman"));
	}
	
	@When("RI019P Admin memilih opsi harga normal")
	public void ri018p_admin_memilih_opsi_harga_normal() {
	    JCAdminRB.lihatHargaNormal();
	    JCAdminRB.searchHargaNormal();
	}

	@Then("RI019P Admin melihat hasil search cari harga normal")
	public void ri018p_admin_melihat_hasil_search_cari_harga_normal() {
	    String harga1 = JCAdminRB.getEditHargaSuccess();
	    harga1=Integer.toString(Utils.hargaKeInt(harga1)) ;
	    assertTrue(harga1.contains("50000"));
	}
	
	@When("RI020P Admin memilih opsi diskon")
	public void ri020p_admin_memilih_opsi_diskon() {
		JCAdminRB.lihatDiskon();
	    JCAdminRB.searchDiskon();
	}

	@Then("RI020P Admin melihat hasil search cari diskon")
	public void ri020p_admin_melihat_hasil_search_cari_diskon() {
	    String diskon1 = JCAdminRB.getEditDiskonSuccess();
	    diskon1 = Integer.toString(Utils.diskonKeInt(diskon1));
	    assertTrue(diskon1.contains("5"));
	}
	
	@When("RI021P Admin memilih opsi harga diskon")
	public void ri021p_admin_memilih_opsi_harga_diskon() {
		String hargaDiskon = "450";
		JCAdminRB.lihatHargaDiskon();
	    JCAdminRB.searchHargaDiskon(hargaDiskon);
	}

	@Then("RI021P Admin melihat hasil search cari harga diskon")
	public void ri021p_admin_melihat_hasil_search_cari_harga_diskon() {
	    String hargaD = JCAdminRB.getHargaDskon();
	    hargaD = Integer.toString(Utils.hargaKeInt(hargaD));
		assertTrue(hargaD.contains("450"));
	}


}
