package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelationshipXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://facebook.com");
		//driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//*[@class='mbm _a4y']/div/div/input")).sendKeys("09740");
		
		driver.get("https://qaclickacademy.com/interview.php");
		driver.manage().window().maximize();
		
		
		
		//driver.findElement(By.xpath("//a[@href='interview.php']")).click();
	//driver.findElement(By.xpath("//a[contaInterview Guideins (@href, 'interview.php')]")).click();
		//driver.findElement(By.linkText("Interview Guide")).click();
		
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[2]")).click();
	driver.findElement(By.xpath("//*[text()='What is ENDPOINT?']")).click();
	}

}
