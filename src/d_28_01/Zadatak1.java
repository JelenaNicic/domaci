package d_28_01;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Maksimizirati prozor
//		Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
//		Od korisnika ucitati broj na koju zvezdicu je potrebno kliknuti (u rasponu od 1 do 5)
//		I izvrsite akciju klik na odgovarajuci element
//		Na kraju programa ugasite pretrazivac.
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://s.bootsnipp.com/iframe/WaXlr");
		List<WebElement>links =driver.findElements(By.xpath("//div[@id='rating-ability-wrapper']/button"));
		Scanner s=new Scanner(System.in);
        System.out.println("Unesite broj zvezdice");
        int zvezdica=s.nextInt();
        
    ///	driver.findElement(By.xpath(("//button[@id='submit']"))).click();
    	
		links.get(zvezdica-1).click();
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}

	}

}
