package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		// System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size(); // this is providing me the count
																						// of dropdowns which is 3

		for (int i = 0; i < count; i++) // we are using i<count bcz count=3. so its basically i<3
		{
			// driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			// //use get(i) only if you want to click on all radio buttons because its in a
			// loop and it will click on all buttons until more than 3
			// driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			// //getattribute with value means it will use 'value' attribute field to get
			// the value of that radiobutton
			String val = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"); // we
																												// are
																												// storing
																												// the
																												// value
																												// in
																												// val
			if (val.equals("Cheese")) // it means until val=cheese, keep searching.
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click(); // until cheese is matched loop
																							// will go on
			}

		}

	}

}
