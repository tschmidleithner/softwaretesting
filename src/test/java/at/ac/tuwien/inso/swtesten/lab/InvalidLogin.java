package at.ac.tuwien.inso.swtesten.lab;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvalidLogin {
	private WebDriver driver;
	private String baseUrl;

	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://sportsid.risedev.at/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void test_invalidLogin() throws Exception {

		setUp();

		driver.get(baseUrl + "/#pages.login");
		driver.findElement(By.id("input-username")).clear();
		driver.findElement(By.id("input-username")).sendKeys("gruppe04b");
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys("1");

		String title_before = driver.getTitle();

		driver.findElement(By.id("login-button")).click();

		assertEquals(title_before, driver.getTitle());

	}
}
