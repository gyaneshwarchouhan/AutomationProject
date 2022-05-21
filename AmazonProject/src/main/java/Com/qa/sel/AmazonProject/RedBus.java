package main.java.Com.qa.sel.AmazonProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.via.com/bus-tickets");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("src")).sendKeys("Pune Airport");
		
		driver.findElement(By.id("dest")).sendKeys("Nagpur");
		    
		
	}

}
