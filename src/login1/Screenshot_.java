package login1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils; //we got this from http://commons.apache.org/proper/commons-io/download_io.cgi

public class Screenshot_ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //in this step webdriver takes SS and stores it in src
		FileUtils.copyFile(src, new File("C:\\screenshotselenium.jpg")); //in this step, it stores that SS into our local drive
		//its better to store the image in other drives than C bcz C is mostly admin and it will show access denied in most cases. you may not have admin access
	}

}


/*Here the code for multiple screenshot sample example method as

public void getScreenShot(String Name)

    {

    Calendar calendar = Calendar.getInstance();

    SimpleDateFormat formater  = new SimpleDateFormat("dd_MM_yyy_hh_mm_ss");   

    File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

    try

    {

    String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()+ "/src/main/java/com/test/screenshot/";

        File destFile = new File((String) reportDirectory + Name +" "+ formater.format(calendar.getTime())+ ".png");   

            FileUtils.copyFile(scrFile, destFile);

            Reporter.log("<a herf='"+destFile.getAbsolutePath()+"'><img src='"+destFile.getAbsolutePath()+"'height='100' Width='100'/></a>");

        }       

     	catch(Exception e)

    {

    e.printStackTrace();

    }

    }

*/
