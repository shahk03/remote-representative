package com.bit.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    @BeforeMethod
  public void beforeMethod() {
    	System.out.println("bM");
  }

  @AfterMethod
  public void afterMethod(ITestResult r) {
	  System.out.println("aM");
	  if (r.getStatus()==ITestResult.FAILURE) {
		  System.out.println(r.getTestName()+ " is failed");
		  System.out.println("took screenshot, need to call from utility method");
	  }
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("bC");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("aC");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("bT");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aT");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("bS");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aS");
  }

}
