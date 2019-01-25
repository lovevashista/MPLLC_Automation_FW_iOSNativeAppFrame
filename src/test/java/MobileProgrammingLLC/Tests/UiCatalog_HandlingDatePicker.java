package MobileProgrammingLLC.Tests;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MobileProgrammingLLC.PageLibraries.UiCatalog_AlertViews;
import MobileProgrammingLLC.PageLibraries.UiCatalog_DatePicker;
import MobileProgrammingLLC.PageLibraries.UiCatalog_HomePage;
import MobileProgrammingLLC.Resources.Base;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class UiCatalog_HandlingDatePicker {
	IOSDriver<IOSElement> driver;
	Logger log = LogManager.getLogger(UiCatalog_HandlingDatePicker.class.getName());
	Properties locators = new Properties();
	Properties config = new Properties();
	Properties data = new Properties();
	UiCatalog_HomePage uhp;
	UiCatalog_AlertViews uav;
	UiCatalog_DatePicker udp;
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
		udp = new UiCatalog_DatePicker(driver);
		log.info("Configurations Successfully Initialized.");
	}
	
	@Test
	public void handleDatePicker() {
		b.tapOn(uhp.getDatePickerLnk(), driver);
		b.waitFor(1);
		b.swipeUsingCoordinates(
				data.getProperty("iPhone8P_DayXStCoord"),
				data.getProperty("iPhone8P_DayYStCoord"),
				data.getProperty("iPhone8P_DayXEnCoord"),
				data.getProperty("iPhone8P_DayYEnCoord")
			); 
		b.waitFor(1);
		b.swipeUsingCoordinates(
				data.getProperty("iPhone8P_HourXStCoord"),
				data.getProperty("iPhone8P_HourYStCoord"),
				data.getProperty("iPhone8P_HourXEnCoord"),
				data.getProperty("iPhone8P_HourYEnCoord")
			);
		b.waitFor(1);
		b.swipeUsingCoordinates(
				data.getProperty("iPhone8P_MinXStCoord"),
				data.getProperty("iPhone8P_MinYStCoord"),
				data.getProperty("iPhone8P_MinXEnCoord"),
				data.getProperty("iPhone8P_MinYEnCoord")
			);
		b.waitFor(1);
		b.swipeUsingCoordinates(
				data.getProperty("iPhone8P_MerXStCoord"),
				data.getProperty("iPhone8P_MerYStCoord"),
				data.getProperty("iPhone8P_MerXEnCoord"),
				data.getProperty("iPhone8P_MerYEnCoord")
			);
	}
	
	@AfterClass
	public void tearDown() {
		b.quitDriver(driver);
		b.stopAppiumServer();
	}
}
