package projeto;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PesquisaGoogle {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public void before() {

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://google.com.br/");
        driver.manage().window().maximiza();

    }

}