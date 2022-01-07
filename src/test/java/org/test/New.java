package org.test;

import java.sql.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class New {

	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Browser config and launching...");
		
}
	
    @AfterClass
	
	public void afterclass() {
		System.out.println("closing the browser....");
	}

	@Before
	public void beforeEachmethod() {
		System.out.println("Before each method....");
		Date d= new Date(0);
		System.out.println(d);
	}
	
	@After
	
	public void afterEachmethod() {
		System.out.println("After each method...");
		Date d= new Date(0);
	}

	
}