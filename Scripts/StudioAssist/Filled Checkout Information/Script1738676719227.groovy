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

* - Username: katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_user-name
* - Pasword: katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_password
* - Button login: Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_login-button
* - Image for the details product: katalon_asisst_ai_swagLabs/Page_Swag Labs/a_Name (A to Z)_item_4_img_link
* - Button add to cart: katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Add to cart_detailProduct_backpack
* - Button back to product: Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Back to products
* - Div cart element: katalon_asisst_ai_swagLabs/Page_Swag Labs/a_Swag Labs_shopping_cart_link 
* - Button checkout: katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Checkout
* - Div checkout information element: katalon_asisst_ai_swagLabs/Page_Swag Labs/div_Checkout Your Information
* - Button continue from checkout information: katalon_asisst_ai_swagLabs/Page_Swag Labs/input_continue_checkout_information
* - Div checkout overview: katalon_asisst_ai_swagLabs/Page_Swag Labs/div_Checkout Overview


Write me a script to perform these steps:
* - Find and call the 'Test Cases/StudioAssist/Checkout Information' with the variable 'GlobalVariable.Username1' as usernamd and 'GlobalVariable.Password2' as password
* - Fill the element 'katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Checkout Your Information_firstName' with value testing
* - Fill the element 'katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Checkout Your Information_lastName' with value sha
* - Fill the element 'katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Checkout Your Information_postalCode' with value KT1218
* - Click 'Button continue from checkout information' using 'com.test.swaglabs.studioAssist.StudioAssistKeyword.ClickElement' (String testObjectId) custom keyword
* - Verify this element is present: Div checkout overview with timeout 20s
* - Close Browser 


*/
String postalCode = 'KT1218'
String firstName = 'testing'
String lastName = 'sha'

// Call the test case for checkout information with username and password
WebUI.callTestCase(findTestCase('Test Cases/StudioAssist/Checkout Information'), [('username') : GlobalVariable.Username1
        , ('password') : GlobalVariable.Password2])

// Fill the first name field with the value 'testing'
WebUI.setText(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Checkout Your Information_firstName'), firstName)

// Fill the last name field with the value 'sha'
WebUI.setText(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Checkout Your Information_lastName'), lastName)

// Fill the postal code field with the value 'KT1218'
WebUI.setText(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Checkout Your Information_postalCode'), postalCode)

// Click the continue button from checkout information using the custom keyword
CustomKeywords.'com.test.swaglabs.studioAssist.StudioAssistKeyword.ClickElement'('katalon_asisst_ai_swagLabs/Page_Swag Labs/input_continue_checkout_information')

// Verify that the checkout overview element is present with a timeout of 20 seconds
WebUI.verifyElementPresent(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/div_Checkout Overview'), 20)

