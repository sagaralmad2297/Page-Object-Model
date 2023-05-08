package pomobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reddifloginpage {
WebDriver driver;
	
	public Reddifloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
    @FindBy(xpath="//input[@id='login1']")
    WebElement username;
    
    @FindBy(name="passwd")
    WebElement password;
    
    @FindBy(name="proceed")
    WebElement go;
	 
	 
	public WebElement emailid() {
		// TODO Auto-generated method stub
		 return username;
	}


	public  WebElement password() {
		// TODO Auto-generated method stub
		return password;
	}


	public WebElement go() {
		// TODO Auto-generated method stub
		return go;
		
	}


}
