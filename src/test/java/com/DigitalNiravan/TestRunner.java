package com.DigitalNiravan;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


@Listeners(com.DigitalNiravan.Listeners.class)
public class TestRunner extends StepDefinitionClass {
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public Login l = new Login();
	
	
	@BeforeTest
	public void setExtent()
	{
		htmlReporter=new ExtentHtmlReporter("C:\\Users\\dorababu.c\\eclipse-workspace\\TestResource\\Report\\myReport.html");
		
		htmlReporter.config().setDocumentTitle("Automation Report");// Title of the report
		htmlReporter.config().setReportName("Functional Report");//Name of the report
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Hostname", "LocalHost");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Tester Name", "Dorababu");
		extent.setSystemInfo("Browser", "Chrome");
		
	}
	
	@AfterTest
	public void endReport()
	{
		extent.flush();
	}
	
	
	
	@BeforeClass
	private void OpenBrowser() {

		
		// TODO Auto-generated method stub
		getDriver();
		maxwin();
	}
	
	@Test
	private void tc1() throws InterruptedException {
		// TODO Auto-generated method stub
		geturl();
		staticwait();
		
		test=extent.createTest("BrowserLunch with given URL");
	}
	@Test
	private void tc2() {
		
		test=extent.createTest("Send testdate with given Creditionals");
		// TODO Auto-generated method stu
//		javaexcutor(l.getUsername());
//		javaexcutor(l.getPassword());
		System.out.println("test 2 passed");
		
	}

	@Test
	private void tc3() {
		// TODO Auto-generated method stub
//		javaexcutorclick(l.getSignin());
		test=extent.createTest("Login Button with given Creditionals");
		System.out.println("test 3 passed");
	}	
	
	@AfterClass
	private void closebrowser() {
		// TODO Auto-generated method stub
		closebrow();
	}
}
