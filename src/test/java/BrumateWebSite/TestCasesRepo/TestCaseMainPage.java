package BrumateWebSite.TestCasesRepo;

import BrumateWebSite.PageObjectRepo.ThePOMBaseMainPage;
import BrumateWebSite.PageObjectRepo.ThePOMBaseWishListPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCaseMainPage {

    WebDriver driver;

    @BeforeMethod
    public void setup1()
    {
        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriverSelenium\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.brumate.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    @Tag("Logo Verification Test")
    @DisplayName("Logo Verification Test")
    public void logoTest()
    {
        ThePOMBaseMainPage tlv=new ThePOMBaseMainPage(driver);
        WebElement element1 = tlv.forLogo();
        Boolean flag = element1.isDisplayed();
        Assert.assertTrue(flag);
    }

    @Test
    @DisplayName("Wish List Button Test")
    public void wishListButtonTest()
    {
        try {
            ThePOMBaseMainPage tvl = new ThePOMBaseMainPage(driver);
            tvl.wishListButton().click();
            ThePOMBaseWishListPage wlp = new ThePOMBaseWishListPage(driver);
            WebElement element2 = wlp.checkWishListMessage();
            Boolean flag2 = element2.isDisplayed();
            //Assert.assertTrue(flag2);
            if (flag2)
            {
                System.out.println("exito");
            }
            else
                System.out.println("No exito");
            }
        catch (Exception e)
        {
            System.out.println("Exceptions Caught"+ e.getMessage());
        }

    }


    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
