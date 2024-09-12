import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {

	public static void main(String[] args) {
		WebDriver driver=WebDriverManager.chromedriver().create();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		driver.findElement(By.id("Form_getForm_subdomain")).sendKeys("biksh");
		driver.findElement(By.id("Form_getForm_Name")).sendKeys("Bikash1992@");
		driver.findElement(By.name("Email")).sendKeys("Bikashdhungana@yahoo.com");
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("4156249892");
		Select sel=new Select (driver.findElement(By.id("Form_getForm_Country")));
		sel.selectByVisibleText("Albania");
	
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		/// Select seal =new Select (driver.findElement(By.id("select-options")));
		// sel.selectByVisibleText("Albania");
		
		 
		
		
		
		
	}

}
