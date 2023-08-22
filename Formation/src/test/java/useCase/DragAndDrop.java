package useCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// chemin de chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		// ouvrir navigateur
				ChromeDriver navigateur = new ChromeDriver();
				

		//ouvrir URL
		navigateur.get("https://demoqa.com/droppable");
		
		
       // maximize window

         navigateur.manage().window().maximize();
		
		//sleep
		Thread.sleep(5000);
		
		//déclaration des éléments
		
		WebElement box;
		WebElement box2;
		
		
		//identification des éléments
		
	   box=navigateur.findElement(By.id("draggable"));
	   box2=navigateur.findElement(By.id("droppable"));
	   
	   

	   
	   
	    //Action
	    Actions action=new Actions(navigateur);
	 	action.dragAndDrop(box, box2).perform();
	 	
	 	WebElement message;
		message= navigateur.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		
		String text;
		text= message.getText();
		Assert.assertEquals("Dropped!", text);
		
		

		Thread.sleep(5000);
		System.out.println("Test ok");
		navigateur.close();
	 	
		
		
		
		
		
				

	}

}
