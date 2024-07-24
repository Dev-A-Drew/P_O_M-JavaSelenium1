package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriverSelenium\\chromedriver-win64\\chromedriver.exe");  //Specify the location in machine where the driver is located
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.brumate.com/");
        // Maximizing the window
        driver.manage().window().maximize();
    }

}
