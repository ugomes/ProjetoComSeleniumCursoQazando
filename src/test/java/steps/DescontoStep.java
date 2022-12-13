package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;

public class DescontoStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Dado("^que estou no site da Qazando$")
    public void acessarSiteQazand(){
        homePage.acessarAplicacao();

    }
    @Quando("^eu preencho meu e-mail$")
    public void euPreenchoMeuEmail()  {
        homePage.preencherEmail();

    }

    @E("^aperto a tecla Enter$")
    public void apertoATeclaEnter() {
        homePage.apertarEnter();
    }


    @Entao("^eu vejo o código de desconto$")

    public void euVejoOCodigoDeDesconto() {
        homePage.euVejoOCodigoDeDesconto();

    }


}




