import java.awt.print.Book

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.By.ByXPath
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class TestingFinAccel {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Open Gramedia")
	def navigateToHome() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl("https://www.gramedia.com/")
		WebUI.click(findTestObject('Object Repository/Page_Toko Buku Online Terbesar  Gramedia.com/span_'), FailureHandling.CONTINUE_ON_FAILURE)
	}


	@Then("Click Masuk")
	def clickMasuk() {
		WebUI.click(findTestObject('Object Repository/Page_Toko Buku Online Terbesar  Gramedia.com/button_Login'))
	}

	@Then("Click Daftar on Login Form")
	def clickDaftar() {
		WebUI.click(findTestObject('Object Repository/Page_Toko Buku Online Terbesar  Gramedia.com/button_Daftar'))
	}

	@When("Sign Up Input (.*) and Input (.*) and Input (.*) and checklist")
	def newSignUp (String name, String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_/input_Daftar_full_name'), name)
		WebUI.setText(findTestObject('Object Repository/Page_/input_Nama Lengkap_email'), email)
		WebUI.setText(findTestObject('Object Repository/Page_/input_Email_password'), password)
		WebUI.click(findTestObject('Object Repository/Page_/div_Kata Sandi_checkbox'))
	}

	@Then ("Click Daftar on SignUp Page")
	def signUp() {
		WebUI.click(findTestObject('Object Repository/Page_/button_Daftar'))
	}

	@When ("Login Input (.*) and Input (.*)")
	def inputLogin(String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_Toko Buku Online Terbesar  Gramedia.com/input_email'), email)
		WebUI.setText(findTestObject('Object Repository/Page_Toko Buku Online Terbesar  Gramedia.com/input_password'), password)
	}

	@Then ("Click Login on Login Page")
	def loginButton () {
		WebUI.click(findTestObject('Object Repository/Page_Toko Buku Online Terbesar  Gramedia.com/button_Login_LoginForm'))
	}

	@Given ("Search book (.*)")
	def searchBook(String booktitle) {
		WebUI.setText(findTestObject('Object Repository/Page_Toko Buku Online Terbesar  Gramedia.com/input_search'), booktitle)
		WebUI.sendKeys(findTestObject('Object Repository/Page_Toko Buku Online Terbesar  Gramedia.com/input_search'), Keys.chord(Keys.ENTER))
	}

	@When ("Pick the first product appear")
	def pickTheBook() {
		WebUI.click(findTestObject('Object Repository/Page_Toko Buku Online Terbesar  Gramedia.com/div_booktitle'))
	}

	@When ("Go to detail and choose Softcover")
	def detailBook() {
		WebUI.click(findTestObject('Object Repository/Page_Detail/p_Soft Cover'))
	}

	@Then ("Search store (.*)")
	def searchStore(String location){
		WebUI.setText(findTestObject('Object Repository/Page_Detail/input_store'), location)
	}

	@And ("Click the first store")
	def firstStore(){
		WebUI.click(findTestObject('Object Repository/Page_Detail/button_store'))
	}

	@When ("Click Keranjang")
	def addToCart() {
		WebUI.click(findTestObject('Object Repository/Page_Detail/button_Keranjang'))
	}

	@Then ("Successfull add to cart and see cart")
	def successATC() {
		WebUI.click(findTestObject('Object Repository/Page_Detail/button_Lihat Tas Belanja'))
	}
}