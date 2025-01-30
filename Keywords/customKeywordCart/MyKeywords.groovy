package customKeywordCart

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MyKeywords {
	
	@Keyword
	def AddToCartAtoZ() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/span_Name (A to Z)Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)'), 0)
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/span_Name (A to Z)Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)'))
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_add_to_cart_backpack-button'))
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_add_to_cart_bikelight-button'))
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_add_to_cart_boltshirt-button'))
	}
}
