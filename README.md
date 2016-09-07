#Assignment_2 Automation of web application testing using Selenium and Cucumber using BDD/TDD

Description
-----------

"WebAppTestAutomation" project will automate the web application testing using Selenium and Cucumber frameworks

Dependencies
------------
The following components / technologies are used in developing the app
•	Java 8
•	Selenium 2.53.0
• Firefox Selenium Web Driver 
• Maven
•	Junit 4.12
•	Cucumber 1.2.4
•	Gherkin 2.12.2	
•	Eclipse 

Steps to launch the Application
-------------------------------
1. Download the zip file from the GIT repository  https://github.com/vdevireddy2/Vodafone_Assignment_2.git and extract the zip file to a folder
2. Open Eclipse and import 'Existing maven project' by pointing to the downloaded project folder
3. The project will be imported and automatically the dependent jars will be downloaded by Maven
4. In order to run this project, we need a Firefox browser installed on the machine.
  

Test cases
-----------
The Gherkin feature file for login test scenario is under the directory 'WebAppTestAutomation\src-test-resources\features’
The test cases are available under the directory ‘WebAppTestAutomation\src-test-java’
To run the test cases, open the 'TestRunner.Java' class under 'WebAppTestAutomation\src-test-java’ folder, select "Run as JUnit Tests"




A sample console prints when I run in my systems is as follows:


Feature: Test login
Entering: I open the Vodafone website
username:: vis
password:: vis
Directing browser to:http://www.vodafone.co.nz
Directing browser to My Vodafone:My Vodafone
Directing browser to Login:My Vodafone
Command duration or timeout: 2.10 seconds
For documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html
Build info: version: '2.53.0', revision: '35ae25b1534ae328c771e0856c93e187490ca824', time: '2016-03-15 10:43:46'
System info: host: 'DEVIREDDYs', ip: '192.168.1.123', os.name: 'Windows 10', os.arch: 'amd64', os.version: '10.0', java.version: '1.8.0_66'
Driver info: org.openqa.selenium.firefox.FirefoxDriver
Capabilities [{applicationCacheEnabled=true, rotatable=false, handlesAlerts=true, databaseEnabled=true, version=42.0, platform=WINDOWS, nativeEvents=false, acceptSslCerts=true, webStorageEnabled=true, locationContextEnabled=true, browserName=firefox, takesScreenshot=true, javascriptEnabled=true, cssSelectorsEnabled=true}]
Session ID: c8b90e03-b182-4eec-ad2a-6f692a4b8231
*** Element info: {Using=xpath, value=//div//a[text()='Login']}
Trying to login
Getting Response
The response message is Your email address is not registered for My Vodafone.

  Scenario: Login Failure[90m# login.feature:3[0m
    [32mGiven[0m[32mI open the Vodafone website[0m[90m# WebsiteAutomationSteps.given_I_navigate_to_the_vodafone_url()[0m
    [32mWhen [0m[32mI navigate to MyVodafone page[0m            [90m# WebsiteAutomationSteps.when_I_navigate_to_MyVodafone_page()[0m
    [32mAnd [0m[32mI navigate to Login page[0m                  [90m# WebsiteAutomationSteps.navigate_to_Login_page()[0m
    [32mAnd [0m[32mI try to login with invalid credentials[0m   [90m# WebsiteAutomationSteps.login_to_myvodafone_with_invalid_credentials()[0m
    [32mThen [0m[32mI should see the following error message[0m [90m# WebsiteAutomationSteps.then_I_Should_get_error_message(String)[0m
      """
      Your email address is not registered for My Vodafone.
      """

1 Scenarios ([32m1 passed[0m)
5 Steps ([32m5 passed[0m)
1m2.704s

Closing the browser
