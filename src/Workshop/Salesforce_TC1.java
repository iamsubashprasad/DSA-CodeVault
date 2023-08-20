
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;



public class Salesforce_TC1 {
	
	public static ChromeDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		String URL = "https://testleaf30-dev-ed.develop.my.salesforce.com/";
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ranjini.r@testleaf.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//div[@role='navigation']//button[1]")).click();
        driver.findElement(By.xpath("//p[text()='Marketing']")).click();
        Thread.sleep(2000);
        
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//span[text()='Leads']"));
        jsExecutor.executeScript("arguments[0].click();", element);
        

        driver.findElement(By.xpath("//div[@title='New']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
        driver.findElement(By.xpath("//span[text()='Mr.']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Subash");
        driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("Citi");
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@name='Convert']")).click();
        Thread.sleep(2000);

        WebElement element1 = driver.findElement(By.xpath("//button[text()='Convert']"));
        jsExecutor.executeScript("arguments[0].click();", element1);

	}

}
