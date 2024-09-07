package test;

import org.testng.annotations.Test;

import page.Linksandtitle;

public class Titleverificationandlinktest extends Baseclass{
	@Test
public void test1()
{
	Linksandtitle lt=new Linksandtitle(driver);
	lt.titleverification();
	lt.totallinks();
}
}
