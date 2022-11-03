package practiceSet.AutomatePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		/*
		 * 
		 * Select(driver.findElement(By.id("Form_getForm_Country")));
		 * Cntrydrpdwn.selectByValue("India"); Select NoEmpdrpdwn=new
		 * Select(driver.findElement(By.id("Form_getForm_NoOfEmployees")));
		 * NoEmpdrpdwn.selectByValue("21 - 25");
		 */

		WebElement Cntrydrpdwn = driver.findElement(By.id("Form_getForm_Country"));
		alldrodwn(Cntrydrpdwn,"India");
		WebElement NoEmpdrpdwn = driver.findElement(By.id("Form_getForm_NoOfEmployees"));
		alldrodwn(NoEmpdrpdwn,"21 - 25");

	}

	public static void alldrodwn(WebElement ele,String value) 
	{
        Select drpvalue=new Select(ele);
        List<WebElement>  alloptions=drpvalue.getOptions();
    	for(WebElement options:alloptions)
    	{
    		//options.click();
    		//options.clear();
    		if(options.getText().equals(value))
    			options.click();
    		
    	}
        
	}
}
