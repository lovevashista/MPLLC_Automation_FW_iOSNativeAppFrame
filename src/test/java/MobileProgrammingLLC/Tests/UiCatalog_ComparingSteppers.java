package MobileProgrammingLLC.Tests;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MobileProgrammingLLC.PageLibraries.UiCatalog_HomePage;
import MobileProgrammingLLC.PageLibraries.UiCatalog_Steppers;
import MobileProgrammingLLC.Resources.Base;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class UiCatalog_ComparingSteppers {
	IOSDriver<IOSElement> driver;
	Logger log = LogManager.getLogger(UiCatalog_ComparingSteppers.class.getName());
	Properties locators = new Properties();
	Properties config = new Properties();
	Properties data = new Properties();
	UiCatalog_HomePage uhp;
	UiCatalog_Steppers ust;
	Base b = new Base();
	
	@BeforeClass
	public void initConfigs() {
		log.info("Initializing Configurations...");
		locators = b.loadLocators();
		config = b.loadConfig();
		data = b.loadData();
		driver = b.createAppiumServerConnection(config.getProperty("ip"),config.getProperty("port"), config.getProperty("DeviceType"));
		uhp = new UiCatalog_HomePage(driver);
		ust = new UiCatalog_Steppers(driver);
		log.info("Configurations Successfully Initialized.");
	}
	
	@Test
	public void compareSteppers() {
		b.swipeInDirection("up", driver);
		b.tapOn(uhp.getSteppersLnk(), driver);
		for(int i=0; i<3; i++) {
			b.tapOn(ust.getFirstStepperIncrementBtn(), driver);
		}
		b.compareContentUsingClass(ust.getSteppersStaticTFs(), 
									data.getProperty("iPhone8P_FirstStepperIncrementBtnIndexValue"), 
									data.getProperty("iPhone8P_FirstStepperCounterFieldValue"));
	}
	
	@AfterClass
	public void tearDown() {
		b.quitDriver(driver);
		b.stopAppiumServer();
	}
}
