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
 
 Write me a script to perform these steps:
 * - Find and call the 'Test Cases/StudioAssist/Create the purchase' with the variable 'GlobalVariable.Username1' as usernamd and 'GlobalVariable.Password2' as password
 * - Click 'Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Cancel_continue' using 'com.test.swaglabs.studioAssist.StudioAssistKeyword.ClickElement' (String testObjectId) custom keyword
 * - Click this button 'Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Continue Shopping'
 * - Verify this element is present 'Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/div_ProductsName (A to Z)Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)' with timeout 20s
 * - Close Browser
 * 
 
 */
// Find and call the 'Test Cases/StudioAssist/Create the purchase' with the variable 'GlobalVariable.Username1' as username and 'GlobalVariable.Password2' as password
WebUI.callTestCase(findTestCase('Test Cases/StudioAssist/Checkout Information'), 
    [('username') : GlobalVariable.Username1, ('password') : GlobalVariable.Password2]) 

// Click the specified element using the custom keyword
CustomKeywords.'com.test.swaglabs.studioAssist.StudioAssistKeyword.ClickElement'('katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Cancel')

// Clicks the button to continue shopping
WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Continue Shopping'))

// Verify that the specified element is present with a timeout of 20 seconds
WebUI.verifyElementPresent(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/div_ProductsName (A to Z)Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)'), 20)

// Close the browser
WebUI.closeBrowser()