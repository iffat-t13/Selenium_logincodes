package login1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); */
		
		
		//UPDATED CALENDAR section 11 
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		while(!driver.findElement(By.className("datepicker-switch")).getText().contains("May"));
		{
			driver.findElement(By.className("next")).click();
		}
		
		
		List<WebElement> dates= driver.findElements(By.className("day")); //here using list webelement because we want list of all the dates and also used findlements(plural) here 
		
		int count=driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++)
		{
			
			String text=driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
			
			
		}
		
		//driver.quit();
		
	}

}
