package test;

import android.util.Log;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class LaunchSettings extends UiAutomatorTestCase {
	
	private String appList[][] = {
			{"YouTube", "maxdome", "videociety", "Servus TV", "Netzkino"},
			{"YouTube", "maxdome", "videociety", "Servus TV", "Netzkino"},
			{"YouTube", "maxdome", "videociety", "Servus TV", "Netzkino"},
	};
	
	private void findRow(String name) {
		getUiDevice().pressHome();
		getUiDevice().pressDPadDown();
		
		UiObject row = new UiObject(new UiSelector().resourceId(name));
		
		// com.humaxdigital.ott.launcher:id/humax_plus_layout
	}
	
	private void findAppAndLaunch(String name) {
		// Simulate a short press on the HOME button.
		getUiDevice().pressHome();
		sleep(1000);
		UiObject selectedText = new UiObject(
				new UiSelector().text(name));
		
		while (!selectedText.exists()) {
			getUiDevice().pressDPadRight();
			sleep(1000);
		}
		
		getUiDevice().pressEnter();
		
	}
	
	public void testDemo() throws UiObjectNotFoundException, InterruptedException {

		// Simulate a short press on the HOME button.
		
		findAppAndLaunch("YouTube");
		sleep(5000);
		findAppAndLaunch("maxdome");
		sleep(5000);
		findAppAndLaunch("videociety");
		sleep(5000);

		
//		sleep(1000);
//		
//		getUiDevice().pressDPadDown();
//		
//		sleep(1000);
//		
//		getUiDevice().pressDPadDown();
		
		
//		// Simulate a click to bring up the All Apps screen.
//		allAppsButton.clickAndWaitForNewWindow();
//
//		// In the All Apps screen, the Settings app is located in
//		// the Apps tab. To simulate the user bringing up the Apps tab,
//		// we create a UiSelector to find a tab with the text
//		// label “Apps”.
//		UiObject appsTab = new UiObject(new UiSelector().text("Apps"));
//
//		// Simulate a click to enter the Apps tab.
//		appsTab.click();
//
//		// Next, in the apps tabs, we can simulate a user swiping until
//		// they come to the Settings app icon. Since the container view
//		// is scrollable, we can use a UiScrollable object.
//		UiScrollable appViews = new UiScrollable(
//				new UiSelector().scrollable(true));
//
//		// Set the swiping mode to horizontal (the default is vertical)
//		appViews.setAsHorizontalList();
//
//		// Create a UiSelector to find the Settings app and simulate
//		// a user click to launch the app.
//		UiObject settingsApp = appViews
//				.getChildByText(new UiSelector()
//						.className(android.widget.TextView.class.getName()),
//						"Settings");
//		settingsApp.clickAndWaitForNewWindow();
//
//		// Validate that the package name is the expected one
//		UiObject settingsValidation = new UiObject(
//				new UiSelector().packageName("com.android.settings"));
//		assertTrue("Unable to detect Settings", settingsValidation.exists());
	}
}
