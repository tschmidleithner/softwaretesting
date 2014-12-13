package at.ac.tuwien.inso.swtesten.lab;

import static org.junit.Assert.assertEquals;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import at.ac.tuwien.inso.swtesten.util.SeleniumWebDriver;

public class ValidAddMemberFormSubmit {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  public void setUp() throws Exception {
    driver = SeleniumWebDriver.getCurrentDriver();
    baseUrl = "https://sportsid.risedev.at/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  public void login(){
	driver.get(baseUrl + "/#pages.login");
	driver.findElement(By.id("input-username")).clear();
	driver.findElement(By.id("input-username")).sendKeys("gruppe04a");
	driver.findElement(By.id("input-password")).clear();
	driver.findElement(By.id("input-password")).sendKeys("1234");
	driver.findElement(By.id("login-button")).click();
  }

  public void createUser(String name) {
	  
	  login();
	
	  driver.findElement(By.id("nav-members")).click();
    driver.findElement(By.id("nav-members-list")).click();
    
    driver.findElement(By.cssSelector("#new-member > span.ui-button-text > span.button-content")).click();
    
    driver.findElement(By.id("member-family-name-native")).clear();
    driver.findElement(By.id("member-family-name-native")).sendKeys("MAX");
    driver.findElement(By.id("member-first-name-native")).clear();
    driver.findElement(By.id("member-first-name-native")).sendKeys(name);
    driver.findElement(By.cssSelector("button.ui-datepicker-trigger")).click();
    driver.findElement(By.linkText("8")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.id("ui-id-9")).click();
    driver.findElement(By.id("member-gender-m")).click();
    driver.findElement(By.id("member-family-name")).clear();
    driver.findElement(By.id("member-family-name")).sendKeys("MXILEIT");
    driver.findElement(By.id("member-first-name")).clear();
    driver.findElement(By.id("member-first-name")).sendKeys("WASAUCHUMMER");
    driver.findElement(By.cssSelector("#save-member > span.ui-button-text > span.button-content")).click();
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }

public void hasUser(String arg1) {
	// TODO Auto-generated method stub
	//driver.findElement(By.id());
}
}
