package MobileProgrammingLLC.Tests;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MobileProgrammingLLC.PageLibraries.UiCatalog_ActionSheets;
import MobileProgrammingLLC.PageLibraries.UiCatalog_HomePage;
import MobileProgrammingLLC.Resources.Base;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class UiCatalog_ValidatingActionSheets {
	IOSDriver<IOSElement> driver;
	Logger log = LogManager.getLogger(UiCatalog_ValidatingActionSheets.class.getName());
	Properties locators = new Properties();
	Properties config = new Properties();
	Properties data = new Properties();
	UiCatalog_HomePage uhp;
	UiCatalog_ActionSheets uas;
	Base b = new Base();
	
	@BeforeClass
	public void initConfigs() {
		log.info("Initializing Configurations...");
		locators = b.loadLocators();
		config = b.loadConfig();
		data = b.loadData();
		driver = b.createAppiumServerConnection(config.getProperty("ip"),config.getProperty("port"), config.getProperty("DeviceType"));
		uhp = new UiCatalog_HomePage(driver);
		uas = new UiCatalog_ActionSheets(driver);
		log.info("Configurations Successfully Initialized.");
	}
	
	@Test
	public void validateActionSheets() {
		b.tapOn(uhp.getActionSheetsLnk(), driver);
		b.tapOn(uas.getOkayBtn(), driver);
		b.tapOn(uas.getOKBtn(), driver);
	}
	
	@AfterClass
	public void tearDown() {
		b.quitDriver(driver);
		b.stopAppiumServer();
	}
}
