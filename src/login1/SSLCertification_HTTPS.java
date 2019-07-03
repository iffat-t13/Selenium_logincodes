package login1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.jdi.connect.spi.TransportService.Capabilities;

public class SSLCertification_HTTPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//desired capabilities is a class which helps to customize chrome browser and then pass the object of that capabilities to your chrome options. in this way browser will have knowledge of wht you are doing 
		DesiredCapabilities ch=DesiredCapabilities.chrome(); //because we are doing for chrome browser
		//there are multiple ways for example, you can use any from below
		/*1*/ ch.acceptInsecureCerts(); //it means object ch now has the knowledge of accepting certification. And after this you need to pass ch object to your chrome options
		//so first you create a profile for ch which has knowledge of certification and then you pass that profile to your chrome browser
		/*2*/ //ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); 
		/*3*/ //ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); //this means it accepts the certification
		
		ChromeOptions c=new ChromeOptions(); //here ChromeOptions is the class and c is the object of that class. this chromeoptions belongs to your local chrome browser 
		c.merge(ch);  
		
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);
	}

}
