import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('OrangeHrm Test Case/OTC006_Change Password Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/h6_Update Password'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/h6_Update Password'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/button_Save'), 0)

WebUI.waitForElementVisible(findTestObject('OrangeHrm Pages/Page_OrangeHRM/button_Save'), 0)

WebUI.doubleClick(findTestObject('OrangeHrm Pages/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/span_Required'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/span_Required'), 0)

WebUI.click(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/span_Required_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/span_Required_1'), 0)

WebUI.click(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/span_Passwords do not match'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/span_Passwords do not match'), 
    0)

WebUI.closeBrowser()

