package com.qa.guru99.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.guru99.config.Configpop;


public class TestBase {
	
public static WebDriver driver;


public  void IntialiZeBrowser(String env) {
	if(env.equalsIgnoreCase("prod")) {
		System.out.println("this is a prod env ");
	}
	if(Configpop.getBrowser().equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","D:\\Trainings\\Concepts\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Configpop.getUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}else if(Configpop.getBrowser().equalsIgnoreCase("firefox")) {
		
	}
	
}

public void loadconfig() throws FileNotFoundException, IOException {
	Properties prop = new Properties();
	prop.load(new FileInputStream(new File("D:\\Work\\All Coding\\javaLearnings\\MAYJUNECucumberPOM\\src\\test\\java\\Resources\\GlobalProperties.properties")));
	Configpop.setUrl(prop.getProperty("url"));
	Configpop.setBrowser(prop.getProperty("browser"));
	
}
/*
public void reportSetup() {
	report= new ExtentReports("D:\\Work\\All Coding\\javaLearnings\\MAYJUNECucumberPOM\\test-output\\automation.html");
	test= report.startTest("Testing a feature","to testa application desc");
}

public void reportTearDown() {
	report.flush();
}
*/
}
