package useCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoseOver {

		
		
		public static void main(String[] args) throws InterruptedException {
			// chemin de chrome driver
			System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
			
			// ouvrir navigateur
					ChromeDriver navigateur = new ChromeDriver();
					

			//ouvrir URL
			navigateur.get("https://demoqa.com/menu");
			
			
	       // maximize window

	         navigateur.manage().window().maximize();
			
			//sleep
			Thread.sleep(5000);
			
			//déclaration des éléments
			
			WebElement Main1,Main2,Main3;
			

			//identification des éléments
			
		   Main2=navigateur.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
	
		   
		   
		   

		    //Action
		    Actions action=new Actions(navigateur);
		    
		
		    action.moveToElement(Main2);
		   
		    
		    
		    
		   
		   
	}

}
