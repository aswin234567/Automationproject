package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	WebDriver driver;
	@BeforeTest
	public void setupp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.easemytrip.com/?adgroupid=1162184594500679&msclkid=24f24eebbbea10f6948a285733803e92&utm_source=bing&utm_medium=cpc&utm_campaign=Non%20Brand%20(Flights%20Booking)_Desktop&utm_term=booking%20websites&utm_content=Keywords_booking_EM");
	}
}
