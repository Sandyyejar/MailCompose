package selenium;
 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class GmailData 
   {
 
	public static void main(String[] args) throws InterruptedException 
            {
 
		System.setProperty("webdriver.chrome.driver", "path of chrome driver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("User mail id");
	        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		
		
		WebElement passwordButton = driver.findElement(By.xpath("//input[@name='password']"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(passwordButton));
		passwordButton.sendKeys("Password for Email");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		
		
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		
 
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("Sender e-mail id");
 
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Selenium script");
		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("Selenium script to send mail");
		

                driver.findElement(By.xpath("//input[@name='Filedata']")).sendKeys("D:\\maven.txt");
                driver.findElement(By.xpath("//div[text()='Send']")).click();
	    }



   }