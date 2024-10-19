package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatoters {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		//WebElement search=driver.findElement(By.name("search"));
		//search.sendKeys("MacBook"); 
		
		//Name
		driver.findElement(By.name("search")).sendKeys("MacBook");
		
		//id
		boolean status=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println("Displayed status: "+status);
		
		//LinkText
		driver.findElement(By.linkText("Contact Us")).click();
		
		//PartialLinktext
		driver.findElement(By.partialLinkText("Tab")).click();
		
		//Classname
		List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item"));
		System.out.println(headerlinks.size());
	}

}
