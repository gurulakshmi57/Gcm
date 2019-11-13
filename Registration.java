package User_Non_login_modules;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Registration {

	
	@Test(dataProvider = "testdata")
	public void reg(String Email, String Password, String Title, String FName, String Mname, String LName,
			String Year, String Month, String Day, String Gender, String Address, String City, String State,
			String Zipcode, String No, String Membertype, String Securityquestion, String Securityans
			) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\Browsers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("http://testbiz.bizworldusa.com/");
		d.manage().window().maximize();
        d.findElement(By.xpath("//a[contains(text(),'Register Now')]")).click();
        Thread.sleep(5000);
        
		d.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtEmailId']")).sendKeys(Email.trim());
		Thread.sleep(9000);
		
		d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtPassword\"]")).sendKeys(Password.trim());
		Thread.sleep(5000);
		d.findElement(By.id("ctl00_ContentPlaceHolder1_drtitle")).sendKeys(Title);
		Thread.sleep(5000);

		d.findElement(By.id("ctl00_ContentPlaceHolder1_txtFirstName")).sendKeys(FName.trim());
		Thread.sleep(5000);
		d.findElement(By.id("ctl00_ContentPlaceHolder1_txtMiddleName")).sendKeys(Mname.trim());
		Thread.sleep(5000);
		d.findElement(By.id("ctl00_ContentPlaceHolder1_txtLastName")).sendKeys(LName.trim());
		Thread.sleep(5000);
		d.findElement(By.id("ctl00_ContentPlaceHolder1_txtyear")).sendKeys(Year.trim());
		Thread.sleep(5000);
		d.findElement(By.id("ctl00_ContentPlaceHolder1_ddlmonth")).sendKeys(Month.trim());
		Thread.sleep(5000);
		d.findElement(By.id("ctl00_ContentPlaceHolder1_ddldate")).sendKeys(Day.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ddlgender\"]")).sendKeys(Gender);
		Thread.sleep(5000);
		d.findElement(By.id("ctl00_ContentPlaceHolder1_txtAddr1")).sendKeys(Address.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtcity\"]")).sendKeys(City.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtState\"]")).sendKeys(State.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtZipcode\"]")).sendKeys(Zipcode);
		Thread.sleep(5000);
		d.findElement(By.id("ctl00_ContentPlaceHolder1_txtphone")).sendKeys(No.trim());
		Thread.sleep(5000);

		d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ddlmembertype\"]")).sendKeys(Membertype);
		Thread.sleep(5000);
		d.findElement(By.id("ctl00_ContentPlaceHolder1_txtSecQuestion")).sendKeys(Securityquestion.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtAnswer\"]")).sendKeys(Securityans.trim());
		Thread.sleep(5000);
		
		Select drop=new Select(d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ddlreference\"]")));
		drop.selectByVisibleText("Google Search Engine");
		Thread.sleep(5000);
		
		d.findElement(By.id("ctl00_ContentPlaceHolder1_imgsave")).click();
		Thread.sleep(5000);
		
		d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtPassword\"]")).sendKeys(Password.trim());
		Thread.sleep(5000);
		d.findElement(By.id("ctl00_ContentPlaceHolder1_imgsave")).click();
		Thread.sleep(7000);
		Assert.assertEquals("http://testbiz.bizworldusa.com/thanks-for-registration", d.getCurrentUrl());
		Thread.sleep(5000);
		
		d.close();
	}

	@DataProvider(name = "testdata")
    public Object[][] readExcel() throws BiffException, IOException {
		File f = new File("D:\\sample.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		int rows = s.getRows();
		int columns = s.getColumns();

		String inputData[][] = new String[rows][columns];
		
		for (int i = 0; i < s.getRows(); i++) {
			 
			for (int j = 0; j < s.getColumns(); j++) {
				
				 
				Cell c = s.getCell(j,i);

				inputData[i][j] = c.getContents();
				  
				
			}
		}
		return inputData;

	}

}
