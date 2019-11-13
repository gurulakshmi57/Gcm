package User_login_modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.read.biff.BiffException;

public class Mycrm {
	
	public static void main(String args[]) throws BiffException, IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\Browsers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://testbiz.bizworldusa.com/");
	//System.setProperty("webdriver.gecko.driver", "E:\\Eclipse\\Browsers\\geckodriver.exe");
	//WebDriver d = new FirefoxDriver();
	
	d.manage().window().maximize();
	Thread.sleep(5000);
	d.findElement(By.xpath("//*[@id=\"HeaderBottom_lnklogin\"]/a")).click();
	Thread.sleep(5000);
	
	//login with valid credentials
	d.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Login_txtusername']")).sendKeys("gurulakshmi57@gmail.com");
	Thread.sleep(5000);
	d.findElement(By.id("ctl00_ContentPlaceHolder1_Login_btnsubmit")).click();
	Thread.sleep(5000);
	////*[@id="ctl00_ContentPlaceHolder1_Login_txtpwd"]
	d.findElement(By.id("ctl00_ContentPlaceHolder1_Login_txtpwd")).sendKeys("123456");
	Thread.sleep(5000);
	d.findElement(By.id("ctl00_ContentPlaceHolder1_Login_btnsubmit")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_lnkmycrm\"]")).click();
	Thread.sleep(5000);
	
	}
}