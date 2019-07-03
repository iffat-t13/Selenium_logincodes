package login1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteGrid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		WebDriver driver= new RemoteWebDriver(new URL("http:..localhost:4444/wd/hub"),dc); //for remote this how u declare driver object. dc object is passed as argument for this method
		//u cant provide direct url. so u need to provide class "new URL" and then pass hub ip address, which is the local host) 4444 is the port no. and pass parameter wd/hub.
	}

}
