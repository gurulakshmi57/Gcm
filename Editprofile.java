package User_login_modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

public class Editprofile {
	@Test
	public void edit() throws InterruptedException
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
	d.findElement(By.id("ctl00_DashBoardLeft_lnkeditprofile")).click();
	Thread.sleep(5000);
	
	//Title
	Select drop = new Select(d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_drtitle\"]")));
	drop.selectByIndex(3);
	//drop.selectByValue("2");
	//drop.selectByVisibleText("Mrs.");
	Thread.sleep(5000);
	
	d.findElement(By.id("ctl00_ContentPlaceHolder1_txtFirstName")).clear();
	Thread.sleep(5000);
	d.findElement(By.id("ctl00_ContentPlaceHolder1_txtFirstName")).sendKeys("Guru");
	Thread.sleep(5000);
	
	d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtMiddleName\"]")).clear();
	Thread.sleep(5000);
	d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtMiddleName\"]")).sendKeys("Lakshmi");
	Thread.sleep(5000);
	
	d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtLastName\"]")).clear();
	Thread.sleep(5000);
	d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtLastName\"]")).sendKeys("Badveli");
	Thread.sleep(5000);
	
	//DOB
	d.findElement(By.xpath("//input[@id=\"ctl00_ContentPlaceHolder1_txtyear\"]")).clear();
	Thread.sleep(5000);
	d.findElement(By.xpath("//input[@id=\"ctl00_ContentPlaceHolder1_txtyear\"]")).sendKeys("1994");
	Thread.sleep(5000);
	
	Select drp =new Select(d.findElement(By.xpath("//*[@name=\"ctl00$ContentPlaceHolder1$ddlmonth\"]")));
	drp.selectByIndex(8);
	Thread.sleep(5000);
	
	Select date= new Select(d.findElement(By.xpath("//*[@name=\"ctl00$ContentPlaceHolder1$ddldate\"]")));
	date.selectByValue("3");
	Thread.sleep(5000);
	
	Select gen =new Select(d.findElement(By.xpath("//*[@name=\"ctl00$ContentPlaceHolder1$ddlgender\"]")));
	gen.selectByVisibleText("Female");
	Thread.sleep(5000);
	
	d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtAddr1\"]")).clear();
	Thread.sleep(5000);
	d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtAddr1\"]")).sendKeys("3775 Beacon avenue");
	Thread.sleep(5000);
	
	d.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$txtcity\"]")).clear();
	Thread.sleep(5000);
	d.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$txtcity\"]")).sendKeys("Fremont");
	Thread.sleep(5000);
	
	d.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDistrict']")).clear();
	Thread.sleep(5000);
	d.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDistrict']")).sendKeys("alameda");
	Thread.sleep(5000);
	
	d.findElement(By.id("ctl00_ContentPlaceHolder1_txtState")).clear();
	Thread.sleep(5000);
	d.findElement(By.id("ctl00_ContentPlaceHolder1_txtState")).sendKeys("California");
	Thread.sleep(5000);
	
	d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtZipcode']")).clear();
	Thread.sleep(5000);
	d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtZipcode']")).sendKeys("123");
	Thread.sleep(5000);
	d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_imgsave\"]")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtZipcode']")).clear();
	Thread.sleep(5000);
	d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_imgsave\"]")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtZipcode']")).sendKeys("94538");
	Thread.sleep(5000);
	
	d.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$txtphone\"]")).clear();
	Thread.sleep(5000);
	d.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$txtphone\"]")).sendKeys("8978787");
	Thread.sleep(5000);
	d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_imgsave\"]")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$txtphone\"]")).clear();
	Thread.sleep(5000);
	d.findElement(By.xpath("//input[@name=\"ctl00$ContentPlaceHolder1$txtphone\"]")).sendKeys("963-852-7410");
	Thread.sleep(5000);
	
	/*d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtmobile\"]")).clear();
	Thread.sleep(5000);
	d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtmobile\"]")).sendKeys("852-741-8965");
	Thread.sleep(5000);
	
	d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtFax\"]")).clear();
	Thread.sleep(5000);
	d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtFax\"]")).sendKeys("963-882-7410");
	Thread.sleep(5000);
	*/
	d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_imgsave\"]")).click();
	Thread.sleep(5000);
	
	
	
	
	System.out.println("Your Profile Has Been Updated Successfully");
    Thread.sleep(5000);
    d.close();
	
	 
	
	
	
	
	
	
}
}
