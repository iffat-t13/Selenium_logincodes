package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment4_NestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.cssSelector("a[href*='nested']")).click();
		driver.switchTo().frame("frame-top"); //this is parent top. you have to mention parent frame if you want to get into child frame
		driver.switchTo().frame("frame-middle"); //this is child frame which is called nested frame
		System.out.println(driver.findElement(By.id("content")).getText());
		
	}

}
