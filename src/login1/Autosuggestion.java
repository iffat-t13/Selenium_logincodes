package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.kayak.com/horizon/sem/flights/general");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement source= driver.findElement(By.name("origin")); //by declaring source, we are not repeating same thing again n again
		source.clear();
		source.sendKeys("NEW");
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		
		WebElement dest=driver.findElement(By.name("destination"));
		dest.sendKeys("CA");
		Thread.sleep(2000);
		for (int i=1; i<4; i++);
		
		/*int i=1;
		while (i<3);*/
		{
			dest.sendKeys(Keys.ARROW_DOWN);
			
			dest.sendKeys(Keys.ENTER);
		} 
		
		//System.out.println(driver.findElement(By.xpath("//*[text()='New York, NY']")).getText());
	}

}
