package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//Select s= new Select(driver.findElement(By.id("month")));  //here s is the object and new Select is the new class.So after initiating s will use all elements under Select class
		//s.selectByValue("12");
		//s.selectByIndex(4);  
		
				
			//Updated dropdown	
		 driver.get("https://www.google.com/flights");
		driver.manage().window().maximize();	
		driver.findElement(By.id("flt-pax-button")).click();
		//driver.findElement(By.xpath("//div[@class='gws-flights__dialog-button gws-flights__dialog-primary-button']")).click();
		
		Thread.sleep(2000L);
		
		/*int i=1;
		while (i<4)
		{
			driver.findElement(By.xpath("//div[@id='flt-modaldialog']/div/div/div[1]/div/div[2]/div[2]")).click();
			i++;
			
		} */
			driver.findElement(By.name("Done"));
		
	}

}
