package main.java.Com.qa.sel.AmazonProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https:\\www.amazon.in/");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.id("ap_email")).sendKeys("gyaneshwarchouhan123@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Sanju123");
	driver.findElement(By.id("signInSubmit")).click();
	
		
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("face wash");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	driver.findElement(By.xpath("//span[@class='a-truncate-full']")).click();


	
	//driver.close();
}
}
