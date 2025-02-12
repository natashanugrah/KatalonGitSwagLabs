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

UseCase 1: Listing out actions as steps in plain english language

1. Open a browser with GlobalVariable.SiteURL
2. Input text on 'Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_user-name' by value from GlobalVariable.Username1
3. Input password on  'Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_password' by value from GlobalVariable.Password2
4. Click button login with 'Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_login-button'
5. Verify this element 'Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/div_ProductsName (A to Z)Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)' is present with timeout 10s
6. Close browser

*/ 


// Open a browser with the specified URL
WebUI.openBrowser(GlobalVariable.SiteURL)

// Input text for username field
WebUI.setText(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_user-name'), GlobalVariable.Username1)

// Input password for password field
WebUI.setText(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_password'), GlobalVariable.Password2)

// Click the login button
WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_login-button'))

// Verify that the specified element is present with a timeout of 10 seconds
WebUI.verifyElementPresent(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/div_ProductsName (A to Z)Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)'), 10)

// Close the browser
WebUI.closeBrowser()






