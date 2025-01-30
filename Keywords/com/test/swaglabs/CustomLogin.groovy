package com.test.swaglabs

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

public class CustomLogin {

	@Keyword
	def printName() {
		println("Username: standard_user ")
	}


	@Keyword
	def printUsername(String username) {
		println("\n 			Hello"+ "  " + username +"		....\n")
	}


	@Keyword
	def WebLoginFirstAccount() {
		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button'))
	}


	@Keyword
	def WebLoginSecondAccount() {
		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'), 'locked_out_user')
		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'), 'secret_sauce')
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button'))
	}
	
	
	@Keyword
	def WebLoginThirdAccount() {
		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'), 'problem_user')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button'))
	}
	
	
	@Keyword
	def WebLoginFourthAccount() {
		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'), 'performance_glitch_user')
		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'), 'secret_sauce')
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button'))
	}
	
	
	@Keyword
	def WebLoginFifthAccount() {
		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'), 'error_user')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button'))
	}
	
	
	@Keyword
	def WebLoginSixthAccount() {
		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'), 'visual_user')
		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'), 'secret_sauce')
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button'))
	}
	
}
