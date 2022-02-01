package d31_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.navigate().to("https://geodata.solutions/");
		Select country = new Select(driver.findElement(By.id("countryId")));
		country.selectByVisibleText("Austria");
		
		Select state=new Select(driver.findElement(By.id("stateId")));
        state.selectByVisibleText("Vienna");
		
        Select city=new Select(driver.findElement(By.id("cityId")));
        city.selectByVisibleText("Vienna");
		
		
		
		
		
		
		
		
		
		
	}

}

	}

}
