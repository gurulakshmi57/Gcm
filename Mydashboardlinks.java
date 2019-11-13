package User_login_modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mydashboardlinks {
	@Test
	public void dashboard() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\Browsers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
	//System.setProperty("webdriver.gecko.driver", "E:\\Eclipse\\Browsers\\geckodriver.exe");
	//WebDriver d = new FirefoxDriver();
	d.get("http://testbiz.bizworldusa.com/");
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
	
	d.findElement(By.id("ctl00_DashBoardLeft_lnkHome")).click();
	Thread.sleep(5000);
	
	d.findElement(By.xpath("//a[@id='ctl00_DashBoardLeft_lnkourservices']")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//li[@id='ctl00_HeaderBottom1_lnklogout']//a[contains(text(),'My Home')]")).click();
	Thread.sleep(5000);
	
	d.findElement(By.xpath("//*[@id=\"ctl00_DashBoardLeft_lnkreportservices\"]")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//li[@id='ctl00_HeaderBottom1_lnklogout']//a[contains(text(),'My Home')]")).click();
	Thread.sleep(5000);
	
	d.findElement(By.id("ctl00_DashBoardLeft_lnkeditprofile")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//li[@id='ctl00_HeaderBottom1_lnklogout']//a[contains(text(),'My Home')]")).click();
	Thread.sleep(5000);
	
    d.findElement(By.id("ctl00_DashBoardLeft_lnkbilling")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//li[@id='ctl00_HeaderBottom1_lnklogout']//a[contains(text(),'My Home')]")).click();
	Thread.sleep(5000);
	
	d.findElement(By.id("ctl00_DashBoardLeft_lnkchangepassword")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//li[@id='ctl00_HeaderBottom1_lnklogout']//a[contains(text(),'My Home')]")).click();
	Thread.sleep(5000);
	
	d.findElement(By.id("ctl00_DashBoardLeft_lnkloghistory")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//li[@id='ctl00_HeaderBottom1_lnklogout']//a[contains(text(),'My Home')]")).click();
	Thread.sleep(5000);
	
	d.findElement(By.id("ctl00_DashBoardLeft_lnkbuysell")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//li[@id='ctl00_HeaderBottom1_lnklogout']//a[contains(text(),'My Home')]")).click();
	Thread.sleep(5000);
	
	d.findElement(By.id("ctl00_DashBoardLeft_lnkintermediary")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//li[@id='ctl00_HeaderBottom1_lnklogout']//a[contains(text(),'My Home')]")).click();
	Thread.sleep(5000);
	
	
	
}
}