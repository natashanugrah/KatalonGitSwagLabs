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

/* Write a Katalon Studio Test Case to perform the following steps:
 
 1. Open a browser to the URL stored in the GlobalVariable.SiteURL
 2. Input the username 'Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_user-name' with the value of GlobalVariable.Username1
 3. Input the password 'Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_password' with the value of GlobalVariable.Password
 4. Click login button with the id 'Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_login-button'
 5. Verify that this element is exist 'Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/div_ProductsName (A to Z)Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)'
 6. Click first product to see the details 'Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/a_Name (A to Z)_item_4_img_link'
 7. Click button 'Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Add to cart_backpack'
 8. Then, back to mainhome with 'Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Back to products'
 9. Close the browser
 
*/ 


// Open a browser to the URL stored in the GlobalVariable.SiteURL
WebUI.openBrowser(GlobalVariable.SiteURL)

// Input the username with the value of GlobalVariable.Username1
WebUI.setText(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_user-name'), GlobalVariable.Username1)

// Input the password with the value of GlobalVariable.Password2
WebUI.setText(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_password'), GlobalVariable.Password2)

// Click login button
WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_login-button'))

// Verify that the products element exists
WebUI.verifyElementPresent(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/div_ProductsName (A to Z)Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)'), 10)

// Click first product to see the details
WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/a_Name (A to Z)_item_4_img_link'))

// Click button to add the product to the cart
WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Add to cart_backpack'))

// Back to main home
WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Back to products'))

// Close the browser
WebUI.closeBrowser()
 
