package PageObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThePOMBaseWishListPage {

    WebDriver driver;


    By wishListEmptyMessage=By.xpath("//*[@id=\"__next\"]/div[2]/main/div/section[1]/div/div/div/p");
    By message1 = By.xpath("//*[text()='Explore Items to Add']");
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
}
