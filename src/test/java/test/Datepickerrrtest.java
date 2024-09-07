package test;

import org.testng.annotations.Test;

import page.Datepickerr;

public class Datepickerrrtest extends Baseclass{
@Test
public void test1() throws InterruptedException
{
	Datepickerr de=new Datepickerr(driver);
	de.clickk1();
	de.datepicker();
	de.checkbox();
	de.searchh();
}
	
	
}
