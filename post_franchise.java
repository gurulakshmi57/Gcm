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

public class post_franchise {

	
	@Test(dataProvider = "testdata")

	public void postfranchisead(String Companyname, String Category, String Relatedcategory1, String Relatedcategory2,
			String Relatedcategory3, String Relatedcategory4, String Relatedcategory5,String Contactname, String Contactphoneno, 
			String Alternateno, String Fax, String Website, String Address1, String Address2, String City, String County, String State,
			String Zipcode, String Addesc, String Companylogo,String audio,String video) throws Exception {

		if(Companyname!=null && Companyname!="")
		{
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\Browsers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("http://testbiz.bizworldusa.com/advertiser-login-to-account");
		Thread.sleep(5000);

		d.manage().window().maximize();
		Thread.sleep(5000);

		// login with valid credentials
		d.findElement(By.xpath("//input[@name='ctl00$MainContent$Login$txtusername']")).sendKeys("gurulakshmi57@gmail.com");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"ctl00_MainContent_Login_btnsubmit\"]")).click();
		Thread.sleep(5000);
		
		d.findElement(By.xpath("//input[@name='ctl00$MainContent$Login$txtpwd']")).sendKeys("123456");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"ctl00_MainContent_Login_btnsubmit\"]")).click();
		Thread.sleep(5000);
		
		d.findElement(By.xpath("//a[@id='ctl00_DashBoardLeft_lnkourservices']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ImageButton1']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_rdservicetype_2\"]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ImageButton1']")).click();
		Thread.sleep(5000);
		
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$ImageButton1']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtCompany']")).sendKeys(Companyname.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$ddlcat']")).sendKeys(Category.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtOthCat']")).sendKeys(Relatedcategory1.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtOthCat1']")).sendKeys(Relatedcategory2.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtOthCat2']")).sendKeys(Relatedcategory3.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtOthCat3']")).sendKeys(Relatedcategory4.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtOthCat4']")).sendKeys(Relatedcategory5.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtContact']")).sendKeys(Contactname.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtPhone']")).sendKeys(Contactphoneno.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtAltNo']")).sendKeys(Alternateno.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtfax']")).sendKeys(Fax.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtWebsite']")).sendKeys(Website.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtAddr1']")).sendKeys(Address1.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtAddr2']")).sendKeys(Address2.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$ddlCity']")).sendKeys(City.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$ddlCounty']")).sendKeys(County.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$ddlState']")).sendKeys(State.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtZip']")).sendKeys(Zipcode.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$txtAdDesc']")).sendKeys(Addesc.trim());
		Thread.sleep(5000);
		
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$adFile']")).sendKeys(Companylogo.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$audioFile']")).sendKeys(audio.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$videoFile']")).sendKeys(video.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$ImageButton1']")).click();
		Thread.sleep(5000);
		d.close();
}
	}
	@DataProvider(name = "testdata")
	public Object[][] readExcel() throws BiffException, IOException {
		File f = new File("D:\\Selenium\\Postsfranchisead.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
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