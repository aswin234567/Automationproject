package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Datepickerr {
WebDriver driver;

//place

By from=By.xpath("//*[@id=\"FromSector_show\"]");
By goa=By.xpath("//*[@id=\"spn5\"]");


//datepicker

By datecolumn=By.xpath("//*[@id=\"ddate\"]");
By actual=By.xpath("//*[@id=\"dvcalendar\"]/div/div[1]/div/div[1]/div[2]");
By nxtarrow=By.xpath("//*[@id=\"img2Nex\"]");
By datee=By.xpath("//*[@id=\"trd_5_15/11/2024\"]");
By datecolumn2=By.xpath("//*[@id=\"rtag\"]");
By datee2=By.xpath("//*[@id=\"frth_1_18/11/2024\"]");

//checkbox

By checkbox1=By.xpath("//*[@id=\"divFamilyFare\"]/ul/li[4]/label/span");

//search
By searchh=By.xpath("//*[@id=\"showOWRT\"]/div/div[8]/button");

public Datepickerr(WebDriver driver)
{
	this.driver=driver;
}

public void clickk1() throws InterruptedException
{
	driver.findElement(from).click();
	Thread.sleep(2000);
	WebElement e=driver.findElement(goa);
	e.click();
	
	
}
public void datepicker()
{
	String month="NOV 2024";
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
		driver.findElement(nxtarrow).click();
		
	}
			
		
	}
	driver.findElement(datee).click();
	driver.findElement(datecolumn2).click();
	driver.findElement(datee2).click();
}

public void checkbox()
{
 WebElement we=driver.findElement(checkbox1);
 we.click();
	
}
public void searchh()
{
	driver.findElement(searchh).click();
}

















}
