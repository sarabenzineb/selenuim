package ExempleCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreationnNvCompteFb {
	
	
	WebDriver driver;

@Given("ouvrir navigateurrr")
public void ouvrir_navigateurrr() {
	System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   
}

@Given("ouvrir url de la page facebook {string}")
public void ouvrir_url_de_la_page_facebook(String string) {
	driver.get(string);
 
	
}

@When("cliquer sur le bouton créer un nouveau compte")
public void cliquer_sur_le_bouton_créer_un_nouveau_compte() {
	WebElement bouton;
	  bouton=driver.findElement(By.xpath( " //a[normalize-space()='Créer nouveau compte']"));
      bouton.sendKeys(Keys.ENTER);
	
}

@When("taper le nom {string}")
public void taper_le_nom(String string) {
	
	    WebElement nom;
	    nom=driver.findElement(By.name("firstname"));
	    nom.sendKeys(string);
  
}

@When("taper le prénom {string}")
public void taper_le_prénom(String string) {
	  WebElement prenom;
	    prenom=driver.findElement(By.name("lastname"));
	    prenom.sendKeys(string);
	
}

@When("taper adresse mail valide {string}")
public void taper_adresse_mail_valide(String string) {
   
	 WebElement Email;
	 Email=driver.findElement(By.name("reg_email__"));
	 Email.sendKeys(string);
	
}

@When("copier coller adresse mail pour confirmation {string}")
public void copier_coller_adresse_mail_pour_confirmation(String string) {
	
	 WebElement confirmation,Email;
	 Email=driver.findElement(By.name("reg_email__"));
	 confirmation=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	Actions action= new Actions (driver);
	action.keyDown(Email, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		
	action.keyDown(confirmation, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	
}

@When("taper le mot de passe {string}")
public void taper_le_mot_de_passe(String string) {
   WebElement mdp;
   mdp=driver.findElement(By.name("reg_passwd__"));
   mdp.sendKeys(string);
	
}

@When("faire entrer la valeur de la date de naissance\"{int}\"")
public void faire_entrer_la_valeur_de_la_date_de_naissance(Integer int1) {
	WebElement jour;
	jour=driver.findElement(By.name("birthday_day"));
	Select select =new Select(jour);
	select.selectByValue("25");
 	
}

@When("faire entrer le mois de naissance {string}")
public void faire_entrer_le_mois_de_naissance(String string) {
	WebElement mois;
	mois=driver.findElement(By.name("birthday_month"));
	Select select2 =new Select(mois);
	select2.selectByVisibleText("jan");
   
	
}

@When("faire entrer année de naissance {string}")
public void faire_entrer_année_de_naissance(String string) {
	WebElement Année;
	Année=driver.findElement(By.id("year"));
	Select select3 =new Select(Année);
	select3.selectByValue("1991");
  
	
}

@When("choisir le genre")
public void choisir_le_genre() {
	WebElement genre;
	genre=driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
  
	genre.click();
}

@When("cliquer sur le bouton sinscrire")
public void cliquer_sur_le_bouton_sinscrire() {
	WebElement sinscrire;
	sinscrire=driver.findElement(By.xpath("//button[@name='websubmit']"));
	sinscrire.click();
	
	
	
	
}

@Then("création dun nouveau compte facebook")
public void création_dun_nouveau_compte_facebook() {
   System.out.println("test ok");
}


}
