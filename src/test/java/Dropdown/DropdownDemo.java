package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropcountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		Select dropcountry=new Select(dropcountryEle);
		
		//dropcountry.selectByVisibleText("France");
		// dropcountry.selectByValue("japan");
		//dropcountry.selectByIndex(2);
		
		//capture the options from the dropdown
		
		List<WebElement>options=dropcountry.getOptions();
		System.out.println("Number of options in a drop down: "+options.size());
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println( options.get(i).getText());
		}
		
		}

}
