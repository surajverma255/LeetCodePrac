import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NaukriUpdateScript {
private WebDriver driver;
By LoginButton = By.xpath("//div[contains(text(),'Login')]");
By UserName = By.xpath("//input[contains(@placeholder,'Username')]");
By password = By.xpath("//input[contains(@placeholder,'password')]");
By submit = By.xpath("//button[contains(@class,'loginButton')]");
By UserTitle = By.xpath("//div[contains(@title,'Suraj Verma')]");
By crossIcon = By.xpath("//div[contains(@class,'crossIcon')]");
By editButton = By.xpath("//em[contains(@class,'icon edit')]");
By MonthsDropdown = By.xpath("//input[contains(@placeholder,'Months')]");
By saveButton = By.xpath("//button[contains(@id,'saveBasicDetailsBtn')]");
By lastUpdatedValue = By.xpath("//span[contains(text(),'Profile Last updated')]/following-sibling::span");

private String UserUserName = "surajverma255@gmail.com";
private String UserPassword = "*password*";
	@BeforeTest
	public void DriverInit() {
		
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		
	}
	
	@Test(priority=1)
	public void loginNaukri() {
		driver.get("https://www.naukri.com/");
		driver.findElement(LoginButton).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(UserName).sendKeys(UserUserName);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(password).sendKeys(UserPassword);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(submit).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals(driver.findElement(UserTitle).getText(), "Suraj Verma");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		if(driver.findElement(crossIcon).isDisplayed()) {
//			driver.findElement(crossIcon).click();
//		}
		
	} 
	
	@Test(priority=2)
	public void UpdateExperience() throws InterruptedException {
		driver.findElement(UserTitle).click();
		driver.findElement(editButton).click();
		Thread.sleep(5000);
		String experienceInMonths = driver.findElement(MonthsDropdown).getAttribute("value");
		if(experienceInMonths.contains("5")) {
			driver.findElement(MonthsDropdown).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'4 Months')]")).click();
			driver.findElement(saveButton).click();
			Thread.sleep(2000);
			Assert.assertEquals(driver.findElement(lastUpdatedValue).getText(), "today");
		}
		else if(experienceInMonths.contains("4")) {
			driver.findElement(MonthsDropdown).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'5 Months')]")).click();
			driver.findElement(saveButton).click();
			Thread.sleep(2000);
			Assert.assertEquals(driver.findElement(lastUpdatedValue).getText(), "today");
		}
	}
	
	
	@AfterTest
	public void BrowserClose() {
		driver.quit();
	}
	
}
