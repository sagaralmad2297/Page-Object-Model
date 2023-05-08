package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomobjects.Reddifloginpage;

public class loginpage {
		@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./javaseleniumm/chromedriver1.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			Reddifloginpage re=new Reddifloginpage(driver);
			re.emailid().sendKeys("very hard");
			re.password().sendKeys("harddd");
			re.go().click();
			driver.close();
			}

}
