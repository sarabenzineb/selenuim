package useCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Liste_Deroulante {

	public static void main(String[] args) {
		// chemin de chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		// ouvrir navigateur
		ChromeDriver driver = new ChromeDriver();
				

		//ouvrir URL
		driver.get("https://demoqa.com/droppable");
		
		
       // maximize window

         driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/select-menu");
		
		
		WebElement liste;
		
		liste=driver.findElement(By.id("oldSelectMenu"));
		
		//Action
		
		Select select =new Select(liste);
		select.selectByValue("7");
		
		
		

	}

}
