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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('KatalonDboard/Sign_Up_Screen/input_fullname'))

WebUI.setText(findTestObject('KatalonDboard/Sign_Up_Screen/input_fullname'), findTestData('com.data').getValue(1, 1))

def mail = WebUI.click(findTestObject('KatalonDboard/Sign_Up_Screen/input_business_email'))

WebUI.setText(findTestObject('KatalonDboard/Sign_Up_Screen/input_business_email'), findTestData('com.data').getValue(2, 
        1))

//def one = WebUI.verifyElementText('KatalonDboard/Sign_Up_Screen/input_business_email', "Sorry, this email has been registered")
//def two = WebUI.verifyElementText('KatalonDboard/Sign_Up_Screen/input_business_email', "Valid email is required to activate products")
assert findTestData('com.data').getValue(2, 1)

WebUI.click(findTestObject('KatalonDboard/Sign_Up_Screen/input_Password'))

WebUI.setText(findTestObject('KatalonDboard/Sign_Up_Screen/input_Password'), findTestData('com.data').getValue(3, 1))

WebUI.click(findTestObject('KatalonDboard/Sign_Up_Screen/input_Terms of Use_signup-btn'))

//def mail1 = WebUI.click(findTestObject('KatalonDboard/Sign_Up_Screen/input_business_email'))
//def one = WebUI.verifyElementText('KatalonDboard/Sign_Up_Screen/input_business_email', 'Sorry, this email has been registered')

//def two = WebUI.verifyElementText('KatalonDboard/Sign_Up_Screen/input_business_email', 'Valid email is required to activate products')

/*if (mail.equals(one)) {
    println('Email Already Registered')
}

if (mail.equals(two)) {
    println('Enter Valid Email')
}
*/
