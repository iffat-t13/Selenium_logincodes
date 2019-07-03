package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment5_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		Assert.assertFalse(driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).isSelected());
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String option= driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).getText();
		WebElement dropdownn=driver.findElement(By.id("dropdown-class-example"));
		Select s= new Select(dropdownn);
		s.selectByVisibleText(option);
		driver.findElement(By.name("enter-name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		String text= driver.switchTo().alert().getText();
		if (text.contains(option))
		{
			System.out.println("Success");
		}
			
		else
			System.out.println("failed");
			
			
			
			
		driver.quit();
	}

}

