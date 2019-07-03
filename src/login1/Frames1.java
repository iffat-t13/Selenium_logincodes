package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0); //this is used to switch by frame indexing
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']"))); //this is used when you are not sure about number of frames and no id avaible
		//driver.findElement(By.id("draggable")).click();
		Actions a=new Actions(driver);
		WebElement s=driver.findElement(By.id("draggable"));
		WebElement t=driver.findElement(By.id("droppable"));
		a.dragAndDrop(s, t).build().perform();
		driver.switchTo().defaultContent(); //when you want it to come back to normal window and out of frame
	}
	
}
