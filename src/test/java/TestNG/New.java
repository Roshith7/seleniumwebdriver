package TestNG;

import org.testng.annotations.Test;

public class New {

	@Test(priority=1)
	void openapp()
	{
		System.out.println("Open application");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("Login to application");

	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("Logout from application");

	}
}
