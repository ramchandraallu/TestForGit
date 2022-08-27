package com.qa.guru99.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.qa.guru99.Base.TestBase;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)

@CucumberOptions(  
features="src\\test\\resources\\features",
glue= {"com\\qa\\guru99\\stepdefs"},
monochrome = true,
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags= "",	
dryRun=false
)

public class Runner extends AbstractTestNGCucumberTests {
	
	
	static TestBase ref;
	@BeforeSuite
	@Parameters({"env"})
	public static void setup(String env) throws FileNotFoundException, IOException {
		ref= new TestBase();
		//ref.reportSetup();
		ref.loadconfig();
		ref.IntialiZeBrowser(env);
	
	}
	
	@AfterSuite
	public static void Down() {
		//ref.reportTearDown();
	}
}
