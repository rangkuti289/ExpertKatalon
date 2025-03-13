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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/svg'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Forms'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Forms'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/li_Practice Form'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Name_firstName'), 'Yusuf')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Name_lastName'), 'Rangkuti')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Email_userEmail'), 'claysystemhack@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_(10 Digits)_userNumber'), '0896784788')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), '13 Mar 2025')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEMOQA/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEMOQA/select_190019011902190319041905190619071908_246ee1'), 
    '2000', true)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_31'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Subjects_subjectsInput'), '')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/input_Subjects_subjectsInput'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Subjects_subjectsInput'), 's')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_English'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Sports'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/textarea_Current Address_currentAddress'), 'PONDOK BAMBU')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Select State'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_NCR'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Select City'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Noida'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Close'))

