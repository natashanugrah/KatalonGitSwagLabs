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

/*
 * I have a list of test objects as below:
 * - Username: katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_user-name
 * - Pasword: katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_password
 * - Button login: Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_login-button
 * - Image for the details product: katalon_asisst_ai_swagLabs/Page_Swag Labs/a_Name (A to Z)_item_4_img_link
 * - Button add to cart: katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Add to cart_detailProduct_backpack
 * - Button back to product: Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Back to products
 * - Div cart element: katalon_asisst_ai_swagLabs/Page_Swag Labs/a_Swag Labs_shopping_cart_link
 
 
 I also have a URL: GlobalVariable.SiteURL, and two local variables 'Username1' and 'Password2'
 
 
 Write me a test case to perform the following steps:
 * 1. Open browser to the URL that stored in SiteURL
 * 2. Fill the username and password fields based on the variables
 * 3. Click the login button
 * 4. Click the image for the details product
 * 5. Click button add to cart
 * 6. Click button back to product
 * 7. Verify successfully redirect to mainhome with div cart element is exist
 * 8. Close the browser
 
 */
// Open the browser to the specified URL
WebUI.openBrowser(GlobalVariable.SiteURL)

// Set the username field with the value from Username1
WebUI.setText(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_user-name'), GlobalVariable.Username1)

// Set the password field with the value from Password2
WebUI.setText(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_password'), GlobalVariable.Password2)

// Click the login button
WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_login-button'))

// Click the image for the details product
WebUI.click(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/a_Name (A to Z)_item_4_img_link'))

// Click the button to add the product to the cart
WebUI.click(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Add to cart_detailProduct_backpack'))

// Click the button to go back to the product list
WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Back to products'))

// Verify that the cart element is present, indicating a successful redirect to the main home
WebUI.verifyElementPresent(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/a_Swag Labs_shopping_cart_link'), 10)

// Close the browser
WebUI.closeBrowser()

