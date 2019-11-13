package User_login_modules;

import java.io.File;

import java.io.IOException;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Post_free_buyerleadad {

	@Test(dataProvider = "testdata")

	public static void postfreead(String Category, String Relatedcategory, String Relatedcategory1, String Contactname,
			String Contactphoneno, String Mobileno, String Yourcomments) throws Exception {
		
		if(Category!=null && Category!="")
		{
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\Browsers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("http://testbiz.bizworldusa.com/advertiser-login-to-account");
		Thread.sleep(5000);

		d.manage().window().maximize();
		Thread.sleep(5000);

		// login with valid credentials
		d.findElement(By.xpath("//input[@name='ctl00$MainContent$Login$txtusername']"))
				.sendKeys("gurulakshmi57@gmail.com");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"ctl00_MainContent_Login_btnsubmit\"]")).click();
		Thread.sleep(5000);
		//// *[@id="ctl00_ContentPlaceHolder1_Login_txtpwd"]
		d.findElement(By.xpath("//input[@name='ctl00$MainContent$Login$txtpwd']")).sendKeys("123456");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"ctl00_MainContent_Login_btnsubmit\"]")).click();
		Thread.sleep(5000);

		d.findElement(By.xpath("//a[@id='ctl00_DashBoardLeft_lnkourservices']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ImageButton1']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rdservicetype_0']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ImageButton1']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$ImageButton1']")).click();
		Thread.sleep(5000);

		//post buyer lead ad
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$ddlcat']")).sendKeys(Category.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtOthCat']")).sendKeys(Relatedcategory.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtOthCat1']")).sendKeys(Relatedcategory1.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtContact']")).sendKeys(Contactname.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtPhone']")).sendKeys(Contactphoneno.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtMobile']")).sendKeys(Mobileno.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$txtComments']")).sendKeys(Yourcomments.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ImageButton1\"]")).click();
		Thread.sleep(5000);
         
		d.close();
		}
		
	}

	@DataProvider(name = "testdata")
	public Object[][] readExcel() throws BiffException, IOException {
		File f = new File("D:\\Selenium\\bizworldusa.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Sheet3");
		int rows = s.getRows();
		int columns = s.getColumns();

String inputData[][] = new String[rows][columns];
		
		for (int i = 1; i < s.getRows(); i++) {
			 
			for (int j = 0; j < s.getColumns(); j++) {
				
				 
				Cell c = s.getCell(j,i);

				inputData[i][j] = c.getContents();
				  
				
			}
		}
		
		return inputData;

		
	}

}
