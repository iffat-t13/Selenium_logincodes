package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		 
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click(); //here * is given to match any id with text 'friendsandfamily' 
		//driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size()); //count the no of chkbox
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); this is commented out bcz we want to put it in loop
	if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			{
		System.out.println("its enabled"); //you can print anything
		Assert.assertTrue(true); //assertion is used to say its passed. 
			}
	else
	{
		Assert.assertTrue(false);
	}
	}

}
