import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('D:\\SmartDelta_v_1.0.30.63_LIVE.apk', true)

Mobile.tap(findTestObject('Allow_button'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.widget.EditText'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.widget.EditText (1)'), '9825479404')

Mobile.tap(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.widget.Button'), 0)

Mobile.delay(10)

Mobile.sendKeys(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.widget.EditText (2)'), '123')

Mobile.tap(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Analytics'), 0)

Mobile.delay(10)

Mobile.scrollToText('IV analysis', FailureHandling.OPTIONAL)

Mobile.scrollToText('Pivot', FailureHandling.OPTIONAL)

//CustomKeywords.'com.katalon.scrollcustom.KatalonCustomScroll.scroll'()
//Mobile.swipe(0, 1700, 0, 500, FailureHandling.CONTINUE_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.view.View (2)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.view.View (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.widget.Button (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.view.View (4)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.view.View (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.widget.Button (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.view.View (6)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.view.View (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.view.View (8)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.view.View (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.view.View (9)'), 0)

Mobile.tap(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.view.View (11)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.view.View (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.view.View (13)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.view.View (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Hints_New/Straddle_VWAP_23/android.widget.ImageView (2)'), 0)

Mobile.closeApplication()

