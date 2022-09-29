package cucumber.framework.runner.jcadmin;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminRincianBiayaPage;
import cucumber.framework.utils.Utils;
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
	//INI MULAI BACKGROUND
	@When("Admin login dan membuka halaman rincian biaya")
	public void admin_login_dan_membuka_halaman_rincian_biaya() {
	    JCAdminRB.goToHome();
		JCAdminRB.goToRincianBiaya();
		extentTest.log(LogStatus.PASS, "Admin login dan membuka halaman rincian biaya");
	}

	@And("Admin klik tombol edit rincian biaya pertama")
	public void admin_klik_tombol_edit_rincian_biaya_pertama() {
	    JCAdminRB.editClickDataPertama();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol edit rincian biaya pertama");
	}
	//INI AKHIR BACKGROUND
	
	//INI AWAL EDIT NAMA PROGRAM
	@When("^Admin mengedit nama program dengan (.*)$")
	public void admin_mengedit_nama_program_dengan_nama_program(String namaProgramBaru) {
	    JCAdminRB.editNamaProgram(namaProgramBaru);
	    extentTest.log(LogStatus.PASS, "Admin mengedit nama program dengan "+namaProgramBaru);
	}

	@And("Admin menekan tombol simpan edit nama program")
	public void admin_menekan_tombol_simpan_edit_nama_program() {
	    //fungsi klik simpan edit
		Utils.fullScroll(this.driver);
		JCAdminRB.simpanEdit();
		System.out.println("ini klik simpan edit nama program");
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan edit nama program");
	}

	@Then("Admin mengedit nama program")
	public void admin_mengedit_nama_program() {
	    System.out.println("nama program sudah diedit");
	    extentTest.log(LogStatus.PASS, "Admin telah mengedit nama program");
	}
	//INI AKHIR EDIT NAMA PROGRAM
	
	//INI AWAL EDIT HARGA NORMAL
	@When("^Admin mengedit harga awal dengan (.*)$")
	public void admin_mengedit_harga_awal_dengan_harga_awal(String hargaSekarang) {
	    // edit harga awal 
		JCAdminRB.editHargaAwal(hargaSekarang);
		extentTest.log(LogStatus.PASS, "Admin mengubah nama program menjadi "+hargaSekarang);
	}

	@And("Admin menekan tombol simpan edit harga awal")
	public void admin_menekan_tombol_simpan_edit_harga_awal() {
	    //admin menekan tombol simpan edit harga 
		System.out.println("admin simpan edit harga awal");
		JCAdminRB.simpanEdit();
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan edit harga awal");
		
	}

	@Then("Admin mengedit harga awal")
	public void admin_mengedit_harga_awal() {
	    System.out.println("admin mengedit harga awal");
	    extentTest.log(LogStatus.PASS, "Admin telah mengedit harga awal");
	}
	//INI AKHIR EDIT HARGA NORMAL
	
	//INI AWAL EDIT DISKON 
	
	@When("^Admin mengedit diskon dengan (.*)$")
	public void admin_mengedit_diskon_dengan_diskon(String diskonBaru) {
		JCAdminRB.editDiskon(diskonBaru);
		extentTest.log(LogStatus.PASS, "Admin telah mengedit diskon menjadi "+diskonBaru);
	}

	@And("Admin menekan tombol simpan edit diskon")
	public void admin_menekan_tombol_simpan_edit_diskon() {
		JCAdminRB.simpanEdit();
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan edit diskon");
	}

	@Then("Admin mengedit diskon")
	public void admin_mengedit_diskon() {
		System.out.println("ini validator ");
		extentTest.log(LogStatus.PASS, "Admin telah mengedit diskon");
	}
	
	//INI AKHIR EDIT DISKON
	

}
