package MobileProgrammingLLC.PageLibraries;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class UiCatalog_HomePage {
	public UiCatalog_HomePage(IOSDriver<IOSElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSFindBy(accessibility="Action Sheets") IOSElement ActionSheetsLnk;
	public IOSElement getActionSheetsLnk() {
		return ActionSheetsLnk;
	}
	
	@iOSFindBy(accessibility="Alert Views")IOSElement AlertViewsLnk;
	public IOSElement getAlertViewsLnk() {
		return AlertViewsLnk;
	}
	
	@iOSFindBy(xpath="//*[@name='Date Picker']") IOSElement DatePickerLnk;
	public IOSElement getDatePickerLnk() {
		return DatePickerLnk;
	}
	
	@iOSFindBy(className="XCUIElementTypePickerWheel") IOSElement DatePickerWheelClass;
	public IOSElement getDatePickerWheelClass() {
		return DatePickerWheelClass;
	}
	
	@iOSFindBy(accessibility="Steppers") IOSElement SteppersLnk;
	public IOSElement getSteppersLnk() {
		return SteppersLnk;
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Web View']") IOSElement WebViewLnk;
	public IOSElement getWebViewLnk() {
		return WebViewLnk;
	}
}
