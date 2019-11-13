package User_login_modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log_history {
	@Test
	public void lohis() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\Browsers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
	
		d.get("http://testbiz.bizworldusa.com/advertiser-login-to-account/");
	d.manage().window().maximize();
	Thread.sleep(5000);
	
	Thread.sleep(5000);
	
	//login with valid credentials
	d.findElement(By.xpath("//input[@name='ctl00$MainContent$Login$txtusername']")).sendKeys("gurulakshmi57@gmail.com");
	Thread.sleep(5000);
	d.findElement(By.xpath("//*[@id='ctl00_MainContent_Login_btnsubmit']")).click();
	Thread.sleep(5000);
	
	JavascriptExecutor js= (JavascriptExecutor)d;
	js.executeScript("document.getElementById('ctl00_MainContent_Login_txtpwd').value='123456'");
	
	d.findElement(By.xpath("//*[@id='ctl00_MainContent_Login_btnsubmit']")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//*[@id='ctl00_DashBoardLeft_lnkloghistory']")).click();
	Thread.sleep(5000);
	
	WebElement wb= d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[2]/td[1]"));
	System.out.println(wb.getText());
	
	WebElement web = d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_GridView1\"]/tbody/tr[2]/td[2]"));
	System.out.println(web.getText());
}
}