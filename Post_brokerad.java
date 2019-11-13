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

public class Post_brokerad {
	
	@Test(dataProvider = "testdata")
	
	public void brokad(String Companyname, String Category, String category1, String category2,
			String category3, String category4, String category5,String Contactname, String Contactphoneno, String mobileno, String Fax, 
			String Website, String Address1, String Address2, String City, String County, String State,String Zipcode, String lang1, String lang2, 
			String lang3, String lang4, String lang5, String lang6,String Licenseno, String Addesc, String Companylogo,String audio,String video) throws Exception {
	
		if(Companyname!=null && Companyname!="")
		{
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\Browsers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("http://testbiz.bizworldusa.com/advertiser-login-to-account");
		Thread.sleep(5000);

		d.manage().window().maximize();
		Thread.sleep(5000);
		
		d.findElement(By.xpath("//input[@name='ctl00$MainContent$Login$txtusername']")).sendKeys("gurulakshmi57@gmail.com");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"ctl00_MainContent_Login_btnsubmit\"]")).click();
		Thread.sleep(5000);
		
		d.findElement(By.xpath("//input[@name='ctl00$MainContent$Login$txtpwd']")).sendKeys("123456");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"ctl00_MainContent_Login_btnsubmit\"]")).click();
		Thread.sleep(5000);
		
		d.findElement(By.xpath("//*[@id='ctl00_DashBoardLeft_lnkourservices']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ImageButton1']")).click();
		Thread.sleep(5000);
	    d.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rdservicetype_4']")).click();
	    Thread.sleep(5000);
	    d.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ImageButton1']")).click();
		Thread.sleep(5000);
		
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$ImageButton1']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtCompany']")).sendKeys(Companyname.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$ddlcat']")).sendKeys(Category.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtOthCat']")).sendKeys(category1.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtOthCat1']")).sendKeys(category2.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtOthCat2']")).sendKeys(category3.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtOthCat3']")).sendKeys(category4.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtOthCat4']")).sendKeys(category5.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtContact']")).sendKeys(Contactname.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtPhone']")).sendKeys(Contactphoneno.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtMobile']")).sendKeys(mobileno.trim());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtFax']")).sendKeys(Fax.trim());
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
	    d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtlangcom1']")).sendKeys(lang1.trim());
	    Thread.sleep(5000);
	    d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtlangcom2']")).sendKeys(lang2.trim());
	    Thread.sleep(5000);
	    d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtlangcom3']")).sendKeys(lang3.trim());
	    Thread.sleep(5000);
	    d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtlangcom4']")).sendKeys(lang4.trim());
	    Thread.sleep(5000);
	    d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtlangcom5']")).sendKeys(lang5.trim());
	    Thread.sleep(5000);
	    d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtlangcom6']")).sendKeys(lang6.trim());
	    Thread.sleep(5000);
	    d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtLicense']")).sendKeys(Licenseno.trim());
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
	
	@DataProvider(name="testdata")
	public Object[][] readExcel() throws BiffException, IOException
	{
		File f= new File("D:\\Selenium\\Postbrokerad.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet sh = w.getSheet("Sheet1");
		int rows = sh.getRows();
		int columns = sh.getColumns();
		
		String inputdata[][] = new String[rows][columns];
		
		for(int i=1; i<sh.getRows();i++)
		{
			for(int j=0; j<sh.getColumns(); j++)
			{
				Cell c = sh.getCell(j, i);
				
				inputdata[i][j]= c.getContents();
			}
			
		}
		return inputdata;
	}
	

}
