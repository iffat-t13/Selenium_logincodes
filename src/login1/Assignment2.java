package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.id("RoundTrip")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@title='Depature date']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@title='Depature date']")).isDisplayed());
if (driver.findElement(By.id("RoundTrip")).isSelected())
{
System.out.println(driver.findElement(By.xpath("//*[@title='Return date']")).getText());
}	
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a[class*='ui-state-highlight ui-state-active']")).click();
		driver.findElement(By.id("ReturnDate")).click();
		driver.findElement(By.cssSelector("a[class*='ui-state-highlight ui-state-active']")).click();
		driver.findElement(By.id("Adults")).click();
		WebElement Adult=driver.findElement(By.id("Adults")); //here introducing new webelement to store value into object Adult
		Select s= new Select(Adult);
		s.selectByValue("3");
		Select c= new Select(driver.findElement(By.id("Childrens")));
		c.selectByValue("1");
		driver.findElement(By.cssSelector("a[title='More search options']")).click();
		driver.findElement(By.cssSelector("#AirlineAutocomplete")).sendKeys("Jetairways");
		driver.findElement(By.cssSelector(".booking.large")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
		
	}

}
