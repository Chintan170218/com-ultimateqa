package browsertests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {

    public static void main(String[] args) {

        //Website URL
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        //Setting the drivers
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        //Creating "driver" object
        WebDriver driver = new FirefoxDriver();

        //Launch URL
        driver.get(baseUrl);

        //Print title of the page
        String title = driver.getTitle();
        System.out.println("The title of the page is: " + title);

        //Print the current URL
        String url = driver.getCurrentUrl();
        System.out.println("The current URL of the page is: " + url);

        //Print the page source
        String pageSource = driver.getPageSource();
        System.out.println("The page source of the page is: " + pageSource);

        //Enter email in the email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("ccTiwari@hotmail.co.uk");

        //Enter password in the password field
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("Adfghjk12345678");

        //Close browser
        driver.close();


    }
}
