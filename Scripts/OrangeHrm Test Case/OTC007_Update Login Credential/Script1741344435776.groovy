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

WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/h6_PIM'), 0)

WebUI.click(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/h6_PIM'))

WebUI.click(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/input_oxd-input oxd-input-active'))

WebUI.setEncryptedText(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/input_oxd-input oxd-input-active'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/input_oxd-input oxd-input-active_1'))

WebUI.setEncryptedText(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/input_oxd-input oxd-input-active_1'), 
    'hUKwJTbofgPrePvDxiBe5w==')

WebUI.click(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/input_oxd-input oxd-input-active_1_2'))

WebUI.setEncryptedText(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/input_oxd-input oxd-input-active_1_2'), 
    'hUKwJTbofgPrePvDxiBe5w==')

WebUI.click(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/div_Success'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHrm Pages/Page_OrangeHRM/div_SuccessSuccessfully Saved'), 
    0)

WebUI.closeBrowser()

