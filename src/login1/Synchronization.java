package login1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //THIS IS IMPLICIT WAIT
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/seattlehotels?mcicid=page.partner.hotels.merchlinks.49501428");
		driver.manage().window().maximize();
		driver.findElement(By.id("H-destination")).clear();
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		
		WebDriverWait d=new WebDriverWait(driver,20); //this is EXPLICIT WAIT
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href, 'New-York-Hotels-Days-Hotel')]")));
	//so the above explicit wait means IT will wait until this element is clickable(or whatever method/condition u use), it will wait for max 20 sec.
	}

}
