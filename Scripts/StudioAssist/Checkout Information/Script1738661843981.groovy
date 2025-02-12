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

/** Use Case 3: This use case is generating script that calls other scripts using StudioAssist
* - Username: katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_user-name
* - Pasword: katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_password
* - Button login: Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_login-button
* - Image for the details product: katalon_asisst_ai_swagLabs/Page_Swag Labs/a_Name (A to Z)_item_4_img_link
* - Button add to cart: katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Add to cart_detailProduct_backpack
* - Button back to product: Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Back to products
* - Div cart element: katalon_asisst_ai_swagLabs/Page_Swag Labs/a_Swag Labs_shopping_cart_link 
* - Button checkout: katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Checkout
* - Div checkout information element: katalon_asisst_ai_swagLabs/Page_Swag Labs/div_Checkout Your Information


Write me a script to perform these steps:
* - Find and call the 'Test Cases/StudioAssist/Add to Cart from Detailed Product' with the variable 'GlobalVariable.Username1' as usernamd and 'GlobalVariable.Password2' as password
* - Click div cart element
* - Scroll down and click button checkout
* - Verify div checkout information element is present with timeout 15s
* - Close Browser 

*/


// Find and call the specified test case with the provided username and password
WebUI.callTestCase(findTestCase('Test Cases/StudioAssist/Add to Cart from Detailed Product'), 
    [('username') : GlobalVariable.Username1, ('password') : GlobalVariable.Password2]) 

// Click on the shopping cart element
WebUI.click(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/Page_Swag Labs/a_1')) 

// Scroll down to the checkout button and click it
WebUI.scrollToElement(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Checkout'), 5) 
WebUI.click(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Checkout')) 

// Verify that the checkout information div is present with a timeout of 15 seconds
WebUI.verifyElementPresent(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/div_Checkout Your Information'), 15) 

// Close the browser
// WebUI.closeBrowser()


// Can't closeBrowser due to this test cases will be implemented on another test cases




