package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://login.salesforce.com");
		
		/*Customized expressions
		 
		 
		driver.findElement(By.id("username")).sendKeys("testu");
		driver.findElement(By.name("pw")).sendKeys("testpw");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		*/
		//regular expressions
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("test");
		driver.findElement(By.cssSelector("input#password")).sendKeys("rere");
		driver.findElement(By.xpath("//input[contains(@name, 'procee')]")).click();
		
		
	

}
}
