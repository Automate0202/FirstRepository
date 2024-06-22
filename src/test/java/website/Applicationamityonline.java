package website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class Applicationamityonline {
	public static WebDriver driver;
	
	@Test
	
	public void f() throws InterruptedException
	{
		driver.findElement(By.id("International")).click();
		driver.manage().window().maximize();


	driver.findElement(By.id("textName")).sendKeys("Testrw6");
	driver.findElement(By.id("textEmail")).sendKeys("tesryt@gail.com");
	driver.findElement(By.id("textMobile")).sendKeys("9999887323");	
	WebElement dropdown=driver.findElement(By.id("textMobileCode"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].value=' 1';", dropdown);
	driver.findElement(By.id("applyNow")).click();
	
Thread.sleep(5000);
	
	driver.findElement(By.className("buttondesign")).click();
	
	Thread.sleep(5000);
	
    WebElement ddown = driver.findElement(By.id("CountryId"));
    Select select = new Select(ddown);
    select.selectByValue("278");
    
    WebElement ddown1 = driver.findElement(By.id("NationalityId"));
    Select select1 = new Select(ddown1);
    select1.selectByValue("278");
    
    WebElement ddown2 = driver.findElement(By.id("ProgramId"));
    Select select2 = new Select(ddown2);
    select2.selectByValue("440");
    
    Thread.sleep(5000);
    
    WebElement ddown3 = driver.findElement(By.id("SpecializationList"));
    Select select3 = new Select(ddown3);
    select3.selectByValue("1");
    
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    
    Thread.sleep(3000);
    driver.findElement(By.id("btnFSave")).click();
    
    Thread.sleep(3000);
    
    
    WebElement element= driver.findElement(By.xpath("//a[@href='/admission/Home/Dashboard']"));
    element.click();
    
    Thread.sleep(3000);
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    
    Thread.sleep(3000);
   WebElement element1= driver.findElement(By.xpath("//button[normalize-space()='Continue Application']"));
   element1.click();
   js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
   WebElement calendarDropdown = driver.findElement(By.id("txtDob"));
   calendarDropdown.click();
   List<WebElement> dates = driver.findElements(By.xpath("//input[@id='txtDob']"));
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedrivere.exe");
		driver=new ChromeDriver();
		driver.get("https://application.amityonline.com/admission/Home/SignUp");
		}
	@AfterTest
	public void afterTest()
	{
		driver.close();
	}
	
	
}
