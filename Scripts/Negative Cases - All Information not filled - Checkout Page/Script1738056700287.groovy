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

Write me a test cases based on this steps:
* - Find and call the 'Test Cases/StudioAssist/Checkout Information' with the variable 'GlobalVariable.Username1' as usernamd and 'GlobalVariable.Password2' as password
* - Click button: Object Repository/Page_Swag Labs/Page_Swag Labs/input_Cancel_continue
* - Make sure showing this element:  Object Repository/Page_Swag Labs/Page_Swag Labs/div_Error First Name is required
* - Close Browser 

*/
// Call the test case 'Checkout Information' with specified username and password
WebUI.callTestCase(findTestCase('Test Cases/StudioAssist/Checkout Information'), 
    [('username') : GlobalVariable.Username1, ('password') : GlobalVariable.Password2]) 

// Click the cancel button on the page
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/input_Cancel_continue')) 

// Verify that the error message for first name is displayed
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/div_Error First Name is required'), 
    10) 

// Close the browser
WebUI.closeBrowser()