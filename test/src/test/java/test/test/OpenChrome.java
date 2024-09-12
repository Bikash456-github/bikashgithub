

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class OpenChrome {
	
	public static void main(String[] args) {
	
	WebDriver driver = WebDriverManager.chromedriver().create();
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		 driver.findElement(By.name("account.firstName")).sendKeys("BIKASH");
		 driver.findElement(By.name("account.city")).sendKeys("San Francisco");
		 driver.findElement(By.name("account.email")).sendKeys("Bikashdhungana651@yahoo.com");
		 driver.findElement(By.id("stripes--1486090393")).sendKeys("RAKESH5076");
		//driver.findElement(By.name("account.phone")).sendKeys("4156249892");
		 driver.findElement(By.cssSelector("input[name='account.phone']")).sendKeys("bikash");
		 driver.findElement(By.name("account.phone")).sendKeys("bikash dhungana1");
		 driver.findElement(By.name("account.lastName")).sendKeys("bikassh");
		 driver.findElement(By.name("mobile")).sendKeys("4156249892");
		 Select sel =new Select (driver.findElement(By.xpath("//select[@id='country']")));
		 sel.selectByVisibleText("United States");
		 driver.findElement(By.id("city")).sendKeys("Nepal");
		 driver.findElement(By.name("message")).sendKeys("bikash loves sarmila");
		 
		
		
		
		 	
		 	
	}

}
