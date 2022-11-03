package practiceSet.AutomatePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import fr.opensagres.poi.xwpf.converter.core.Options;
import io.github.bonigarcia.wdm.WebDriverManager;
//import jakarta.validation.constraints.AssertFalse.List;

public class dropDown 
{
	public static void main(String []args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver() ;
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement drpdwn=driver.findElement(By.id("input-country"));
		Select drpdwncountry=new Select(drpdwn);
		//drpdwncountry.selectByIndex(0);
		//System.out.println(drpdwncountry.getOptions());
		/*drpdwncountry.selectByValue("22");
		drpdwncountry.selectByVisibleText("Aruba");*/
	List<WebElement>  alloptions=drpdwncountry.getOptions();
	for(WebElement options:alloptions)
	{
		options.click();
		//options.clear();
		if(options.getText().equals("Aruba"))
			break;
		
	}
	System.out.println(alloptions.size());
	
}
}
