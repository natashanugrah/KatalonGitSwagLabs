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

// Open browser to the URL that stored in SiteURL
WebUI.openBrowser(GlobalVariable.SiteURL)

// Fill the username field based on the variable Username1
WebUI.setText(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_user-name'), GlobalVariable.Username1)

// Fill the password field based on the variable Password2
WebUI.setText(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_password'), GlobalVariable.Password2)

// Click the login button
WebUI.click(findTestObject('katalon_asisst_ai_swagLabs/Page_Swag Labs/input_Swag Labs_login-button'))

// Click the image for the details product
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/a_Add to cart_item_0_img_link_bike'))

// Click button add to cart
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/button_Add to cart_detailedBike'))

// Click button back to product
WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Back to products'))

CustomKeywords.'com.test.swaglabs.studioAssist.StudioAssistKeyword.ClickElement'('Object Repository/Page_Swag Labs/a_Swag Labs_shopping_cart_link')

CustomKeywords.'com.test.swaglabs.studioAssist.StudioAssistKeyword.ClickElement'('Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/button_Remove_bikelight')