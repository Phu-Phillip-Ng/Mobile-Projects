package com.katalon.scrollcustom

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.MobileTestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import io.appium.java_client.FindsByIosClassChain;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import java.io.IOException;
import java.nio.file.Files;
import java.text.MessageFormat;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.kms.katalon.core.exception.StepFailedException;
import com.kms.katalon.core.logging.KeywordLogger;
import com.kms.katalon.core.mobile.common.MobileXPathBuilder;
import com.kms.katalon.core.mobile.constants.StringConstants;
import com.kms.katalon.core.mobile.driver.AppiumDriverSession;
import com.kms.katalon.core.mobile.driver.AppiumSessionCollector;
import com.kms.katalon.core.mobile.keyword.internal.AndroidProperties;
import com.kms.katalon.core.mobile.keyword.internal.GUIObject;

import com.kms.katalon.core.util.ConsoleCommandBuilder;
import com.kms.katalon.core.util.internal.ProcessUtil;

import internal.GlobalVariable


public class KatalonCustomScroll {
	@Keyword
	def scroll() {
		int device_Height = Mobile.getDeviceHeight()
		int device_Width = Mobile.getDeviceWidth()
		Mobile.comment('[INFO] Device height: ' + device_Height + " and width: " + device_Width )
		int startX = device_Width * 0.5
		int endX = device_Width * 0.5
		int startY = device_Height * 0.6
		int endY = device_Height * 0.1
		AppiumDriver<?> driver = MobileDriverFactory.getDriver()
		TouchAction swipe = new TouchAction(driver).press(PointOption.point(startX, startY))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300L))) //if you want to swipe longer you can increase the time
		swipe.moveTo(PointOption.point(endX, endY))
		swipe.release().perform();
	}
}

//public class KatalonCustomScroll {
//	@Keyword
//	def scroll() {
//		int device_Height = Mobile.getDeviceHeight()
//		int device_Width = Mobile.getDeviceWidth()
//		Mobile.comment('[INFO] Device height: ' + device_Height + " and width: " + device_Width )
//		int startX = (int) device_Width * 0.5
//		int endX = (int) device_Width * 0.5
//		int startY = (int) device_Height * 0.6
//		int endY = (int) device_Height * 0.1
//		AppiumDriver<?> driver = MobileDriverFactory.getDriver()
//		TouchAction swipe = new TouchAction(driver)
//		swipe.press(PointOption.point(startX, startY))
//				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
//				.moveTo(PointOption.point(endX, endY))
//				.release()
//				.perform();
//	}
//}
