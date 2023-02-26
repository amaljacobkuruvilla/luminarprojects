package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAmazonlog {
	WebDriver driver;
@Before
public void setup() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
}
@Test
public void mob() {
	driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobile");
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dlfkjdkfs");
driver.findElement(By.xpath("//input[@id='continue']")).click();
driver.navigate().back();
driver.navigate().back();
driver.findElement(By.xpath("//div[@id='nav-xshop']/a[6]")).click();
driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
}
}
