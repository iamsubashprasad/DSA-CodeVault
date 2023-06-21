import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JIRA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\subas\\Documents\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String GoIbibo_URL = "https://www.goibibo.com/";
		String fromCity = "Chennai";
		String toCity = "Bangalore";
		
		
	    
		
		
		driver.get(GoIbibo_URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Click on Holiday Button 
		driver.findElement(By.xpath("//a[normalize-space()='Holidays']")).click();
		
		//Choose to and from city
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String currentHandle= driver.getWindowHandle();
		
		//Switch the tab
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();

		for (String window : handles)
			if (!window.equals(parentWindow))
				driver.switchTo().window(window);
		
		//Sending the to and from city
		driver.findElement(By.xpath("//input[@id='fromCity']")).clear();
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys(fromCity);
		driver.findElement(By.xpath("//input[@id='toCity']")).clear();
		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys(toCity);
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//selecting date and default room
		driver.findElement(By.xpath("//span[@class='appendBottom5 field-label down-arrow']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Fri Jun 23 2023']//p[@class='dateInnerPara'][normalize-space()='23']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='APPLY']")).click();
		
		//click on the search
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		
		
		//choose the max amount
		driver.findElement(By.xpath("//div[@class='rightBorder topContainer']//div[4]")).click();
		
		// selecting the 4N Option 
		driver.findElement(By.xpath("(//span[contains(@data-testid,'days-badge')])[1]")).click();
		
		
		
		
		
		Thread.sleep(1000);
		
		

	}

}
