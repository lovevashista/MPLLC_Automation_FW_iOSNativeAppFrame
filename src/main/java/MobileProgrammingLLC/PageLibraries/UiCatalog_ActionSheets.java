package MobileProgrammingLLC.PageLibraries;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class UiCatalog_ActionSheets {
	public UiCatalog_ActionSheets(IOSDriver<IOSElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Okay / Cancel']") IOSElement OkayBtn;
	public IOSElement getOkayBtn() {
		return OkayBtn;
	}
	
	@iOSFindBy(accessibility="OK") IOSElement OKBtn;
	public IOSElement getOKBtn() {
		return OKBtn;
	}
}
