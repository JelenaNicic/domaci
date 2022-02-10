package d7_02_2022Zadatak2;

public class KatalonPage {
	private WebDriver driver;

	public KatalonPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getShopLink() {
		return this.driver.findElement(By.linkText("SHOP"));
	}

	public WebElement getFirstProduct() {
		return this.driver.findElement(By.xpath("//*[@id='main']/div[2]/ul/li[1]/div/a[1]"));
	}public WebElement getAddToCartButton() {
		return this.driver.findElement(By.name("add-to-cart"));
	}
	
	public WebElement getQuantityInput() {
		return this.driver.findElement(By.name("quantity"));
	}
	
	public WebElement getMessage() {
		return this.driver.findElement(By.xpath("//*[@id='main']/div[1]/div"));
	}
	
	public String getTextMessage() {
		return getMessage().getText();
	}
	
	public boolean doesMessageExist() {
		try {
			getTextMessage();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public WebElement getViewCartButton() {
		return this.driver.findElement(By.xpath("//*[contains(@class,'wc-forward')]"));
	}private WebElement getQuantity() {
		return this.driver.findElement(By.xpath("//td[@class='product-quantity']/div/input"));
	}

	public boolean isQuantity() {
		String value = getQuantity().getAttribute("value");
		if (value.equals("2")) {
			return true;
		} else {
			return false;
		}
	}

	public WebElement getRemoveButton() {
		return this.driver.findElement(By.xpath("//*[@id='post-8']/div/div/form/table/tbody/tr[1]/td[1]/a"));
	}

	public String getCartEmptyMessage() {
		return this.driver.findElement(By.xpath("//*[contains(@class,'cart-empty')]")).getText();

}
