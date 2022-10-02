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
	@When("Admin login dan membuka halaman rincian biaya edit")
	public void admin_login_dan_membuka_halaman_rincian_biaya() {
	    JCAdminRB.goToHome();
		JCAdminRB.goToRincianBiaya();
		extentTest.log(LogStatus.PASS, "Admin login dan membuka halaman rincian biaya");
	}

	@And("Admin klik tombol edit rincian biaya pertama edit")
	public void admin_klik_tombol_edit_rincian_biaya_pertama() {
	    JCAdminRB.editClickDataPertama();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol edit rincian biaya pertama");
	}
	//INI AKHIR BACKGROUND
	
	//INI AWAL EDIT NAMA PROGRAM
	@When("^RI010P Admin mengedit nama program dengan (.*)$")
	public void admin_mengedit_nama_program_dengan_nama_program(String namaProgramBaru) {
	    JCAdminRB.editNamaProgram(namaProgramBaru);
	    extentTest.log(LogStatus.PASS, "Admin mengedit nama program dengan "+namaProgramBaru);
	}

	@And("RI010P Admin menekan tombol simpan edit nama program")
	public void admin_menekan_tombol_simpan_edit_nama_program() {
	    //fungsi klik simpan edit
		Utils.fullScroll(this.driver);
		JCAdminRB.simpanEdit();
		System.out.println("ini klik simpan edit nama program");
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan edit nama program");
	}

	@Then("RI010P Admin mengedit nama program")
	public void admin_mengedit_nama_program() {
		JCAdminRB.goToHome();
		JCAdminRB.goToRincianBiaya();
		assertTrue(JCAdminRB.compEditNama());
	    System.out.println("nama program sudah diedit");
	    extentTest.log(LogStatus.PASS, "Admin telah mengedit nama program");
	}
	//INI AKHIR EDIT NAMA PROGRAM
	
	//INI AWAL EDIT HARGA NORMAL
	@When("^RI011P Admin mengedit harga awal dengan (.*)$")
	public void admin_mengedit_harga_awal_dengan_harga_awal(String hargaSekarang) {
	    // edit harga awal 
		JCAdminRB.editHargaAwal(hargaSekarang);
		extentTest.log(LogStatus.PASS, "Admin mengubah nama program menjadi "+hargaSekarang);
	}

	@And("RI011P Admin menekan tombol simpan edit harga awal")
	public void admin_menekan_tombol_simpan_edit_harga_awal() {
	    //admin menekan tombol simpan edit harga 
		System.out.println("admin simpan edit harga awal");
		JCAdminRB.simpanEdit();
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan edit harga awal");
		
	}

	@Then("RI011P Admin mengedit harga awal")
	public void admin_mengedit_harga_awal() {
	    System.out.println("admin mengedit harga awal");
	    extentTest.log(LogStatus.PASS, "Admin telah mengedit harga awal");
	}
	//INI AKHIR EDIT HARGA NORMAL
	
	//INI AWAL EDIT DISKON 
	
	@When("^RI012P Admin mengedit diskon dengan (.*)$")
	public void admin_mengedit_diskon_dengan_diskon(String diskonBaru) {
		JCAdminRB.editDiskon(diskonBaru);
		extentTest.log(LogStatus.PASS, "Admin telah mengedit diskon menjadi "+diskonBaru);
	}

	@And("RI012P Admin menekan tombol simpan edit diskon")
	public void admin_menekan_tombol_simpan_edit_diskon() {
		JCAdminRB.simpanEdit();
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan edit diskon");
	}

	@Then("RI012P Admin mengedit diskon")
	public void admin_mengedit_diskon() {
		System.out.println("ini validator ");
		extentTest.log(LogStatus.PASS, "Admin telah mengedit diskon");
	}
	//INI AKHIR EDIT DISKON
	
	
	
	//INI AWAL EDIT KEUNGGULAN 1
	@When("^RI013P Admin mengedit keunggulan1 dengan (.*)$")
	public void admin_mengedit_keunggulan1_dengan_keunggulan1(String keunggulan1) {
	    JCAdminRB.editKeunggulan1(keunggulan1);
	    extentTest.log(LogStatus.PASS, "Admin mengedit keunggulan 1 menjadi "+keunggulan1);
	}

	@When("RI013P Admin menekan tombol simpan edit keunggulan1")
	public void admin_menekan_tombol_simpan_edit_keunggulan1() {
	    JCAdminRB.simpanEdit();
	    extentTest.log(LogStatus.PASS, "Admin menyimpan edit keunggulan 1");
	}

	@Then("RI013P Admin mengedit keunggulan1")
	public void admin_mengedit_keunggulan1() {
	    //INI VALIDATOR EDIT KEUNGGULAN1
		extentTest.log(LogStatus.PASS, "Admin telah mengedit keunggulan 1");
	}
	//INI AKHIR EDIT KEUNGGULAN 1
	

}
