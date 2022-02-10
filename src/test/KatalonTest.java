package test;

public class KatalonTest {
	private WebDriver driver;
	private KatalonPage katalonPage;@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get("https://cms.demo.katalon.com/");
		katalonPage = new KatalonPage(driver);
	}@Test
	public void KatalonTest() throws InterruptedException {
		katalonPage.getShopLink().click();
		katalonPage.getFirstProduct().click();
		katalonPage.getQuantityInput().clear();
		katalonPage.getQuantityInput().sendKeys("2");
		katalonPage.getAddToCartButton().click();
		Assert.assertTrue(katalonPage.doesMessageExist(), "Message doesn't exist!");
		Thread.sleep(1000);
		katalonPage.getViewCartButton().click();
		Thread.sleep(1000);
		Assert.assertTrue(katalonPage.isQuantity(), "Quantity doesn't match!");
		katalonPage.getRemoveButton().click();
		Assert.assertEquals(katalonPage.getCartEmptyMessage(), "Your cart is currently empty.");
	}

	@AfterMethod
	public void after() {
		driver.quit();
	}


Katalon Shop – Katalon Ecommerce
https://cms.demo.katalon.com

}
