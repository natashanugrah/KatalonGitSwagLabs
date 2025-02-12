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

WebUI.callTestCase(findTestCase('Test Cases/StudioAssist/Add to Cart from Detailed Product'), [('username') : GlobalVariable.Username1
        , ('password') : GlobalVariable.Password2])


WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/a_Add to cart_item_0_img_link_bike'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/button_Add to cart_detailedBike'))

WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Back to products'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/a_Remove_item_1_img_link_tshirt'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/button_Add to cart_detailedShirt'))

WebUI.click(findTestObject('Object Repository/katalon_asisst_ai_swagLabs/Page_Swag Labs/button_Back to products'))

CustomKeywords.'com.test.swaglabs.studioAssist.StudioAssistKeyword.ClickElement'('Object Repository/Page_Swag Labs/a_Swag Labs_shopping_cart_link')

CustomKeywords.'com.test.swaglabs.studioAssist.StudioAssistKeyword.ClickElement'('Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/button_Remove_backpack')

CustomKeywords.'com.test.swaglabs.studioAssist.StudioAssistKeyword.ClickElement'('Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/button_Remove_bikelight')

CustomKeywords.'com.test.swaglabs.studioAssist.StudioAssistKeyword.ClickElement'('Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/button_Remove_tshirt')
      /*
      *  Automate the process of adding and removing items from a shopping cart.
      *
      *  1. Call a test case to log in using provided username and password.
      *  2. Click on the image link of a bike to add it to the cart.
      *  3. Click the button to add the detailed bike to the cart.
      *  4. Navigate back to the products page.
      *  5. Click on the remove link for a t-shirt item.
      *  6. Click the button to add the detailed shirt to the cart.
      *  7. Navigate back to the products page again.
      *  8. Click on the shopping cart link to view the cart.
      *  9. Remove the backpack from the cart.
      *  10. Remove the bike light from the cart.
      *  11. Remove the t-shirt from the cart.
      *
      */

// CustomKeywords.'com.test.swaglabs.studioAssist.StudioAssistKeyword.ClickElement'('Object Repository/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/Page_Swag Labs/button_Add to cart')

