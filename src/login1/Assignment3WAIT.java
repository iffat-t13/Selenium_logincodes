package login1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3WAIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //THIS IS IMPLICIT WAIT
		driver.get("http://itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
		WebDriverWait d=new WebDriverWait(driver, 15);
		d.until(ExpectedConditions.textToBePresentInElementLocated(By.id("results"), "Process completed! This response has been loaded via the Ajax request directly from the web server, without reoading this page."));
		System.out.println(driver.findElement(By.id("results")).getText());
	}

}
