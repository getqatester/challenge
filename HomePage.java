package ValTech_Pom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage implements ValtechVariables {

	@SuppressWarnings("unused")
	private static WebElement element = null;

	public static void open_homePage(WebDriver driver, String expectedString) {
		driver.get(expectedString);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}

	public static WebElement text_verificationa(WebDriver driver, String expectedElement) {
		return element = driver.findElement(By.className(expectedElement));

	}

	public static WebElement select_drop_down(WebDriver driver) {
		new WebDriverWait(driver, 3).until(ExpectedConditions.elementToBeClickable(By.id(DROPDOWN_BUTTON)));
		return element = driver.findElement(By.id(DROPDOWN_BUTTON));

	}

	public static WebElement select_items(WebDriver driver, String menuItemName) {
		new WebDriverWait(driver, 3).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='" + menuItemName + "']")));
		return element = driver.findElement(By.xpath("//a[@title='" + menuItemName + "']"));

	}

	public static WebElement click_global_button(WebDriver driver) {
		new WebDriverWait(driver, 3).until(ExpectedConditions.elementToBeClickable(By.className(GLOBAL_CONTACT_BUTTON)));
		return element = driver.findElement(By.className(GLOBAL_CONTACT_BUTTON));
	}

	public static void close_browser(WebDriver driver) {
		driver.quit();
	}
}
