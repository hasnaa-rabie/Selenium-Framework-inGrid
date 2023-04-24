package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    static WebDriver driver;

    @BeforeClass
    public void StartDriver()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--no-sandbox");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-extensions");
        options.addArguments("--incognito");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

       // driver.manage().window().maximize();
        driver.navigate().to("https://ssd-tni.svcs.eis.entsvcs.net/ssd20/newUI");
       // driver.findElement(By.xpath("//*[@id='details-button']")).click();
        //driver.findElement(By.id("proceed-link")).click();

    }

    @AfterClass
    public void CloseDriver()
    {
        driver.quit();
    }

}
