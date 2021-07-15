package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	// Elementos Web
	
	private By cookie = By.cssSelector("#onetrust-accept-btn-handler");
	private By pesquisar = By.cssSelector("#searchHeader");
	private By ordenarpor = By.cssSelector("#__next > main > div > div:nth-child(2) > div > div > div > div.right-container > div > label > select");
	
	
	
	
	
	//Metodos publicos

	public By getCookie() {
		return cookie;
	}



	public By getPesquisar() {
		return pesquisar;
	}



	public By getOrdenarpor() {
		return ordenarpor;
	}
	
	
}