import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=WebDriverManager.chromedriver().create();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver=new ChromeDriver();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.findElement(By.id("UserFirstName-Elsj-errMsg")).sendKeys("vbikash");
		driver.findElement(By.id("UserEmail-2A2s-errMsg")).sendKeys("@Yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"UserEmail-2A2s\"]")).sendKeys("rakesh");
		
		driver.findElement(By.name("UserPhone")).sendKeys("bikash");
		driver.findElement(By.id("UserPhone-euVf")).sendKeys("bikash");
		
		Set<String>windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator<String>  iterator =windowhandles.iterator();
		String parentwindow=iterator.next();
		System.out.println(parentwindow);
		String childwindow=iterator.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		driver.switchTo().window(parentwindow);
	
	
	

}}
