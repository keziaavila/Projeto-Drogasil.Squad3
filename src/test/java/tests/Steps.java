package tests;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {

		metodos.abrirNavergador(site, "acessar o site Drogasil");

	}

	@When("eu pesquiso um produto")
	public void eu_pesquiso_um_produto() {

		metodos.escrever("fralda", el.getPesquisar());
		metodos.submit(el.getPesquisar());

	}

	@When("eu mande ordenar por menor valor")
	public void eu_mande_ordenar_por_menor_valor() {

		metodos.submit(el.getOrdenarpor());
		metodos.clicar(el.getOrdenarpor(), "preço");

	}

	@Then("retorna resultados por valor do menor ao maior")
	public void retorna_resultados_por_valor_do_menor_ao_maior() {

	}

	@When("eu pesquiso um produto inexistente")
	public void eu_pesquiso_um_produto_inexistente() {
		
		metodos.escrever("televisão", el.getPesquisar());
		metodos.submit(el.getPesquisar());
		
	}

	@Then("retornar mensagem Nenhum Resultado Encontrado")
	public void retornar_mensagem_nenhum_resultado_encontrado() {
		
		System.out.println("Nenhum Resultado Encontrado");
		
	}
}
