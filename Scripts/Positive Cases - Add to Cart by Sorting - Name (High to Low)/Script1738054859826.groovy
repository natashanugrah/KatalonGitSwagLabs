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
 * - Find and call the 'Test Cases/StudioAssist/Login by StudioAssist' with these credential: 'GlobalVariable.Username1' as usernamd and 'GlobalVariable.Password2' as password
 * - Click this element 'Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)'
 * - Then, click this element: 'Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/a_Price (high to low)_item_5_img_link'
 * - Click the button: 'Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/button_Add to cart_jacket'
 * - Click this button 'Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/button_Back Home'
 * - Close Browser
 */
// Call the test case for login with specified credentials
WebUI.callTestCase(findTestCase('Test Cases/StudioAssist/Login by StudioAssist'), 
    [('username') : GlobalVariable.Username1, 
     ('password') : GlobalVariable.Password2]) 

// Click on the sorting dropdown element
CustomKeywords.'com.test.swaglabs.sorting.Sorting.clickPriceHighToLow'()
WebUI.waitForAlert(3)
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)'))


// Click on the price sorting option
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/a_Price (high to low)_item_5_img_link'))

// Click the 'Add to cart' button for the selected item
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/button_Add to cart_jacket'))

// Click the 'Back Home' button
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/button_Back Home'))

// Close the browser
WebUI.closeBrowser()

