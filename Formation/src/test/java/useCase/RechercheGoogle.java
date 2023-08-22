package useCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RechercheGoogle {

	public static void main(String[] args) {
		//path driver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		// ouvrir navigateur
	    ChromeDriver driver = new ChromeDriver();
	    
		
	       // maximize window

	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


		//ouvrir URL
		driver.get("https://www.google.com/");
		
		// declaration des élément
		WebElement barre;
		
		//identification des éléments
	   barre=driver.findElementByName("q");
	   
	   //Action
	   barre.sendKeys("Tunisie");
	   barre.sendKeys(Keys.ENTER);
	   
	   
	   //Vérification
	   
	   String Url_obtenu;
	   Url_obtenu= driver.getCurrentUrl();
	   
	   
	   if (Url_obtenu.contains ("Tunisie")) {
	   System.out.println("Test OK");  }
	   else {System.out.println("Test ko");}
	   
	   
		
		
		
	}

}
