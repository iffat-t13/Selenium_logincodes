package login1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size()); //count of link in   entire page
		WebElement footerdriver=driver.findElement(By.id("gf-BIG")); //here we created subdriver footerdriver since we want to use only footer section(limiting webdriver section)
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); //limiting webdriver section to first column only from the footer. And always use findelement when creating webdriver
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		//4. click on each link in the column and check if the pages are opening
		for (int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String difftab=Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(difftab); //you can do it without creating string difftab too
			Thread.sleep(5000L);
		} //for loop here opens all the tab
			
		Set<String> windows=driver.getWindowHandles(); //we are using set<string> as data type
		Iterator<String> it= windows.iterator();
		
		while (it.hasNext()) //hasnext tells us whether next page is available or not
		{
			driver.switchTo().window(it.next()); //itnext actually moves to next index and gives us the id of each new tabs
			System.out.println(driver.getTitle());
		}
		//driver.quit();
		}
	}


