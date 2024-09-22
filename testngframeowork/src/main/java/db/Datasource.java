package db;

import org.testng.annotations.DataProvider;

public class Datasource {
	 @DataProvider
	  public Object[][] dp() {
	    //return new Object[][] {
	     // new Object[] { 1, "a" },
	   //   new Object[] { 2, "b" },
		 Object [][] o=new Object [2][2];
		 o [0][0] ="user 1";
		 o [1][0] ="user 2";
		 o [1][1] ="first 2";
		 return o;
		    
	    
}
}