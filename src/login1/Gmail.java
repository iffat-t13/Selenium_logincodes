package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		//driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@class='h-c-header__nav-li-link ']")).click();
		driver.findElement(By.cssSelector("#h-c-header__nav-li-link")).click();
		//driver.findElement(By.cssSelector("a[class*='Sign in']")).click();
		//driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("5713423");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("iffat.jabin@gmail.com");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("virusimcobim1315");
		driver.findElement(By.cssSelector("#identifierNext")).click();
	}

}
