package MobileProgrammingLLC.PageLibraries;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class UiCatalog_AlertViews {
	public UiCatalog_AlertViews(IOSDriver<IOSElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSFindBy(accessibility="Text Entry") IOSElement TextEntryLnk;
	public IOSElement getTextEntryLnk() {
		return TextEntryLnk;
	}
	
	@iOSFindBy(className="XCUIElementTypeTextField") IOSElement TextEntryTF;
	public IOSElement getTextEntryTF() {
		return TextEntryTF;
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='OK']") IOSElement TextEntryOKBtn;
	public IOSElement getTextEntryOKBtn() {
		return TextEntryOKBtn;
	}
}
