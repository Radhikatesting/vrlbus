package sdpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class REGPAGE 
{
	WebDriver Driver;
	By vrlcontact=By.id("txtcontactPerson");
	By vrlemail=By.id("txtEmail");
	By vrlmobile=By.id("txtMobileNo");
	By vrlbusesoncontact=By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[4]/a");

public REGPAGE(WebDriver Driver)
{
	this.Driver=Driver;
}



public void open()
{
	Driver.manage().window().maximize();
	Driver.findElement(vrlbusesoncontact).click();
}
	public void values(String name,String email,String mobilenum)
	{
		Driver.findElement(vrlcontact).sendKeys(name);
		Driver.findElement(vrlemail).sendKeys(email);
		Driver.findElement(vrlmobile).sendKeys(mobilenum);
	}
	
	
}
