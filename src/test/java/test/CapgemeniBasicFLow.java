package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CapgemeniBasicFLow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Concepts\\Automation\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.capgemini.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@id='macs_cookies_accept_all']")).click();
		WebElement contact=driver.findElement(By.xpath("//a[contains(text(),'Contact us')]"));
		
		ScrolltoWebeleemnt(driver,contact);
		contact.click();
		ScrolltoWebeleemnt(driver, driver.findElement(By.xpath("//*[contains(text(),'Other enquiries')]")));
		driver.findElement(By.xpath("//a[contains(text(),' Get in touch ')]")).click();
		
		//Filling the Get in tpuch form 
		
		driver.findElement(By.xpath("(//input[@placeholder='First Name'])[3]")).sendKeys("Test1");
		driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[3]")).sendKeys("Test2");
		driver.findElement(By.xpath("(//input[@type='email'])[3]")).sendKeys("Test2");
		
		driver.findElement(By.xpath("(//span[contains(text(),'Select Industry')])[3]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Automotive')]")).click();
		
		WebElement el=driver.findElement(By.xpath("(//select/option[contains(text(),'Country')])[3]/.."));
		Select sel= new Select(el);
		sel.selectByVisibleText("India");
		
	}
	public static void ScrolltoWebeleemnt(WebDriver driver ,WebElement el) throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",el);
		Thread.sleep(2000);
	}

}
