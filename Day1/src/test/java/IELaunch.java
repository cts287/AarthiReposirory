import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IELaunch {
	
	
	 WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.iedriver().setup();
		WebDriver driver = new internetexplorer;
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(500);

		WebElement username = driver.findElement(By.xpath("//input[@type='text'][@name='username'] " ));
		WebElement password = driver.findElement(By.xpath("//input[@type='password'][@name='password']"	));
		WebElement logibtn = driver.findElement(By.xpath(" //input[@type='submit'][@value='Log In'] "));

		username.sendKeys("Aarthi");
		password.sendKeys("Aarthi");
		logibtn.click();
	}

	
	}


