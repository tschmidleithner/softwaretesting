package at.ac.tuwien.inso.swtesten.lab;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
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

	public void invalid_login() {
		driver.get(baseUrl + "/#pages.login");
		driver.findElement(By.id("input-username")).clear();
		driver.findElement(By.id("input-username")).sendKeys("gruppea");
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys("1234");
		driver.findElement(By.id("login-button")).click();

	}

	public void login() {
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

		driver.findElement(
				By.cssSelector("#new-member > span.ui-button-text > span.button-content"))
				.click();

		driver.findElement(By.id("member-family-name-native")).clear();
		driver.findElement(By.id("member-family-name-native")).sendKeys("MAX");
		driver.findElement(By.id("member-first-name-native")).clear();
		driver.findElement(By.id("member-first-name-native")).sendKeys(name);
		driver.findElement(By.cssSelector("button.ui-datepicker-trigger"))
				.click();
		driver.findElement(By.linkText("8")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		driver.findElement(By.id("ui-id-9")).click();
		driver.findElement(By.id("member-gender-m")).click();
		driver.findElement(By.id("member-family-name")).clear();
		driver.findElement(By.id("member-family-name")).sendKeys("MXILEIT");
		driver.findElement(By.id("member-first-name")).clear();
		driver.findElement(By.id("member-first-name")).sendKeys("WASAUCHUMMER");
		driver.findElement(
				By.cssSelector("#save-member > span.ui-button-text > span.button-content"))
				.click();
	}

	public void hasUser(String arg1) {
		driver.get(baseUrl + "/admin.html#pages.member.list");

		String text = driver.findElement(By.cssSelector(".dataTable"))
				.getText();

		Assert.assertTrue(text.contains(arg1));
	}

	public void hasLocalOrg(String arg1) {
		driver.get(baseUrl + "/admin.html#pages.structure.localorg.list");

		String text = driver.findElement(By.cssSelector(".dataTable"))
				.getText();

		Assert.assertTrue(text.contains(arg1));
	}

	public void createLocalOrganisation(String arg1) {
		login();

		driver.findElement(By.id("nav-structure")).click();
		driver.findElement(By.id("nav-structure-list-local")).click();
		driver.findElement(By.cssSelector("span.button-content")).click();

		driver.findElement(By.id("group-name")).clear();
		driver.findElement(By.id("group-name")).sendKeys(arg1);

		driver.findElement(
				By.cssSelector("#save-localorg > span.ui-button-text > span.button-content"))
				.click();

	}
}
