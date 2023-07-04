package Pom_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_pack.BasePage;

public class Pom_class extends BasePage
{
	@FindBy(id="email")
	private WebElement unField;
	
	@FindBy(id="pass")
	private WebElement pwdField;

	@FindBy(name="login")
	private WebElement loginBtn;


public Pom_class(WebDriver driver) 
{
	super(driver);
}

public void passUN(String un)
{
	unField.sendKeys(un);
}

public void passPwd(String pwd)
{
	pwdField.sendKeys(pwd);
}

public void btnClick()
{
	loginBtn.click();
}

}
