package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("[type='email'])")).sendKeys("fsfsdf");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("fsfsd");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
