package TestCasesRepo;

import PageObjectRepo.ThePOMBaseMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class TestCaseLogoCheck1 {

    WebDriver driver;

    @BeforeMethod
    public void setup1()
    {
        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriverSelenium\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("https://www.rediff.com/");
        driver.get("https://www.brumate.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void testLogo()
    {
        ThePOMBaseMainPage tlv=new ThePOMBaseMainPage(driver);
        WebElement element1 = tlv.forLogo();
        Boolean flag = element1.isDisplayed();
        Assert.assertTrue(flag);
    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
