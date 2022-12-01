package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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


    @Então("^eu vejo o código de desconto$")

    public void euVejoOCodigoDeDesconto() {
        homePage.euVejoOCodigoDeDesconto();

    }


}




