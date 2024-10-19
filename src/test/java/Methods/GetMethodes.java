package Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		String window=driver.getWindowHandle();
		System.out.println("Window ID:"+window);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windows=driver.getWindowHandles();
		System.out.println("Windows ID: "+windows);
		}

}
