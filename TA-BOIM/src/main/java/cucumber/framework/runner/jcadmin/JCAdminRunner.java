package cucumber.framework.runner.jcadmin;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/main/resources/jcadmin/01RincianBiayaMenambahRincianBiaya.feature"},
glue = "cucumber.framework.runner.jcadmin",
monochrome=true,
plugin = {"pretty","html:target/jcadmin/htmlreport/LoginRunner.html",
		"json:target/hrms/jsonreport/LoginRunner.json",
		"junit:target/hrms/junitreport/LoginRunner.xml"})
public class JCAdminRunner extends AbstractTestNGCucumberTests{

}
