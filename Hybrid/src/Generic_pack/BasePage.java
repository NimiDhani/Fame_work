package Generic_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage 
{
		
		public WebDriver driver;
		public BasePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		} 