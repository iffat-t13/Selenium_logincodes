package login1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\Seleniumstuff\\geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail/about/#");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@class='h-c-footer__link']")).click();
		Set<String>ids=driver.getWindowHandles(); // we always use set<string> for multiple windows
		Iterator<String> it=ids.iterator(); //iterator helps us to move from one tab to another
		String parentid= it.next();
		String childid= it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		//driver.close();
		
	}

}
