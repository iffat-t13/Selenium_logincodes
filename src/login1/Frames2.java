package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fantasycricket.dream11.com/IN/");
		int number=findFramenumber(driver,By.xpath(".//*[@id='recaptcha-anchor']/div[5]")); //passing the driver and locator through this method findFramenumber
		driver.switchTo().frame(number);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		driver.switchTo().defaultContent();
		int number1=findFramenumber(driver,By.xpath(".//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();
	}

	
	public static int findFramenumber(WebDriver driver, By by)
{
	int i;
	int framecount=driver.findElements(By.tagName("iframe")).size(); //first we get the total no. of frames available in that page
	for (i=0;i<framecount;i++)
	{
		driver.switchTo().frame(i); //here we keep on switching to each frame represented by i
		int count=driver.findElements(by).size();
		
	if (count>0)
	{
		//driver.findElement(by).click(); 
		break;
	}
	else
	{
		System.out.println("Continue looping");
	}
	
	}
	driver.switchTo().defaultContent();
	return i; //will return the index we foundwhawhat
}
	
}
