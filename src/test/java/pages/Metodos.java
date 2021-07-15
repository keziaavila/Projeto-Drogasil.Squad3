package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
WebDriver driver;
	
	public void abrirNavergador(String site, String descricaoPasso) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		
	}
		
	public void test() throws InterruptedException {
	
	WebElement aceitar = driver.findElement(By.id("onetrust-accept-btn-handler"));
	
	}
	
	public void escrever(String texto, By elemento) {
		
		driver.findElement(elemento).sendKeys(texto);
	}
	
	public void submit(By elemento) {
		
		driver.findElement(elemento).submit();
	}
	
	public void clicar(By elemento, String descricao) {
		
		try {
		
		driver.findElement(elemento).click();
	
} catch (Exception e) {
	
	System.out.println("****** error ****** no passo " + descricao + " " + e);
}
	

	 
		
		
		
		
		
}
}
	
	
	