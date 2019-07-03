package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestivedropdownSEC12 {

	//LEC 97 SEC12
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		 //driver.findElement(By.xpath("//input[@id='fromPlaceName']")).clear();
		
		 driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("beng");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		 	
		//System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText()); //this will not work so we need jsexecutot
		
		JavascriptExecutor js=(JavascriptExecutor)driver; //first create object i.e initiating or defining jsexecutor. its the package selenium provided. we created jsobject here just like driver object to execute js DOM related items  
		String script = "return document.getElementById(\"fromPlaceName\").value;"; //document.getElementId(\"id\").value - \"id\" is used since we cnt use double quotes " inside another ". and by.value we get the text (just like getText). And instead of system.out.println we write return for JSExecutor. So return actually takes this value and puts it in string
		String text= (String) js.executeScript(script); //this code is for executing the script. Because after execution it will return a string value, so we've declared it as string variable to be stored as string in text
		System.out.println(text); //now finally you print your output which has been stored in text
		
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATIONa AIRPORT"));
		{
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text= (String) js.executeScript(script);
			System.out.println(text);
			
			if(i>10)
			{
				break;
			}
			
		}
		if (i>10)
		{
			System.out.println("element not present");
		}
		else
		{
			System.out.println("found");
		}
	}

}
