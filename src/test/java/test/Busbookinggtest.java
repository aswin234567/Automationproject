package test;

import org.testng.annotations.Test;

import page.Busbookingg;

public class Busbookinggtest extends Baseclass {
@Test
public void booki() throws InterruptedException
{
	driver.manage().window().maximize();
	Busbookingg bb=new Busbookingg(driver);
	bb.click1();
	bb.datepicker();
	bb.click2();
	bb.travellerdetail();
	bb.payment();
}
}
