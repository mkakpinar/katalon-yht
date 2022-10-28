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

WebUI.navigateToUrl('https://ebilet.tcddtasimacilik.gov.tr/view/eybis/tnmGenel/tcddWebContent.jsf')

WebUI.setText(findTestObject('Object Repository/asdnew/Page_TCDD Tamaclk A/input_Rezervasyon_nereden'), 'Polatlı YHT')

WebUI.setText(findTestObject('Object Repository/asdnew/Page_TCDD Tamaclk A/input_Gidi-Dn_nereye'), 'İzmit YHT')

WebUI.setText(findTestObject('Object Repository/asdnew/Page_TCDD Tamaclk A/input_Rezervasyon_trCalGid_input'), '28.10.2022')

WebUI.click(findTestObject('Object Repository/asdnew/Page_TCDD Tamaclk A/body_Ltfen Bekleyiniz.var context   var lis_060e9c'))

WebUI.click(findTestObject('Object Repository/asdnew/Page_TCDD Tamaclk A/span_Ara'))

WebUI.delay(2)

urlmatch = WebUI.verifyMatch(WebUI.getUrl(), 'https://ebilet.tcddtasimacilik.gov.tr/view/eybis/tnmGenel/tcddWebContent.jsf?expired=true', 
    false, FailureHandling.OPTIONAL)

if (urlmatch == true) {
    WebUI.navigateToUrl('https://ebilet.tcddtasimacilik.gov.tr/view/eybis/tnmGenel/tcddWebContent.jsf')

    WebUI.setText(findTestObject('Object Repository/asdnew/Page_TCDD Tamaclk A/input_Rezervasyon_nereden'), 'Polatlı YHT')

    WebUI.setText(findTestObject('Object Repository/asdnew/Page_TCDD Tamaclk A/input_Gidi-Dn_nereye'), 'İzmit YHT')

    WebUI.setText(findTestObject('Object Repository/asdnew/Page_TCDD Tamaclk A/input_Rezervasyon_trCalGid_input'), '28.10.2022')

    WebUI.click(findTestObject('Object Repository/asdnew/Page_TCDD Tamaclk A/body_Ltfen Bekleyiniz.var context   var lis_060e9c'))

    WebUI.click(findTestObject('Object Repository/asdnew/Page_TCDD Tamaclk A/span_Ara'))
}

WebUI.delay(5)

try {
	WebUI.verifyElementText(findTestObject('Page_TCDD Tamaclk A/new_14'), '2+2 Pulman (Ekonomi) (0)')
	
}
catch (Exception e) {
    WS.sendRequest(findTestObject('telegram request'))
} 
finally { 
    WebUI.closeBrowser()
}


