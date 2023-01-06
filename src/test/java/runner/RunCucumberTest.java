package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json","html:target/reports/"},
        features = "src/test/resources/features",
        tags = {"@gerar-cupom"},
        glue = {"steps"}
)
public class RunCucumberTest {

    public static WebDriver driver = new ChromeDriver();

   @BeforeClass
    public static void start(){
       driver = new ChromeDriver();
    }

   @AfterClass
    public static void stop(){
       driver.quit();
    }
}
