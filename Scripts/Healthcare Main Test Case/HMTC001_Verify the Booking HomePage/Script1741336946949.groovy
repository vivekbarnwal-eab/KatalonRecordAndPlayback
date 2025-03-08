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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/HealthCare/Page_CURA Healthcare Service/body_CURA Healthcare                       _fb9a78_1_2_3'))

WebUI.verifyTextPresent('CURA Healthcare Service', false)

WebUI.click(findTestObject('Object Repository/HealthCare/Page_CURA Healthcare Service/h3_We Care About Your Health'))

WebUI.verifyTextPresent('We Care About Your Health', false)

WebUI.verifyElementPresent(findTestObject('Object Repository/HealthCare/Page_CURA Healthcare Service/a_Make Appointment'), 
    0)

WebUI.verifyTextPresent('Make Appointment', false)

WebUI.click(findTestObject('Object Repository/HealthCare/Page_CURA Healthcare Service/p_Atlanta 550 Pharr Road NE Suite 525Atlant_8f4c85'))

WebUI.verifyElementPresent(findTestObject('HealthCare/Page_CURA Healthcare Service/p_Atlanta 550 Pharr Road NE Suite 525Atlant_8f4c85'), 
    0)

WebUI.click(findTestObject('Object Repository/HealthCare/Page_CURA Healthcare Service/a_infokatalon.com'))

WebUI.verifyElementPresent(findTestObject('HealthCare/Page_CURA Healthcare Service/a_infokatalon.com'), 0)

WebUI.click(findTestObject('Object Repository/HealthCare/Page_CURA Healthcare Service/p_Copyright  CURA Healthcare Service 2025'))

WebUI.verifyTextPresent('Copyright © CURA Healthcare Service 2025', false)

WebUI.closeBrowser()

