package BrumateWebSite.PageObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ThePOMBaseMainPage {
    private WebDriver driver;

    By announcementWidget = By.xpath("*[@id=\"ps-desktop-widget__close\"]");
    By theLogo = By.cssSelector(".css-bqykk2 > .css-zc1vnn");
    By wishListButton_By = By.cssSelector(".css-5tv7te > .css-rlfxqc .css-zc1vnn");

    By drinkwareDropbxBtn = By.xpath("*[@id=\"__next\"]/header/div[1]/nav/a[1]");
    By widgetPresent = By.xpath("*[@id=\"ps-desktop-widget__body\"]");

    By widgetCloseBtn = By.xpath("*[@id=\"ps-desktop-widget__close\"]/svg");

    public ThePOMBaseMainPage(WebDriver driver) {this.driver = driver;}

    public WebElement forLogo() {
        return driver.findElement(theLogo);
    }

    public WebElement wishListButton() {
        return driver.findElement(wishListButton_By);
    }

    public WebElement drinkwareBtn(){return driver.findElement(drinkwareDropbxBtn);}

    public boolean isWidgetPresent(){
        List<WebElement> widgets=driver.findElements(widgetPresent);
        return !widgets.isEmpty();}
    public WebElement clickCloseWidget(){
        return driver.findElement(widgetCloseBtn);
    }

}

