package regpkg;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import sdpkg.REGPAGE;
import sdpkg.SDVRL;

public class TESTPAGE 
{
	WebDriver Driver;
	@BeforeTest
	public void setup()
	{
		Driver=new EdgeDriver();			
	}
	@BeforeMethod
	public void urlloading()
	{
	 Driver.get("https://www.vrlbus.in/"); 
	}
	@Test
	public void test1() throws Exception
	{
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Driver.manage().window().maximize();
		SDVRL sd=new SDVRL(Driver); 
		JavascriptExecutor js=(JavascriptExecutor)Driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		Driver.navigate().refresh();
		sd.Setvalues("AHAMADABAD", "BANGALORE", "06/9/23");
		sd.login();
		Driver.navigate().refresh();
		REGPAGE reg=new REGPAGE(Driver);
		reg.values("Radhika", "ann@gmail.com.", "1234567890");
	}
	

}
