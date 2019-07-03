package login1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		WebElement table= driver.findElement(By.xpath("//table[@id='product']")); //we stored in table and using table. dot below instead of driver. cz driver. will give elements of full page. but we need elements of that particular table only 
		
		
		System.out.println(table.findElements(By.tagName("tr")).size()); //finding row count
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size()); //here we first identified tr under which th(header) is given. so we fidn header count
		
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")); //we are using list beause we are storing multi values of rows in it
		System.out.println(secondrow.get(0).getText()); //printing first value of the row
		System.out.println(secondrow.get(1).getText());//printing 2nd value of the row
		System.out.println(secondrow.get(2).getText());//printing 3rd value of the row
	}

}
