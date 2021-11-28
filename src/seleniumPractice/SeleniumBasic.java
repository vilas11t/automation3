package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("mailicon")).click();
		driver.findElement(By.id("login1")).sendKeys("user1");
		driver.findElement(By.name("passwd")).sendKeys("password");
		driver.findElement(By.name("proceed")).click();
		
	}

}
