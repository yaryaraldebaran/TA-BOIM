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

public class JCLihatRincianBiayaImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminRincianBiayaPage JCAdminRB; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCLihatRincianBiayaImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminRB = new JCAdminRincianBiayaPage();
	}
	//INI MULAI BACKGROUND
	@When("Admin login dan membuka halaman rincian biaya untuk melihat rb")
	public void admin_login_dan_membuka_halaman_rincian_biaya_untuk_melihat_rb() {
		JCAdminRB.goToHome();
		JCAdminRB.goToRincianBiaya();
		extentTest.log(LogStatus.PASS, "Admin login dan membuka halaman rincian biaya");
	}
	//INI AKHIR BACKGROUND
	
	
	//INI AWAL OPSI HARGA NORMAL
	@When("RI003P Admin memilih opsi harga normal")
	public void ri003p_admin_memilih_opsi_harga_normal() {
	    JCAdminRB.lihatHargaNormal();
	    Utils.delay(5, strDelay);
	}

	@Then("RI003P Admin melihat rincian biaya berdasarkan harga normal")
	public void ri003p_admin_melihat_rincian_biaya_berdasarkan_harga_normal() {
		Utils.setengahScroll("40");
		boolean comopH=Utils.compHarga(JCAdminRB.getHarga1(), JCAdminRB.getHarga2(), JCAdminRB.getHarga1());
		assertTrue(comopH);
		System.out.println("ini harga normal");
	}
	
	//INI AWAL OPSI DISKON
	@When("RI004P Admin memilih opsi diskon")
	public void ri004p_admin_memilih_opsi_diskon() {
	    JCAdminRB.lihatDiskon();
	    Utils.delay(5, strDelay);
	}

	@Then("RI004P Admin melihat rincian biaya berdasarkan diskon")
	public void ri004p_admin_melihat_rincian_biaya_berdasarkan_diskon() {
	    System.out.println("ini diskon");
	    boolean comDis=Utils.compDisk(JCAdminRB.getDiskon1(), JCAdminRB.getDiskon2(), JCAdminRB.getDiskon3());
	    assertTrue(comDis);
	}
	
	//INI AWAL OPSI HARGA DISKON
	@When("RI005P Admin memilih opsi harga hasil diskon")
	public void ri005p_admin_memilih_opsi_harga_hasil_diskon() {
	    JCAdminRB.lihatHargaDiskon();
	    Utils.delay(5, strDelay);
	}

	@Then("RI005P Admin melihat rincian biaya berdasarkan harga hasil diskon")
	public void ri005p_admin_melihat_rincian_biaya_berdasarkan_harga_hasil_diskon() {
		Utils.setengahScroll("100");
	    Utils.compHarga(JCAdminRB.getHargaDiskon1(), JCAdminRB.getHargaDiskon2(), JCAdminRB.getHargaDiskon3());
		System.out.println("lihat harga diskon");
	}

}
