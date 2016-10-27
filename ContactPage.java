package ValTech_Pom;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage implements ValtechVariables {

	public static int totalOffices;

	public static int get_office_contact(WebDriver driver) {

		List<WebElement> linkList = driver.findElements(By.className("contactcountry"));

		for (int i = 0; i < linkList.size(); i++) {
			List<WebElement> linkInnerList = linkList.get(i).findElements(By.cssSelector("li"));
			totalOffices = linkInnerList.size() + totalOffices;
		}

		return totalOffices;
	}

}