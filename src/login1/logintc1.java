package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#email")).sendKeys("iffat.jabin@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("virusimcobim13154");
		//driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		//driver.findElement(By.id("email")).sendKeys("iffat.jabin@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("virusimcobim1315");
		
		driver.findElement(By.xpath("//*[@id=\'loginbutton\']")).click(); 
		
		
		
		//driver.close();"
		
		
		
 	/*driver.get("https://google.com");
 	driver.manage().window().maximize();
 	System.out.println(driver.getTitle());
 	//System.out.println(driver.getPageSource());
 	driver.get("https://facebook.com"); //navigate to new page
 	driver.navigate().back(); //back to previous page
 	//driver.close(); //closes current focused browser
 	driver.quit(); //closees all window opened by selenium script*/
		
	}

}
 