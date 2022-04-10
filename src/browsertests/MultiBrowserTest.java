package browsertests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

    static String browser = "chrome";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser Name");
        }

        //How to launch the URL in Selenium
        driver.get(baseUrl);

        //Print the current Title of the page
        String title = driver.getTitle();
        System.out.println("The current title of the page is: " + title);

        //Print the current URL
        String url = driver.getCurrentUrl();
        System.out.println("Current URL is: " + url);

        //Print the page source
        String pageSource = driver.getPageSource();
        System.out.println("The page source is :" + pageSource);

        //Enter the email in the email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("ccTiwari@hotmail.co.uk");

        //Enter the password in the password field
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("Asdfghjk12345678");

        //Close the browser
        driver.close();
    }
}
