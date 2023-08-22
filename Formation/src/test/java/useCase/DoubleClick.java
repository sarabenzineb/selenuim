package useCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// chemin de chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		// ouvrir navigateur
				ChromeDriver navigateur = new ChromeDriver();
				
		// maximize window

		navigateur.manage().window().maximize();
		
		//ouvrir URL
		navigateur.get("https://demoqa.com/buttons");
		
		//sleep
		Thread.sleep(5000);
		
		
		//déclaration des elements
		WebElement bouton;
		
		//identification des éléments
		
		bouton=navigateur.findElement(By.id("doubleClickBtn"));
		 
		//Action
		Actions action=new Actions(navigateur);
		action.doubleClick(bouton).perform();
		
		//sleep
		
		Thread.sleep(5000);
		
		//vérification des résultat
		WebElement message;
		message= navigateur.findElement(By.id("doubleClickMessage"));
		
		String text;
		text= message.getText();
		Assert.assertEquals("You have done a double click", text);
		
		WebElement rightclick;
		rightclick= navigateur.findElement(By.id("rightClickBtn"));
		action.contextClick(rightclick).perform();
		
		WebElement message2;
		message2=navigateur.findElement(By.id("rightClickMessage"));
		
		String text2;
		text2= message2.getText();
		Assert.assertEquals("You have done a right click", text2);
		
		
	
        
		
		Thread.sleep(5000);
		System.out.println("Test ok");
		navigateur.close();
	}

}