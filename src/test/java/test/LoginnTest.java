package test;


import org.testng.annotations.Test;

import page.Loginn;

public class LoginnTest extends Baseclass{
@Test
public void test2() throws InterruptedException
{   driver.manage().window().maximize();
	Loginn ln=new Loginn(driver);
	ln.click1();
	ln.sendkeys();
	ln.click2();
	ln.sendkeys2();
	ln.click3();
	
	
}
}
