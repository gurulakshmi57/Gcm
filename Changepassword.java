package User_login_modules;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Changepassword {
	
	
	@Test(dataProvider = "testdata")
	public void cp(String Ans, String old, String newp, String Confirm) throws InterruptedException
	{
		if(Ans!=null && Ans!="")
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
	
	d.findElement(By.xpath("//*[@id='ctl00_DashBoardLeft_lnkchangepassword']")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$btnSubmit']")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtAnswer']")).sendKeys(Ans.trim());
	Thread.sleep(5000);
	d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtOldPwd']")).sendKeys(old.trim());
	Thread.sleep(5000);
	d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtnewpwd']")).sendKeys(newp.trim());
	Thread.sleep(5000);
	d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtconfpwd']")).sendKeys(Confirm.trim());
	Thread.sleep(5000);
	d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$btnSubmit']")).click();
	Thread.sleep(5000);
	
	String message = d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_lblpwd\"]")).getText();
	Thread.sleep(5000);
	System.out.println(message);
	Thread.sleep(5000);
	
	String message3 = d.findElement(By.xpath("//span[contains(@class,'warn')][contains(text(),'Passwords do not match.')]")).getText();
    System.out.println(message3);
	Thread.sleep(5000);
	
	
	String mes= d.findElement(By.xpath("//span[contains(@class,'warn')][contains(text(),'You Entered Old Password Wrongly.')]")).getText();
	System.out.println(mes);
	Thread.sleep(5000);
	
	
	
	String message4 = d.findElement(By.xpath("//span[contains(@class,'warn')]  [contains(text(),'Your Password has been updated successfully.')]")).getText();
	System.out.println(message4);
	Thread.sleep(5000);
	
	}
}
	@DataProvider(name="testdata")
	public Object[][] readExcel() throws BiffException, IOException {
	{
		File f = new File("D:\\Selenium\\bizworldusa.xls");
		Workbook w= Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Sheet4");
		int rows=s.getRows();
		int columns = s.getColumns();
		String inputData[][] = new String[rows][columns];
		
		for(int i=1; i<s.getRows(); i++) 
		{
			for(int j=0; j<s.getColumns(); j++)
			{
				Cell c= s.getCell(j,i);
				inputData[i][j]= c.getContents();
			}
			
		}
		return inputData;
	}
}
}