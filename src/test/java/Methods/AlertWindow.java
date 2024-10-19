package Methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		
		//Confiration alert
		//driver.findElement(By.xpath("//button[normalize-sapce()='Click for JS Confirm']")).click();
		//Thread.sleep(5000);
		//driver.switchTo().alert().dismiss();
		
		//Prompt alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
		Thread.sleep(5000);
		Alert myalert=driver.switchTo().alert();
		System.out.println("Text msg o alert"+myalert.getText());
		myalert.sendKeys("Welcome");
		myalert.accept();
		}

}
