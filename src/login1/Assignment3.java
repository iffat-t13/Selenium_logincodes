package login1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		Set<String> idget=driver.getWindowHandles();
		Iterator<String> ite=idget.iterator();
		String parentid=ite.next();
		String childwin=ite.next();
		driver.switchTo().window(childwin);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
	}

}
