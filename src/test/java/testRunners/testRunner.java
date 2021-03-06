package testRunners;

import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;

import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue="StepDefinitions",
				plugin = {
						//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
						"pretty","html:target/html", "json:target/cucumber.json"},
		monochrome = true
		)
public class testRunner {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
	    Reporter.setSystemInfo("Selenium", "3.7.0");
	    Reporter.setSystemInfo("Maven", "3.5.2");
	    Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}

}


