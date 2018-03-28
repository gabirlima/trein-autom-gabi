package projeto;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        driver.manage().window().maximize();
    }

    @Test
    public void comecandoOTesteAutomatizado(){

        WebElement campoBusca = driver.findElement(By.id("lst-ib"));
        campoBusca.sendKeys("avião");
        WebElement BotaoSubmit = driver.findElement(By.name("btnK"));
        BotaoSubmit.click();

        //wait = new WebDriverWait(driver, 10);
        WebElement qntdResultado = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
        Assert.assertEquals(true, qntdResultado.isDisplayed());

    }

    @After
    public void after(){

        driver.quit();
    }

}