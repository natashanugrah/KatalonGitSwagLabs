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

/**

* - Open Browser
* - Navigate to this URL: https://www.saucedemo.com/
* - Filled the credential username on this element: Object Repository/Page_Swag Labs/input_Swag Labs_user-name with variable from GlobalVariable.Username1
* - Fill the credential password on this element: Object Repository/Page_Swag Labs/input_Swag Labs_password with variable from GlobalVariable.Password2
* - Click the button: Object Repository/Page_Swag Labs/input_Swag Labs_login-button
* - Click this button: Object Repository/Page_Swag Labs/input_Swag Labs_add_to_cart_backpack-button
* - Click this element: Object Repository/Page_Swag Labs/a_Swag Labs_shopping_cart_link
* - Click this button:  Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Checkout
* - Fill this textfield: Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Checkout Your Information_firstName with value is 'testing'
* - Fill this textfield: Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Checkout Your Information_lastName with value is 'sha'
* - Fill this textfield: Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Checkout Your Information_postalCode with value is 'KT21219A'
* - Click this button: Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Cancel_continue
* - Then, click the cancel button: Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Cancel with timeout 20s
* - Close browser

*/
// Open the browser
WebUI.openBrowser('')

// Navigate to the specified URL
WebUI.navigateToUrl('https://www.saucedemo.com/')

// Fill the username credential using a global variable
WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_user-name'), GlobalVariable.Username1)

// Fill the password credential using a global variable
WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_password'), GlobalVariable.Password2)

// Click the login button
WebUI.click(findTestObject('Page_Swag Labs/input_Swag Labs_login-button'))

// Click the add to cart button for the backpack
WebUI.click(findTestObject('Page_Swag Labs/input_Swag Labs_add_to_cart_backpack-button'))

// Click the shopping cart link
WebUI.click(findTestObject('Page_Swag Labs/a_Swag Labs_shopping_cart_link'))

// Click the checkout button
WebUI.click(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Checkout'))

// Fill the first name text field with a static value
WebUI.setText(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Checkout Your Information_firstName'), 'testing')

// Fill the last name text field with a static value
WebUI.setText(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Checkout Your Information_lastName'), 'sha')

// Fill the postal code text field with a static value
WebUI.setText(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Checkout Your Information_postalCode'), 'KT21219A')

// Click the continue button
WebUI.click(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Cancel_continue'))

// Click the cancel button with a timeout of 20 seconds
WebUI.click(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Cancel'), FailureHandling.STOP_ON_FAILURE)

// Close the browser
WebUI.closeBrowser()