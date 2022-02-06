package d4_02;

public class Zadatak1 {

		WebDriver driver;
		@BeforeMethod
		public void before() {
			System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		@Test
		public void searchTest() {
			driver.get("https://www.kupujemprodajem.com/");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(By.className("kpBoxCloseButton")));
			driver.findElement(By.className("kpBoxCloseButton")).click();
			driver.findElement(By.name("data[keywords]")).sendKeys("Iphone");
			driver.findElement(By.name("data[keywords]")).sendKeys(Keys.ENTER);
			List<WebElement> brojStrana = driver.findElements(By.className("pagesList"));
			Assert.assertEquals(brojStrana.size(), 2);
		}
	}
	














	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
