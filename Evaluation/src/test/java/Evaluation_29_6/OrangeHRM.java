package Evaluation_29_6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver;

@BeforeTest

	public void bt() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();

}

@Test

public void test1() throws InterruptedException {
	Thread.sleep(3000);

	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(3000);
	
	//click on admin
	driver.findElement(By.linkText("Admin")).click();
	Thread.sleep(3000);
	
	//driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[1]")).click();
	
	//driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")).click();
	
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link']")).click();
	
	////input[@placeholder='Type for hints...']
	
	//dynamic dropdown
	
	driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Ranga");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='oxd-autocomplete-option']")).click();

	Thread.sleep(3000);
	
	//james butler
	
	WebElement drpdwn = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
	drpdwn.sendKeys(Keys.CONTROL+"a");
	drpdwn.sendKeys(Keys.BACK_SPACE);
	drpdwn.sendKeys("James Butler");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='oxd-autocomplete-option']")).click();
	
	driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();


	
	
	
//	driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("James Butler");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//div[@class='oxd-autocomplete-option']")).click();
	Thread.sleep(3000);
	
	// logout
	//p[@class='oxd-userdropdown-name']
	driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	driver.findElement(By.linkText("Logout")).click();


	

	
	
	
	


}

}
