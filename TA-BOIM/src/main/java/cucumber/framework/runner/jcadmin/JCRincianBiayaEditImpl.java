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

public class JCRincianBiayaEditImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminRincianBiayaPage JCAdminRB; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCRincianBiayaEditImpl() {
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
		Utils.fullScroll();
		JCAdminRB.simpanEdit();
		System.out.println("ini klik simpan edit nama program");
		extentTest.log(LogStatus.PASS, "Admin menekan tombol simpan edit nama program");
	}

	@Then("^RI010P Admin mengedit nama program THEN (.*)$")
	public void admin_mengedit_nama_program(String namaProgramBaru) {
		JCAdminRB.goToHome();
		JCAdminRB.goToRincianBiaya();
		assertTrue(JCAdminRB.compEditNama(namaProgramBaru));
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

	@Then("^RI011P Admin mengedit harga awal THEN (.*)$")
	public void admin_mengedit_harga_awal(String hargaBaru) {
		JCAdminRB.goToHome();
		JCAdminRB.goToRincianBiaya();
		assertTrue(JCAdminRB.compEditHarga(hargaBaru));
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

	@Then("^RI012P Admin mengedit diskon THEN (.*)$")
	public void admin_mengedit_diskon(String diskonBaru) {
		JCAdminRB.goToHome();
		JCAdminRB.goToRincianBiaya();
		assertTrue(JCAdminRB.compEditDiskon(diskonBaru));
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

	@Then("^RI013P Admin mengedit keunggulan1 THEN (.*)$")
	public void admin_mengedit_keunggulan1(String keunggulan1Baru) {
		JCAdminRB.goToHome();
		JCAdminRB.goToRincianBiaya();
	    //INI VALIDATOR EDIT KEUNGGULAN1
		assertTrue(JCAdminRB.compEditKeunggulan1(keunggulan1Baru));
		extentTest.log(LogStatus.PASS, "Admin telah mengedit keunggulan 1");
	}
	//INI AKHIR EDIT KEUNGGULAN 1
	
	
	//INI AWAL EDIT KEUNGGULAN 2
	@When("^RI013P Admin mengedit keunggulan2 dengan (.*)$")
	public void admin_mengedit_keunggulan2_dengan_keunggulan2(String keunggulan2) {
		Utils.fullScroll();
		Utils.delay(3, strDelay);
	    JCAdminRB.editKeunggulan2(keunggulan2);
	    extentTest.log(LogStatus.PASS, "Admin mengedit keunggulan 2 menjadi "+keunggulan2);
	}

	@When("RI013P Admin menekan tombol simpan edit keunggulan2")
	public void admin_menekan_tombol_simpan_edit_keunggulan2() {
	    JCAdminRB.simpanEdit();
	    extentTest.log(LogStatus.PASS, "Admin menyimpan edit keunggulan 2");
	}

	@Then("^RI013P Admin mengedit keunggulan2 THEN (.*)$")
	public void admin_mengedit_keunggulan2(String keunggulan2Baru) {
	    JCAdminRB.goToHome();
	    JCAdminRB.goToRincianBiaya();
	    //INI VALIDATOR EDIT KEUNGGULAN1
	    assertTrue(JCAdminRB.compEditKeunggulan2(keunggulan2Baru));
	    extentTest.log(LogStatus.PASS, "Admin telah mengedit keunggulan 2");
	}
	//INI AKHIR EDIT KEUNGGULAN 2
	
	//INI AWAL EDIT KEUNGGULAN 3
	@When("^RI013P Admin mengedit keunggulan3 dengan (.*)$")
	public void admin_mengedit_keunggulan3_dengan_keunggulan3(String keunggulan3) {
		Utils.fullScroll();
		Utils.delay(3, strDelay);
	    JCAdminRB.editKeunggulan3(keunggulan3);
	    extentTest.log(LogStatus.PASS, "Admin mengedit keunggulan 3 menjadi "+keunggulan3);
	}

	@When("RI013P Admin menekan tombol simpan edit keunggulan3")
	public void admin_menekan_tombol_simpan_edit_keunggulan3() {
	    JCAdminRB.simpanEdit();
	    extentTest.log(LogStatus.PASS, "Admin menyimpan edit keunggulan 3");
	}

	@Then("^RI013P Admin mengedit keunggulan3 THEN (.*)$")
	public void admin_mengedit_keunggulan3(String keunggulan3Baru) {
	    JCAdminRB.goToHome();
	    JCAdminRB.goToRincianBiaya();
	    //INI VALIDATOR EDIT KEUNGGULAN1
	    assertTrue(JCAdminRB.compEditKeunggulan3(keunggulan3Baru));
	    extentTest.log(LogStatus.PASS, "Admin telah mengedit keunggulan 3");
	}
	//INI AKHIR EDIT KEUNGGULAN 3
	
	
	//INI AWAL EDIT KEUNGGULAN 4
	@When("^RI013P Admin mengedit keunggulan4 dengan (.*)$")
	public void admin_mengedit_keunggulan4_dengan_keunggulan4(String keunggulan4) {
		Utils.fullScroll();
		Utils.delay(3, strDelay);
	    JCAdminRB.editKeunggulan4(keunggulan4);
	    extentTest.log(LogStatus.PASS, "Admin mengedit keunggulan 4 menjadi "+keunggulan4);
	}

	@When("RI013P Admin menekan tombol simpan edit keunggulan4")
	public void admin_menekan_tombol_simpan_edit_keunggulan4() {
	    JCAdminRB.simpanEdit();
	    extentTest.log(LogStatus.PASS, "Admin menyimpan edit keunggulan 4");
	}

	@Then("^RI013P Admin mengedit keunggulan4 THEN (.*)$")
	public void admin_mengedit_keunggulan4(String keunggulan4Baru) {
	    JCAdminRB.goToHome();
	    JCAdminRB.goToRincianBiaya();
	    //INI VALIDATOR EDIT KEUNGGULAN4
	    assertTrue(JCAdminRB.compEditKeunggulan4(keunggulan4Baru));
	    extentTest.log(LogStatus.PASS, "Admin telah mengedit keunggulan 4");
	}
	//INI AKHIR EDIT KEUNGGULAN 4
	
	//INI AWAL EDIT KEUNGGULAN 5
	@When("^RI013P Admin mengedit keunggulan5 dengan (.*)$")
	public void admin_mengedit_keunggulan5_dengan_keunggulan5(String keunggulan5) {
		Utils.fullScroll();
		Utils.delay(3, strDelay);
	    JCAdminRB.editKeunggulan5(keunggulan5);
	    extentTest.log(LogStatus.PASS, "Admin mengedit keunggulan 5 menjadi "+keunggulan5);
	}

	@When("RI013P Admin menekan tombol simpan edit keunggulan5")
	public void admin_menekan_tombol_simpan_edit_keunggulan5() {
	    JCAdminRB.simpanEdit();
	    extentTest.log(LogStatus.PASS, "Admin menyimpan edit keunggulan 5");
	}

	@Then("^RI013P Admin mengedit keunggulan5 THEN (.*)$")
	public void admin_mengedit_keunggulan5(String keunggulan5Baru) {
	    JCAdminRB.goToHome();
	    JCAdminRB.goToRincianBiaya();
	    //INI VALIDATOR EDIT KEUNGGULAN1
	    assertTrue(JCAdminRB.compEditKeunggulan5(keunggulan5Baru));
	    extentTest.log(LogStatus.PASS, "Admin telah mengedit keunggulan 5");
	}
	//INI AKHIR EDIT KEUNGGULAN 5

}
