package BrumateWebSite.PageObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseClass {

    WebDriver driver;


//ADDING THE CONSTRUCTOR OF THE BaseClass
    public BaseClass(WebDriver driver){
        this.driver=driver;
    }


//ADDING THE CONNECTION TO THE CHROME DRIVER
    public WebDriver chromeDriverConnection(){
        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriverSelenium\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }


//ADDING METHOD findElement TO USE WITH Locator
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

//ADDING METHOD findElements TO USE IN A LIST
    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }


//ADDING METHOD getText TO GET THE TEXT RESPONSE FROM THE WEBSITE
    public String getText(WebElement element) {
        return element.getText();
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void typeCharacters(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }


//ADDING METHOD sendClick TO SEND CLICKS
    public void sendClick(By locator){
        driver.findElement(locator).click();
    }


//ADDING METHOD isElementDisplayed TO CHECK IF ELEMENTS ARE PRESENT
    public boolean isElementDisplayed(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
            }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }


//ADDING METHOD visitSite TO SEND THE URL AND NAVIGATE TO WEBSITE
    public void visitSite(String url){
        driver.get(url);
    }


}
