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

WebUI.navigateToUrl('https://www.airbnb.co.in/')

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Airbnb  Holiday rentals, cabins, beach_81905a/label_Where'))

WebUI.setText(findTestObject('Object Repository/Airbnb Pages/Page_Airbnb  Holiday rentals, cabins, beach_81905a/input_Where_query'), 
    city)

WebUI.click(findTestObject('Airbnb Pages/Page_Airbnb  Holiday rentals, cabins, beach_81905a/div_Goa'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Airbnb  Holiday rentals, cabins, beach_81905a/button_31'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Airbnb  Holiday rentals, cabins, beach_81905a/button_1'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Airbnb  Holiday rentals, cabins, beach_81905a/span_Add guests_t1dqvypu atm_9s_1ulexfb atm_023ad9'))

WebUI.click(findTestObject('Object Repository/Airbnb Pages/Page_Airbnb  Goa  Holiday Rentals  Places t_e7f105/span_Over 1,000 places'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Airbnb Pages/Page_Airbnb  Goa  Holiday Rentals  Places t_e7f105/h1_Search results Over 1,000 placesOver 1,0_eb4c99'), 
    0)

WebUI.verifyTextPresent(expectedResult, false)

WebUI.closeBrowser()

