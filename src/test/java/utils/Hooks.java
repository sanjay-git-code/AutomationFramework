package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	  @Before
	    public static void setUp() {
	 
	       BaseClass.setUpDriver();
	    }
	     
	    @After
	    public static void tearDown() {
	     
	    	BaseClass.tearDown();
	    }
}
