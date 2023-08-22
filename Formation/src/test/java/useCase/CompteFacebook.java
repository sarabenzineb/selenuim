package useCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CompteFacebook {

	public static void main(String[] args) {
		//path driver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		// ouvrir navigateur
	    ChromeDriver driver = new ChromeDriver();
	    
		
	       // maximize window

	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


		//ouvrir URL
		driver.get("https://www.facebook.com/");
		
		// declaration des élément
		WebElement bouton;
		
		//identification des éléments
	   bouton=driver.findElementByXPath( " //a[normalize-space()='Créer nouveau compte']");
	   
	   bouton.click();
	   
	   //déclaratio des éléments
	   WebElement prénom, nom, Email, confirmation,mdp,jour,mois,Année,genre, sinscrire;

		// identification des elements
		prénom = driver.findElement(By.name("firstname"));
		nom = driver.findElement(By.name("lastname"));
		Email=driver.findElement(By.name("reg_email__"));
	  	confirmation= driver.findElementByXPath("//input[@name='reg_email_confirmation__']");
	    mdp=driver.findElementByName("reg_passwd__");
		jour=driver.findElementByName("birthday_day");
		mois=driver.findElementByName("birthday_month");
		Année=driver.findElementById("year");
		genre=driver.findElementByXPath("//label[normalize-space()='Femme']");
		sinscrire=driver.findElementByXPath("//button[@name='websubmit']");
	

		// Actions

		prénom.sendKeys("Sara");
		nom.sendKeys("benzineb");
		Email.sendKeys("sarabenzineb@gmail12345.com");
	
		Actions action= new Actions (driver);
		action.keyDown(Email, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		action.keyDown(confirmation, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		mdp.sendKeys("compte12");
		Select select =new Select(jour);
		select.selectByValue("25");
		
		Select select2 =new Select(mois);
		select2.selectByVisibleText("jan");
		
		Select select3 =new Select(Année);
		select3.selectByValue("1991");
		
         
		genre.click();
	
		sinscrire.click();

	   
	   

	}

	}


