package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Busbookingg {
WebDriver driver;
By busicon=By.xpath("//*[@id=\"homepagemenuUL\"]/li[5]/a/span[1]");//click
By clickfrom=By.xpath("//*[@id=\"txtSrcCity\"]");//click
By froom=By.xpath("//*[@id=\"srcNav\"]/li[2]");//click
By clicktoo=By.xpath("//*[@id=\"txtDesCity\"]");//click
By ttoo=By.xpath("//*[@id=\"desNav\"]/li[26]");//click

By datecolumn=By.xpath("//*[@id=\"datepicker\"]");
By actual=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]");
By nxtarr=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span");
By dateee=By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a");
By searchdp=By.xpath("//*[@id=\"srcbtn\"]");


By selectseat=By.xpath("//*[@id=\"myBtn\"]");
By dropdownbp=By.xpath("//*[@id=\"selectBoard\"]");
By boarding=By.xpath("//*[@id=\"seatBpPoint\"]/li[2]/a");
By dropdowndp=By.xpath("//*[@id=\"selectDrop\"]");
By dropping=By.xpath("//*[@id=\"seatDropUL\"]/li[8]/a");
By seat=By.xpath("//*[@id=\"myModal\"]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]/ul/li[4]/div[3]");
By seatconfirm=By.xpath("//*[@id=\"myModal\"]/div/div[2]/a");
By checkboxconfi=By.xpath("//*[@id=\"InsAcko\"]/div[4]/div[3]/label/span");
By emailop=By.xpath("//*[@id=\"trvlEmail\"]");
By continuee1=By.xpath("//*[@id=\"idForJS\"]/div[2]/div[7]/div/div[2]/div[2]/form/div/div[9]/span");


By title=By.xpath("//*[@id=\"title0\"]");
By firstname=By.xpath("//*[@id=\"firstname0\"]");
By lastname=By.xpath("//*[@id=\"lastname0\"]");
By age=By.xpath("//*[@id=\"age0\"]");
By phoneno=By.xpath("//*[@id=\"TrvlMobileNo\"]");
By continuebooking=By.xpath("//*[@id=\"second-continue\"]/input");


By upi=By.xpath("//*[@id=\"txtUpi\"]");
By verifyandpay=By.xpath("//*[@id=\"section_nwupi\"]/div/div[5]/div[2]");








public Busbookingg(WebDriver driver)
{
	this.driver=driver;
}
public void click1() throws InterruptedException
{
	driver.findElement(busicon).click();
	driver.findElement(clickfrom).click();
	Thread.sleep(2000);
	driver.findElement(froom).click();
	driver.findElement(clicktoo).click();
	Thread.sleep(2000);
	driver.findElement(ttoo).click();
}
public void datepicker()
{
	String month="September";
	String date="20";
	driver.findElement(datecolumn).click();
	while(true)
	{
		String act=driver.findElement(actual).getText();
		System.out.println(act);
		
	if(act.equals(month))	
	{
		break;
	}
	else
	{
		driver.findElement(nxtarr).click();
		
	}	
	}
	driver.findElement(dateee).click();
	driver.findElement(searchdp).click();
}
public void click2() throws InterruptedException
{
	
	Thread.sleep(5000);
	driver.findElement(selectseat).click();
	
	WebElement boardingpoint=driver.findElement(dropdownbp);
	boardingpoint.click();
	
	Thread.sleep(5000);
	driver.findElement(boarding).click();
	
	WebElement dropingpoint=driver.findElement(dropdowndp);
	dropingpoint.click();
	
	Thread.sleep(5000);
	driver.findElement(dropping).click();
	
	Thread.sleep(5000);
	driver.findElement(seat).click();
	driver.findElement(seatconfirm).click();
	
	
	Thread.sleep(2000);
	driver.findElement(checkboxconfi).click();
	Thread.sleep(2000);
	driver.findElement(emailop).sendKeys("aedsrdrds23@gmail.com");
	driver.findElement(continuee1).click();
	
}
public void travellerdetail()
{
	WebElement we= driver.findElement(title);
	Select ti=new Select(we);
	ti.selectByVisibleText("Mr");
	driver.findElement(firstname).sendKeys("Boston");
	driver.findElement(lastname).sendKeys("Ferno");
	driver.findElement(age).sendKeys("30");
	driver.findElement(phoneno).sendKeys("7902948746");
	driver.findElement(continuebooking).click();
}
public void payment() throws InterruptedException
{
	Thread.sleep(7000);
	driver.findElement(upi).sendKeys("asfddtdfddrs@okcici");
	Thread.sleep(7000);
	driver.findElement(verifyandpay).click();
}
}
