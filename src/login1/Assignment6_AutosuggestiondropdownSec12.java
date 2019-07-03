package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6_AutosuggestiondropdownSec12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		WebElement country=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		country.sendKeys("uni");
		Thread.sleep(2000);
		country.sendKeys(Keys.DOWN);
		country.sendKeys(Keys.DOWN);
		country.sendKeys(Keys.DOWN);
		country.sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value")); //we can also use getattribute method. so use ("value") inside getattribute method and whatever value you get it will be printed.
		/*JavascriptExecutor js=(JavascriptExecutor) driver;
		String abc="return document.getElementById(\"autocomplete\").value;";
		String newcountry=(String) js.executeScript(abc);
		System.out.println(newcountry);*/
		
		
	}

}

