package ExempleCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RechercheGooglee {
	WebDriver driver;
	
	

@Given("ouvrir nnavigateur")
public void ouvrir_nnavigateur() {
	System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
}

@Given("ouvrir URL de Google {string}")
public void ouvrir_url_de_google(String string) {
    driver.get(string);
}

@When("Saisir le mot {string}")
public void saisir_le_mot(String string) {
    WebElement barre;
    barre=driver.findElement(By.name("q"));
    barre.sendKeys(string);
}
    

@When("cliquer sur Entrée")
public void cliquer_sur_entrée() {
	WebElement barre;
    barre=driver.findElement(By.name("q"));
    barre.sendKeys(Keys.ENTER);
    }

@Then("vérifier le résultat {string}")
public void vérifier_le_résultat(String string) {
    WebElement text;
    text=driver.findElement(By.id("result-stats"));
    String message;
    message=text.getText();
    
    if (message.contains(string))  {
    	System.out.println("test ok");
    }
    else {
    	System.out.println("test ko");
    }
    		
}



}
