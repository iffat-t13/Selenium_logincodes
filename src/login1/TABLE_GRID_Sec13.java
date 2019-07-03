package login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TABLE_GRID_Sec13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount=	table.findElements(By.cssSelector("cb-col cb-col-8 text-right text-bold")).size();
		int childcount= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for (int i=0; i<childcount-2;i++)
		{
			String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueinteger=Integer.parseInt(value); //this is for converting string value to integer
			sum=sum+valueinteger;
		}
		System.out.println(sum);
		
		String extravalue= driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int newextra=Integer.parseInt(extravalue);
		int extrasum=newextra+sum;
		System.out.println(extrasum);
		String actualtotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int realvalue=Integer.parseInt(actualtotal);
		if (realvalue==extrasum) //this is to compare if actual value equals expected
		{
			System.out.println("total value matches");
			
		}
		else
		{
			System.out.println("total value fails to match");
		}
	}

}
