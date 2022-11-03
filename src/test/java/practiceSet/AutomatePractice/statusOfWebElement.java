package practiceSet.AutomatePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class statusOfWebElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://172.18.21.45:9090/ui/");
		WebElement logo=driver.findElement(By.id("logo")); 	
		//System.out.println(logo.isEnabled());
		System.out.println("logo displayed"+logo.isDisplayed());
		WebElement username=driver.findElement(By.id("username")); 
		System.out.println("username enabled-->"+logo.isEnabled());
		//logo.isSelected();  used in radio buttons,check boxes, drop down
		
	}

}
