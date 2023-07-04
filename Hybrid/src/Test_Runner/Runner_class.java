 package Test_Runner;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_pack.Base_Test;
import Pom_pack.Pom_class;

public class Runner_class extends Base_Test

{
	@Test(dataProvider="test1")
	public void loginpage(String d1,String d2) throws InterruptedException
	{
	Pom_class p=new Pom_class(driver);
	p.passUN(d1);
	p.passPwd(d2);
	Thread.sleep(2000);
	p.btnClick();
	Assert.fail();
}

	@DataProvider(name = "test1")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Nimitha14","12578nd"},
	   { "Anne" ,"12345"},
	 };
	}
}