package ValTech_Pom;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageModel implements ValtechVariables {


	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver fd = new FirefoxDriver();
		fd.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		HomePage.open_homePage(fd, HOME_PAGE_URL);

		String actualText = HomePage.text_verificationa(fd, LATESTNEWS).getText();
		Assert.assertEquals("LATEST NEWS", actualText);

		HomePage.select_drop_down(fd).click();
		HomePage.select_items(fd, "Cases").click();
		String actualCasesPageTitle = CasesPage.expected_cases_pageTitle(fd);
		Assert.assertEquals("Cases", actualCasesPageTitle);

		HomePage.select_drop_down(fd).click();
		HomePage.select_items(fd, "Services").click();
		String actualServicesPageTitle = ServicesPage.expected_services_pageTitle(fd);
		Assert.assertEquals("Services", actualServicesPageTitle);

		HomePage.select_drop_down(fd).click();
		HomePage.select_items(fd, "Jobs").click();
		String actualJobsPageTitle = JobsPage.expected_jobs_pageTitle(fd);
		Assert.assertEquals("Jobs", actualJobsPageTitle);

		HomePage.click_global_button(fd).click();
		int totaloffices = ContactPage.get_office_contact(fd);
		System.out.println("totaloffices :::" + totaloffices);
		HomePage.close_browser(fd);

		System.out.println("end");

	}

}
