package test.java.Com.qa.sel.AmazonProject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonLoginTestNG {

	@BeforeSuite
	public static void browserlaunch() {
		System.out.println("I am in launch browser");
	}
@Test(priority=1)
	public static void launchapp() {
		
		System.out.println("I am in launch app");
	}
	
@BeforeTest
	public static void login() {
		
		System.out.println("I am in login");
	}
@Test(priority=2, enabled=true)
public static void homepage() {
	
	System.out.println("I am in homepage");
}
@Test(priority=4)
public static void AddItem() {
	
	System.out.println("I am in AddItem");
}
@Test(priority=3)
public static void usermanagement() {
	
	System.out.println("I am in usermanagement");
}
@AfterTest
public static void logout() {
	
	System.out.println("I am in logout");
}
}
