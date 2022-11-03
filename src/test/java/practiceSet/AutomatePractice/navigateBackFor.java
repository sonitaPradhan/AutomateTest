package practiceSet.AutomatePractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigateBackFor 
{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.flipkart.com/");
		//driver.get("https://www.flipkart.com/");
		driver.navigate().back();
		//driver.navigate().forward();
		driver.navigate().refresh();
		
	}
	

}
