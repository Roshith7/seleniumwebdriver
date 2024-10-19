package Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 //driver.findElement(By.xpath("//input[@id='sunday']")).click();
		 
		 WebElement checkbox=driver.findElement(By.xpath("//input[@id='sunday']"));
		 //System.out.println("Beforeselecting "+checkbox.isSelected());
		 //driver.findElement(By.xpath("//input[@id='sunday']")).click();
		 //System.out.println("After selection "+checkbox.isSelected());
		 
		 //Capture all checkbox
		 List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		 System.out.println("Number of checkboxes"+checkboxes.size());
		 
		 for(int i=0;i<checkboxes.size();i++)
		 {
			 checkboxes.get(i).click();
		 }
	}

}
