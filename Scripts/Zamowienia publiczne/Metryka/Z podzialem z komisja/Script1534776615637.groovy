import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('InZaMon/Page_E-Zamwienia/button_Nowe postpowanie'))

WebUI.setText(findTestObject('Object Repository/InZaMon/Page_E-Zamwienia/input_Number'), '556201-N-2018_M1')

WebUI.setText(findTestObject('Object Repository/InZaMon/Page_E-Zamwienia/input_Name'), 'Przetarg testowy')

WebUI.setText(findTestObject('Object Repository/InZaMon/Page_E-Zamwienia/textarea_Description'), '556201-N-2018 Metryka z podzialem z komisja')

WebUI.setText(findTestObject('Object Repository/InZaMon/Page_E-Zamwienia/input_description0'), 'Białystok')

WebUI.setText(findTestObject('Object Repository/InZaMon/Page_E-Zamwienia/input_normal ng-untouched ng-v'), '132000')

WebUI.waitForElementPresent(findTestObject('InZaMon/Page_E-Zamwienia/button_Dodaj'), 10)

WebUI.click(findTestObject('Object Repository/InZaMon/Page_E-Zamwienia/button_Dodaj'))

WebUI.setText(findTestObject('Object Repository/InZaMon/Page_E-Zamwienia/input_description1'), 'Kleosin')

WebUI.waitForElementPresent(findTestObject('InZaMon/Page_E-Zamwienia/input_description1'), 10)

WebUI.setText(findTestObject('Object Repository/InZaMon/Page_E-Zamwienia/input_normal ng-untouched ng-v_1'), '52800')

WebUI.click(findTestObject('InZaMon/Page_E-Zamwienia/button_Dodaj2'))

WebUI.waitForElementPresent(findTestObject('InZaMon/Page_E-Zamwienia/input_description2'), 10)

WebUI.setText(findTestObject('Object Repository/InZaMon/Page_E-Zamwienia/input_description2'), 'Grajewo')

WebUI.setText(findTestObject('InZaMon/Page_E-Zamwienia/input_normal ng-untouched ng-v2'), '28800')

WebUI.setText(findTestObject('Object Repository/InZaMon/Page_E-Zamwienia/input_person0'), 'P')

WebUI.click(findTestObject('Object Repository/InZaMon/Page_E-Zamwienia/a_Pastuka Robert'))

WebUI.waitForAngularLoad(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/InZaMon/Page_E-Zamwienia/select_Przewodniczcy'), '1', true)

WebUI.click(findTestObject('InZaMon/Page_E-Zamwienia/button_Dodaj3'))

WebUI.setText(findTestObject('Object Repository/InZaMon/Page_E-Zamwienia/input_person1'), 'B')

WebUI.click(findTestObject('Object Repository/InZaMon/Page_E-Zamwienia/a_Bana Maria'))

WebUI.selectOptionByValue(findTestObject('InZaMon/Page_E-Zamwienia/select_Przewodniczcy2'), '2', true)

WebUI.click(findTestObject('InZaMon/Page_E-Zamwienia/button_Dodaj4'))

WebUI.setText(findTestObject('Object Repository/InZaMon/Page_E-Zamwienia/input_person2'), 'K')

WebUI.click(findTestObject('Object Repository/InZaMon/Page_E-Zamwienia/a_Kalinowski Tadeusz'))

WebUI.selectOptionByValue(findTestObject('InZaMon/Page_E-Zamwienia/select_Przewodniczcy3'), '3', true)

WebUI.click(findTestObject('InZaMon/span_Zapisz nowe postepowanie'))

WebUI.click(findTestObject('InZaMon/h3_wejscie w metryke do edycji'), FailureHandling.STOP_ON_FAILURE)

