package d_28_01;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");
		
		
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.xpath("//*[contains(@class, 'btn btn-info add-new')]")).click();
			System.out.println("Unesite ime");
			String ime=s.next();
			System.out.println("Unesite department");
			String dep=s.next();
			System.out.println("Unesite broj");
			String broj=s.next();
			driver.findElement(By.xpath("//input[(@id='name')]")).sendKeys(ime);
			driver.findElement(By.xpath("//input[(@id='department')]")).sendKeys(dep);
			driver.findElement(By.xpath("//input[(@id='phone')]")).sendKeys(broj);
			driver.findElement(By.xpath("//a[contains(@class, 'add')][contains(@style, 'inline')]")).click();


}
		driver.close();
		
		
		
		
		
		
		
		
	}

}

	}

}
