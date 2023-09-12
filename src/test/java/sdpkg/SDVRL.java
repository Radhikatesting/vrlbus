package sdpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SDVRL 
{
	WebDriver Driver;
	By vrlsource=By.id("FromCity");
	By vrldestination=By.id("ToCity");
	By vrldepature=By.id("txtFromDate");
	By vrlserach=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");
	public SDVRL(WebDriver Driver)
	{
		this.Driver=Driver;
	}
	public void Setvalues(String FromCity,String ToCity,String txtFromDate)
	{
	Driver.findElement(vrlsource).sendKeys(FromCity);	
	Driver.findElement(vrldestination).sendKeys(ToCity);
	Driver.findElement(vrldepature).clear();
	Driver.findElement(vrldepature).sendKeys(txtFromDate);
	}
	public void login()
	{
		Driver.findElement(vrlserach).click();
	}

}
