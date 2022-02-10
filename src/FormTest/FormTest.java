package FormTest;

import d7_02_2022.BeforeMethod;
import d7_02_2022.ChromeDriver;
import d7_02_2022.FormPage;
import d7_02_2022.JavascriptExecutor;
import d7_02_2022.Test;
import d7_02_2022.WebDriver;
import d7_02_2022.WebDriverWait;

public class FormTest {
	public class FormTest {
		private WebDriver driver;
		private FormPage formPage;
		private WebDriverWait wait;
		private JavascriptExecutor js;

		@BeforeMethod
		public void beforeMethod() {
			System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
			driver = new ChromeDriver();
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			js = (JavascriptExecutor) driver;
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

			driver.get("file:///C:/Users/Korisnik/Downloads/form.html");
			formPage = new FormPage(driver, wait);
		}

		@Test
		public void formTest() throws InterruptedException {
			formPage.fillInTheForm("Jelena Nicic", "female", "1991", "nicic@gmail.com", "QA", "online_courses", "Hey!");
			Thread.sleep(2000);
			formPage.getSubmitButton().click();
			Thread.sleep(1000);
			Assert.assertTrue(formPage.isDataSaved(), "Data not saved!");
		}

		
}
