package BrumateWebSite.PageObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThePOMBaseWishListPage {

    WebDriver driver;
    By wishListEmptyMessage=By.xpath("//*[@id=\"__next\"]/div[2]/main/div/section[1]/div/div/div/p");
    By message1 = By.xpath("//*[text()='Explore Items to Add']");

    By bestSellerimage1 = By.xpath("//*[@id=\"__next\"]/div[2]/main/div/section[3]/div/div/div/div/div/div[1]/div/div[1]/a/div/picture");
    By bestSellerText1= By.xpath("//*[@id=\"__next\"]/div[2]/main/div/section/div/div/div/div/div[2]/div/div/div");
    public ThePOMBaseWishListPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public WebElement checkEmptyMessage()
    {
        return driver.findElement(wishListEmptyMessage);
    }
    public  WebElement checkWishListMessage()
    {
        return driver.findElement(message1);
    }

    public WebElement checkFunctionImgBestSeller1()
    {
        return driver.findElement(bestSellerimage1);
    }

    public WebElement verifyTextBestSeller1()
    {
        return driver.findElement(bestSellerText1);
    }

    public WebElement getTextBestSeller1()
    {
        return driver.findElement(bestSellerText1);
    }

}
