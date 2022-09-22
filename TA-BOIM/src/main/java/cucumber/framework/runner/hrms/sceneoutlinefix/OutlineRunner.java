package cucumber.framework.runner.hrms.sceneoutlinefix;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/main/resources/hrms/sceneoutlinefix/0004dashboard.feature",
		"src/main/resources/hrms/sceneoutlinefix/0001logininvalid.feature",
		"src/main/resources/hrms/sceneoutlinefix/0002loginempty.feature",
		"src/main/resources/hrms/sceneoutlinefix/0003loginvalid.feature"},
glue = "cucumber.framework.runner.hrms.sceneoutlinefix",
monochrome=true,
plugin = {"pretty","html:target/hrms/htmlreport/LoginRunnerOutline.html",
		"json:target/hrms/jsonreport/LoginRunnerOutline.json",
		"junit:target/hrms/junitreport/LoginRunnerOutline.xml"})
public class OutlineRunner extends AbstractTestNGCucumberTests{}

//features = {"src/test/resources/features/hrms/sceneoutlinefix/0004dashboard.feature",
//		"src/test/resources/features/hrms/sceneoutlinefix/0001logininvalid.feature",
//		"src/test/resources/features/hrms/sceneoutlinefix/0002loginempty.feature",
//		"src/test/resources/features/hrms/sceneoutlinefix/0003loginvalid.feature"},