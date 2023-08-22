package useCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentification {

	public static void main(String[] args) throws InterruptedException {
		// chemin de google driver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");

		// ouvrir navigateur
		ChromeDriver navigateur = new ChromeDriver();
		// maximize window

		navigateur.manage().window().maximize();

		// ouvrir URL

		navigateur.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// sleep
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// declaration des éléments

		WebElement user, mdp, bouton;

		// identification des elements
		user = navigateur.findElement(By.name("username"));
		mdp = navigateur.findElement(By.name("password"));
		bouton = navigateur
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

		// Actions

		user.sendKeys("Admin");
		mdp.sendKeys("admin123");
		bouton.click();

		// sleep
		
			Thread.sleep(5000);
	
		// verification résultat obtenu

		WebElement profil;
		profil = navigateur.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		String text;
		text = profil.getText();

		Assert.assertEquals("Paul Collings", text);

		System.out.println("TEstok");

		// close navigateur
       navigateur.close();
	}

}
