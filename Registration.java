package devops;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Registration {
	public WebDriver driver;
	  @Test
	  public void f() {
	     
	    
	    driver.findElement(By.xpath("//*[@value='First Name']")).sendKeys("nipun");
	    driver.findElement(By.xpath("//*[@value='Last Name']")).sendKeys("aeron");
	   
	    driver.findElement(By.id("u_0_5")).sendKeys("nipun.aeron123@gmail.com");
	   
	    driver.findElement(By.id("u_0_8")).sendKeys("nipun.aeron123@gmail.com");
	    driver.findElement(By.id("u_0_a")).sendKeys("abc12345");
	    new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//*[@name='birthday_day']"))).selectByVisibleText("3");
	   
	    new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//*[@id='month']"))).selectByValue("11");
	   
	    new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//*[@id='year']"))).selectByValue("1987");
	    driver.findElement(By.xpath("//*[@id='u_0_g']/span[1]/label")).click();
	    driver.findElement(By.xpath("//*[@id='u_0_i']")).click();
	      
	  }
	  @BeforeTest
	  public void beforeTest() {
	  driver = new FirefoxDriver();
	      driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest() {
	  }

}
