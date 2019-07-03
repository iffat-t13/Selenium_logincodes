package login1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		Actions a= new Actions(driver); //here we created Actions class with object a. within action class argument we need to pass driver object so that driver gets capabilities of Actions class method.
		WebElement move=driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("tv").doubleClick().build().perform();
		a.moveToElement(move).contextClick().build().perform();
		
		
		//a.moveToElement(move).build().perform();
		
	}

}
