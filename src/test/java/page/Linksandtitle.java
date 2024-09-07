package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Linksandtitle {
WebDriver driver;


public Linksandtitle(WebDriver driver)
{
	this.driver=driver;
}

public void titleverification()

{
	String t=driver.getTitle();
	String expected="Book Flights, Hotels, Holidays, Bus & Train Tickets - EaseMyTrip.com";
	if(t.equals(expected))
	{
		System.out.println("Title -"+expected);
	}
	else
	{
		System.out.println("failed");
	}
}
public void totallinks()
{
	List<WebElement>listt= driver.findElements(By.tagName("a"));
	System.out.println("Total links - "+listt.size());
	for(WebElement s:listt)
	{
		String link=s.getAttribute("href");
		System.out.println(link+"----");
	}
}
}
