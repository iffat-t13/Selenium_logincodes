package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".select_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BHO']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		Thread.sleep(2000L);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); 
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
	System.out.println("its disabled"); //you can print anything
	Assert.assertTrue(true); //assertion is used to say its passed. 
		}
else
{
	Assert.assertTrue(false);
}
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		int i=1;
		while(i<4)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;			
		} 
		driver.findElement(By.id("btnclosepaxoption")).click();
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
	}

}
