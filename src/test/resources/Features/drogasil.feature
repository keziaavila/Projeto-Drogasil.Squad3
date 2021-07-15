#Author: your.email@your.domain.com

Feature: Pesquisar no site Drogasil
 Eu como usuario quero acessar o site para realizar uma pesquisa

  Scenario: Pesquisar um produto
    Given que eu esteja no site "https://m2-stage.drogasil.com.br"
    When eu pesquiso um produto
    And eu mande ordenar por menor valor
    Then retorna resultados por valor do menor ao maior
    

  Scenario: Pesquisar um produto
    Given que eu esteja no site "https://m2-stage.drogasil.com.br"
    When eu pesquiso um produto inexistente
    Then retornar mensagem Nenhum Resultado Encontrado 
