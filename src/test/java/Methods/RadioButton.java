package Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 
		 WebElement male_rd=driver.findElement(By.xpath("//input[@id='male']"));
		 WebElement female_rd=driver.findElement(By.xpath("//input[@id='female']"));

		 System.out.println("Before Selection:"+male_rd.isSelected());
		 System.out.println("Before Selection:"+female_rd.isSelected());

		 male_rd.click();
		 
		 System.out.println("After Selection:"+male_rd.isSelected());
		 System.out.println("After Selection:"+female_rd.isSelected());


	}

}
