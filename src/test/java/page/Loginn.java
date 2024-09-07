package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Loginn {
WebDriver driver;

By iconlogin=By.xpath("//*[@id=\"divSignInPnl\"]/a/span");
By customerlogin=By.xpath("//*[@id=\"shwlogn\"]/span[1]");
By email=By.xpath("//*[@id=\"txtEmail\"]");
By continuee1=By.xpath("//*[@id=\"shwotp\"]");
By otpp=By.id("txtOTP0");
By createmyaccount=By.xpath("//*[@id=\"OtpLgnBtn\"]");

public Loginn(WebDriver driver)
{
	this.driver=driver;
}
public void click1() throws InterruptedException 
{
	driver.findElement(iconlogin).click();
	driver.findElement(customerlogin).click();
}
public void sendkeys()
{
	driver.findElement(email).sendKeys("aswinaswi23@gmail.com");
}
public void click2() throws InterruptedException
{ Thread.sleep(5000);
	driver.findElement(continuee1).click();
}
public void sendkeys2() throws InterruptedException
{Thread.sleep(5000);
	driver.findElement(otpp).sendKeys("123654");
}
public void click3()
{
	driver.findElement(createmyaccount).click();
}
}