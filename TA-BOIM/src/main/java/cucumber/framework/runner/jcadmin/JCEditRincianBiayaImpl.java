package cucumber.framework.runner.jcadmin;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminRincianBiayaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCEditRincianBiayaImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminRincianBiayaPage JCAdminRB; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCEditRincianBiayaImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminRB = new JCAdminRincianBiayaPage();
		
	}
	//INI BACKGROUND
	@When("Admin login dan membuka halaman rincian biaya")
	public void admin_login_dan_membuka_halaman_rincian_biaya() {
	    JCAdminRB.goToHome();
		JCAdminRB.goToRincianBiaya();
	}

	@And("Admin klik tombol edit rincian biaya pertama")
	public void admin_klik_tombol_edit_rincian_biaya_pertama() {
	    JCAdminRB.editClickDataPertama();
	}
	//INI AKHIR BACKGROUND
	
	@When("^Admin mengedit nama program dengan (.*)$")
	public void admin_mengedit_nama_program_dengan_nama_program(String namaProgramBaru) {
	    JCAdminRB.editNamaProgram(namaProgramBaru);
	}

	@When("Admin menekan tombol simpan edit nama program")
	public void admin_menekan_tombol_simpan_edit_nama_program() {
	    //fungsi klik simpan edit
		System.out.println("ini klik simpan edit nama program");
	}

	@Then("Admin mengedit nama program")
	public void admin_mengedit_nama_program() {
	    System.out.println("nama program sudah diedit");
	}

	@When("^Admin mengedit harga awal dengan (.*)$")
	public void admin_mengedit_harga_awal_dengan_harga_awal(String hargaSekarang) {
	    // edit harga awal 
		JCAdminRB.editHargaAwal(hargaSekarang);
	}

	@When("Admin menekan tombol simpan edit harga awal")
	public void admin_menekan_tombol_simpan_edit_harga_awal() {
	    //admin menekan tombol simpan edit harga 
		System.out.println("admin simpan edit harga awal");
		
	}

	@Then("Admin mengedit harga awal")
	public void admin_mengedit_harga_awal() {
	    System.out.println("admin mengedit harga awal");
	}

}
