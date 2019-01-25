package MobileProgrammingLLC.Tests;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MobileProgrammingLLC.PageLibraries.UiCatalog_AlertViews;
import MobileProgrammingLLC.PageLibraries.UiCatalog_HomePage;
import MobileProgrammingLLC.Resources.Base;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class UiCatalog_ManagingAlertViews {
	IOSDriver<IOSElement> driver;
	Logger log = LogManager.getLogger(UiCatalog_ManagingAlertViews.class.getName());
	Properties locators = new Properties();
	Properties config = new Properties();
	Properties data = new Properties();
	UiCatalog_HomePage uhp;
	UiCatalog_AlertViews uav;
	Base b = new Base();
	
	@BeforeClass
	public void initConfigs() {
		log.info("Initializing Configurations...");
		locators = b.loadLocators();
		config = b.loadConfig();
		data = b.loadData();
		driver = b.createAppiumServerConnection(config.getProperty("ip"),config.getProperty("port"), config.getProperty("DeviceType"));
		uhp = new UiCatalog_HomePage(driver);
		uav = new UiCatalog_AlertViews(driver);
		log.info("Configurations Successfully Initialized.");
	}
	
	@Test
	public void manageAlertViews() {
		b.tapOn(uhp.getAlertViewsLnk(), driver);
		b.tapOn(uav.getTextEntryLnk(), driver);
		b.enterContentInto(uav.getTextEntryTF(), "Mobile Programming");
		b.tapOn(uav.getTextEntryOKBtn(), driver);
	}
	
	@AfterClass
	public void tearDown() {
		b.quitDriver(driver);
		b.stopAppiumServer();
	}
}
