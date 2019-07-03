package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("iffat.jabin@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("virusimcobim1315");
		driver.findElement(By.xpath("//input[@value='Log In']")).click(); 
		
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("iffat");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("virusimcobim1315");
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//driver.findElement(By.xpath("//input[contains(@value, 'Log In')"]).
	}

}
