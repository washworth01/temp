package com.ashworth.selenium.seleniumExcercises;

import com.ashworth.selenium.seleniumSpreadSheet.*;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class AppTest 
{

	WebElement element;
	WebDriver cDriver;
	WebDriver fDriver;
	public ExtentReports report;
	public ExtentTest test;
	
	@Before
	public void setup() {
    	System.setProperty(Constants.CHROMEWEBDRIVER,Constants.CHROMEWEBDRIVERLOCATION);
    	cDriver = new ChromeDriver();
    	cDriver.manage().window().maximize();
    	
    	System.setProperty(Constants.FIREFOXWEBDRIVER,Constants.FIREFOXWEBDRIVERLOCATION);
    	fDriver = new FirefoxDriver();
    	fDriver.manage().window().maximize();
	}
	
	@Test
    public void createAndCheckUsers() throws InvalidFormatException, IOException, InterruptedException {
		
		report = new ExtentReports(Constants.REPORTLOCATION, true);
		test = report.startTest("Verify adding all users and logging in works");
		
		cDriver.get(Constants.LANDINGPAGEURL);
		test.log(LogStatus.INFO, "Chrome started..");
		fDriver.get(Constants.LANDINGPAGEURL);
		test.log(LogStatus.INFO, "Firefox started..");
		
		ExcelUtils.setExcelFile(Constants.TESTDATALOCATION+Constants.TESTDATAFILE,0);
		int i = 0;
		String result = "";
		
		for(i=0; i<ExcelUtils.getExcelWSheet().getPhysicalNumberOfRows(); i++) {
			
			ExcelUtils.setCellData(ExcelUtils.getCellData(i,0), i, 4);
			
			if(ExcelUtils.getCellData(i,0)=="Chrome") {
			
			test.log(LogStatus.INFO, "Navigating to the add user section..");
			LandingPage landingPage = PageFactory.initElements(cDriver, LandingPage.class);
			landingPage.clickAddUser();
			test.log(LogStatus.INFO, "Navigation complete!");
			
			String userName=ExcelUtils.getCellData(i,1);
			String passWord=ExcelUtils.getCellData(i,2);
			
			test.log(LogStatus.INFO, "Adding user to the DB..");
			AddUserPage AddUserPage = PageFactory.initElements(cDriver, AddUserPage.class);
			AddUserPage.AddUsers(userName, passWord);
			test.log(LogStatus.INFO, "Adding complete!");
			
			test.log(LogStatus.INFO, "Logging in to the new user..");
			LoginPage LoginPage = PageFactory.initElements(cDriver, LoginPage.class);
			result = LoginPage.Login(userName, passWord);
			test.log(LogStatus.INFO, "Login complete!");
			}
			
			else {
			test.log(LogStatus.INFO, "Navigating to the add user section..");
			LandingPage landingPage = PageFactory.initElements(fDriver, LandingPage.class);
			landingPage.clickAddUser();
			test.log(LogStatus.INFO, "Navigation complete!");
				
			String userName=ExcelUtils.getCellData(i,1);
			String passWord=ExcelUtils.getCellData(i,2);
				
			test.log(LogStatus.INFO, "Adding user to the DB..");
			AddUserPage AddUserPage = PageFactory.initElements(fDriver, AddUserPage.class);
			AddUserPage.AddUsers(userName, passWord);
			test.log(LogStatus.INFO, "Adding complete!");
				
			test.log(LogStatus.INFO, "Logging in to the new user..");
			LoginPage LoginPage = PageFactory.initElements(fDriver, LoginPage.class);
			result = LoginPage.Login(userName, passWord);
			test.log(LogStatus.INFO, "Login complete!");
			}
			
			assertEquals("Result should be Successful Login", "**Successful Login**", result);
			test.log(LogStatus.PASS, "Result should be Successful Login | Expected: " + "**Successful Login**" + " | Actual: " + result);
			
			ExcelUtils.setCellData(result, i, 3);
		}
		
		test.log(LogStatus.PASS, "All tests complete!");
		
	}
	
	@After
	public void end() {
		report.endTest(test);
		report.flush();
		cDriver.quit();
		fDriver.quit();
	}
	
}
