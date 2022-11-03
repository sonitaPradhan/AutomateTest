package practiceSet.AutomatePractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchBrowser 
{
    public static void main(String[] args) {
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver=new EdgeDriver();
    	driver.get("http://172.18.21.45:9090/ui/");//launch the url
    	driver.manage().window().maximize();//maximize the window
    	System.out.println(driver.getTitle());//return title
    	System.out.println(driver.getCurrentUrl());//return URL
    	System.out.println(driver.getPageSource());//return pagesource
    	
    	
	}
}
