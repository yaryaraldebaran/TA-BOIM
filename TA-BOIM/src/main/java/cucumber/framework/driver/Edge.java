package cucumber.framework.driver;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.*;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class Edge implements DriverStrategy {

		public WebDriver setStrategy() {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			return driver;
		}
		
	}