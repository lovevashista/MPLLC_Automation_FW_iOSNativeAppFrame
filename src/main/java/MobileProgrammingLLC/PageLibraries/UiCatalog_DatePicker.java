package MobileProgrammingLLC.PageLibraries;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class UiCatalog_DatePicker {
	public UiCatalog_DatePicker(IOSDriver<IOSElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSFindBy(className="XCUIElementTypePickerWheel") List<IOSElement> DatePickerWheelClass;
	public List<IOSElement> getDatePickerWheelClass() {
		return DatePickerWheelClass;
	}
	
	@iOSFindBy(className="XCUIElementTypeStaticText") IOSElement ActualDate;
	public IOSElement getActualDate() {
		return ActualDate;
	}
	
	@iOSFindBy(xpath="//XCUIElementTypePickerWheel[@value='Mon, Nov 5']") IOSElement DatePickerDay;
	public IOSElement getDatePickerDay() {
		return DatePickerDay;
	}
}
