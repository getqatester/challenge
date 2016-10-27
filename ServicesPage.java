package ValTech_Pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServicesPage implements ValtechVariables {

	@SuppressWarnings("unused")
	private static String expectedText = null;

	public static String expected_services_pageTitle(WebDriver driver) {
		return expectedText = driver.findElement(By.tagName("H1")).getText();

	}

}