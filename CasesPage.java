package ValTech_Pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CasesPage implements ValtechVariables {

	@SuppressWarnings("unused")
	private static String expectedText = null;

	public static String expected_cases_pageTitle(WebDriver driver) {
		return expectedText = driver.findElement(By.tagName("h1")).getText();

	}

}
