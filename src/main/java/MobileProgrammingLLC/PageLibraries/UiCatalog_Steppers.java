package MobileProgrammingLLC.PageLibraries;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class UiCatalog_Steppers {
	public UiCatalog_Steppers(IOSDriver<IOSElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSFindBy(xpath="(//XCUIElementTypeButton[@name='Increment'])[1]") IOSElement FirstStepperIncrementBtn;
	public IOSElement getFirstStepperIncrementBtn() {
		return FirstStepperIncrementBtn;
	}
	
	@iOSFindBy(className="XCUIElementTypeStaticText") List<IOSElement> SteppersStaticTFs;
	public List<IOSElement> getSteppersStaticTFs(){
		return SteppersStaticTFs;
	}
}
