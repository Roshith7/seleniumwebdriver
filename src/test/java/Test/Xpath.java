package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"MDjtu6\"]/div/label/input")).click();
		
		//Xpath with single attribute
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Iphone");
	}

}
