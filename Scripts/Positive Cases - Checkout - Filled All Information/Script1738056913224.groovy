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


WebUI.openBrowser('') // Opens a new browser instance
WebUI.navigateToUrl('https://www.saucedemo.com/') // Navigates to the specified URL

WebUI.setText(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user') // Sets the username in the input field
WebUI.setEncryptedText(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==') // Sets the encrypted password in the input field

WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_login-button')) // Clicks the login button

WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Add to cart')) // Clicks the first "Add to cart" button
WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Add to cart_1')) // Clicks the second "Add to cart" button
WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Add to cart_1_2')) // Clicks the third "Add to cart" button

WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/a_3')) // Clicks on the cart icon to view items
WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Checkout')) // Clicks the checkout button

WebUI.setText(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Checkout Your Information_firstName'), 'testing') // Sets the first name in the checkout form
WebUI.setText(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Checkout Your Information_lastName'), 'sha') // Sets the last name in the checkout form
WebUI.setText(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Checkout Your Information_postalCode'), '1556789AB') // Sets the postal code in the checkout form

WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Cancel_continue')) // Clicks the continue button to proceed with checkout

WebUI.closeBrowser() // Closes the browser instance

