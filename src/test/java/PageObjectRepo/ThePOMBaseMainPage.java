package PageObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThePOMBaseMainPage {
    WebDriver driver;
    //By theLogo = By.xpath("//span[@class='hmsprite logo']");
    By theLogo = By.cssSelector(".css-bqykk2 > .css-zc1vnn");
    By wishListButton_By = By.cssSelector(".css-5tv7te > .css-rlfxqc .css-zc1vnn");


    public ThePOMBaseMainPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public WebElement forLogo()
    {
        return driver.findElement(theLogo);
    }

    public WebElement wishListButton()
    {
        return driver.findElement(wishListButton_By);
    }


}

