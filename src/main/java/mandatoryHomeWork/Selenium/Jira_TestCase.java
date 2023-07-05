package mandatoryHomeWork.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Jira_TC {
	@Test
	public void test() throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver",	"C:\\Users\\WELCOME\\Documents\\SDET\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://sivasdetteam3.atlassian.net/jira/software/projects/SDET/boards/1/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hemamalinig1827@gmail.com");
		driver.findElement(By.id("login-submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("password")).sendKeys("Tquniv@$1827");
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("//h2[text()='Recent projects']/parent::div//following-sibling::div")).click();
		driver.findElement(By.id("createGlobalItem")).click();
		driver.findElement(By.id("summary-field")).sendKeys("HemaStory");
		
		
		
		
		
		
		
		
		
	}
}
