package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public void acessarAplicacao(){
        driver.get("https://www.qazando.com.br/curso.html");
        driver.manage().window().maximize();
        Assert.assertTrue("Não acessou a aplicação", driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void apertarEnter(){
        driver.findElement(By.id("button")).sendKeys(Keys.ENTER);
    }

    public void preencherEmail(){
        driver.findElement(By.id("email")).sendKeys("uelton.gomes@uol.com.br");

    }

    public void euVejoOCodigoDeDesconto(){
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 >span")).getText();
        Assert.assertEquals("O cupom está errado","QAZANDO15OFF",texto_cupom);
    }
}
