package BrumateWebSite.TestCasesRepo;

import BrumateWebSite.PageObjectRepo.ThePOMBaseWishListPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCaseWishList {

    WebDriver driver;

    @BeforeMethod
    public void setup2()
    {
        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriverSelenium\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.brumate.com/pages/wishlist");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    public void bestSellersOptionTest() {
        try {
            ThePOMBaseWishListPage bsot = new ThePOMBaseWishListPage(driver);
            bsot.checkFunctionImgBestSeller1().click();
            if (bsot.verifyTextBestSeller1().isDisplayed()) {
                System.out.println("Text found in Best Seller page is: \n"+bsot.getTextBestSeller1().getText());
            } else {
                System.out.println("Algo fallo, revisa el test bestSellerOptionTest");
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception has been caught"+ e.getMessage());
        }

    }
    @AfterMethod
    public void tearDown()
    {driver.quit();
    }
}
