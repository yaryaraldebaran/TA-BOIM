package cucumber.framework.runner.nopc.scenefirst;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/nopc/scenefirst/02dashboard.feature",
		"src/test/resources/nopc/scenefirst/01login.feature"},
glue = "cucumber.framework.runner.nopc.scenefirst",
monochrome=true,
plugin = {"pretty","html:target/nopc/htmlreport/LoginRunner.html",
		"json:target/nopc/jsonreport/LoginRunner.json",
		"junit:target/nopc/junitreport/LoginRunner.xml"})
public class LoginRunner extends AbstractTestNGCucumberTests{}