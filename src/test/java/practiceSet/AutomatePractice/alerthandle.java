package practiceSet.AutomatePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerthandle 
{
	//public static WebDriver driver;
	@Test
	public  void setup() throws InterruptedException
	{
		System.out.println( System.getProperty("user.dir"));
		WebDriverManager.chromedriver().setup();
		/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//chromedriver.exe");*/
		WebDriver	driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement username=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.id("login"));
		username.sendKeys("");
		password.sendKeys("pass123");
		login.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();
		
		
	}
	
	public void Allowpopup()
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
	}
	
}
