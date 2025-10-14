import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys
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

WebUI.openBrowser('https://www.unileverfoodsolutions.com.vn/vi.html')

WebUI.click(findTestObject('Google Page/searchBox'))

WebUI.setText(findTestObject('Google Page/searchBox'), 'abc')

WebUI.sendKeys(findTestObject('Google Page/searchBox'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.mouseOver(findTestObject('Google Page/input_query'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Google Page/inputEmail'))

WebUI.setText(findTestObject('Google Page/inputEmail'), 'thiethuynh@gmail.com')

WebUI.click(findTestObject('Google Page/password'))

WebUI.setText(findTestObject('Google Page/password'), 'thiethuynh123@')

WebUI.closeBrowser()

