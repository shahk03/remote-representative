package com.bit.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import db.Datasource;
 dr;
public class datadriventest {
	@Test(dataProviderClass = Datasource.class, dataProvider = "dp")
	  public void f(String n, String s) {
	  }
	public void Softassert() {
		SoftAssert s=new SoftAssert();
		s.assertTrue(3>5);
		System.out.println("continue");
	}

}
