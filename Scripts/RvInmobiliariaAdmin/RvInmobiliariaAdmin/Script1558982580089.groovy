import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://rv.sitioweb.doctusdev.com/admin')

WebUI.setText(findTestObject('Object Repository/Page_Iniciar Sesin/input_Usuario_UserName'), 'wotalvaro')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar Sesin/input_Contrasea_Password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Iniciar Sesin/input_Olvid mi contrasea_btn btn-default'))

WebUI.click(findTestObject('Object Repository/Page_ADMIN - Bienvenido/a_wotalvaro'))

WebUI.click(findTestObject('Object Repository/Page_ADMIN - Bienvenido/a_Cerrar Sesin'))

WebUI.closeBrowser()

