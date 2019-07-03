package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();	
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000L);
		
		int i=1;
		while(i<4)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			
		} 
	
	
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");

		

		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
		driver.findElement(By.cssSelector(".select_CTXT")).click();
		//driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000L);
		//driver.findElement(By.xpath("(//a[@value='BHO'])[1]")).click();
	/* Rule1*/	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BHO']")).click(); //this is for picking a value from dropdown. first pick the full dropdown window then pick value
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		Thread.sleep(2000L);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); //this is same as Rule 1. But instead we are using indexing to show second dropdown with same values
	

}
}
