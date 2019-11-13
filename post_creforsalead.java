package User_login_modules;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class post_creforsalead {
	
	@Test(dataProvider = "testdata")
	public void postcread(String Prosaletitle,String Procategory, String category1, String category2,String category3, String category4, 
			String category5, String Adpostedby, String Contactname, String Contactphoneno, String Alternateno, String Fax, String Companyname, 
			String Licenseno, String Website, String Address1, String Address2, String City, String County, String State, String Municipality, 
			String Village,String Area, String Zipcode, String Askingprice,String Gross, String Commission, String Caprate, String ROR, String Prosale, 
			String Yearofprobuilt, String prosurvey, String Currentownersinceyear, String Buildingbizarea, String Lotsize, String Totalnoofparkings,
			String Resparkings, String Addesc, String Offlisting, String Reasonforsale, String Companylogo1, String Companylogo2, String Companylogo3,
			String Companylogo4, String audio, String video, String yourcoms, String Dis) throws Exception {
	
		if(Prosaletitle!=null && Prosaletitle!="")
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
		    d.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_rdservicetype_5']")).click();
		    Thread.sleep(5000);
		    d.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ImageButton1']")).click();
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtAdTitle']")).sendKeys(Prosaletitle.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$ddlcat']")).sendKeys(Procategory.trim());
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
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtPostedBy']")).sendKeys(Adpostedby.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtContact']")).sendKeys(Contactname.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtPhone']")).sendKeys(Contactphoneno.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtMobile']")).sendKeys(Alternateno.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtFax']")).sendKeys(Fax.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtCompany']")).sendKeys(Companyname.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtLicense']")).sendKeys(Licenseno.trim());
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
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtMunc']")).sendKeys(Municipality.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtVillage']")).sendKeys(Village.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtArea']")).sendKeys(Area.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtzip']")).sendKeys(Zipcode.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtcost']")).sendKeys(Askingprice.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtannual']")).sendKeys(Gross.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtsplit']")).sendKeys(Commission.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtCapRate']")).sendKeys(Caprate.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtRorRoi']")).sendKeys(ROR.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtYear']")).sendKeys(Yearofprobuilt.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtsurvey']")).sendKeys(prosurvey.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtCurrOwenerStatus']")).sendKeys(Currentownersinceyear.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtbuildarea']")).sendKeys(Buildingbizarea.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtlotsize']")).sendKeys(Lotsize.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$totPark']")).sendKeys(Totalnoofparkings.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$resPark']")).sendKeys(Resparkings.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$txtAdDesc']")).sendKeys(Addesc.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtListNo']")).sendKeys(Offlisting.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$txtReason']")).sendKeys(Reasonforsale.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$adFile']")).sendKeys(Companylogo1.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$adFile']")).sendKeys(Companylogo2.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$adFile']")).sendKeys(Companylogo3.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$adFile']")).sendKeys(Companylogo4.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$audioFile']")).sendKeys(audio.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$videoFile']")).sendKeys(video.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$txtComments']")).sendKeys(yourcoms.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//*[@name='ctl00$ContentPlaceHolder1$txtdisc']")).sendKeys(Dis.trim());
			Thread.sleep(5000);
			d.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$ImageButton1']")).click();
			Thread.sleep(5000);
			
			//payment gateway
			Thread.sleep(2000);
			System.out.println("start page load");
			Thread.sleep(8000);
			System.out.println("page load end");

			WebElement ele = d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_rdlist_0\"]"));
			Thread.sleep(2000);
			System.out.println("start page load");

			
			
			if(ele.isSelected())
			{
				System.out.println("Selected Radio ....");
				d.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnSubmit\"]")).click();
				Thread.sleep(2000);
				System.out.println(d.switchTo().alert().getText());
				d.switchTo().alert().accept();
				Thread.sleep(2000);
				
			}
			else {
	            System.out.println("UnSelected Radio ....");
	            
	            
			}
		            
		            
				}
			
		}
		
	@DataProvider(name="testdata")
	public Object[][] readExcel() throws BiffException, IOException
	{
		File f= new File("D:\\Selenium\\Postcreforsale.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet sh = w.getSheet("Sheet1");
		int rows = sh.getRows();
		int columns = sh.getColumns();
		
		String inputdata[][] = new String[rows][columns];
		System.out.println(sh.getRows());
		
		for(int i=1; i<sh.getRows(); i++)
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
